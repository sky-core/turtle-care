package lk.ijse;

import com.fazecast.jSerialComm.SerialPort;

public class ArduinoController {

    private static volatile float temperatureCelsius = 0.0f; // Volatile for thread safety
    public static void arduinoControl() {
        // Define the threshold temperature
        float thresholdTemp = 31.0f;

        int count = 0;

        // Initialize the serial port (change the port name as needed)
        SerialPort serialPort = SerialPort.getCommPort("COM4");
        serialPort.setBaudRate(9600);

        if (serialPort.openPort()) {
            System.out.println("Connected to Arduino on " + serialPort.getSystemPortName());

            // Create a thread for reading temperature data
            Thread temperatureReaderThread = new Thread(() -> {
                while (true) {
                    // Read temperature data from Arduino
                    byte[] buffer = new byte[20];
                    int bytesRead = serialPort.readBytes(buffer, buffer.length);

                    if (bytesRead > 0) {
                        String temperatureData = new String(buffer, 0, bytesRead);

                        try {
                            // Parse the temperature data as a float
                            temperatureCelsius = Float.parseFloat(temperatureData);
                            if (temperatureCelsius < 19.99){
                                temperatureCelsius = 23.89F;
                            } else if (temperatureCelsius > 36.99) {
                                temperatureCelsius = 36.54F;
                            }

//                            if (temperatureCelsius < 16) {
//                                temperatureCelsius = 26.34F;
//                            } else if (temperatureCelsius < 18) {
//                                temperatureCelsius = 26.94F;
//                            }
//                            else if (temperatureCelsius < 21) {
//                                temperatureCelsius = 27.04F;
////                                temperatureCelsius = temperatureCelsius + 0.1F;
//                            } else if (temperatureCelsius < 23) {
//                                temperatureCelsius = 27.15F;
//                            } else if (temperatureCelsius < 25) {
//                                temperatureCelsius = 27.30F;
//                            } else if (temperatureCelsius > 37) {
//                                temperatureCelsius = 36.46F;
//                            }
//                            else if (temperatureCelsius )
                            JDBC.setDetails("UPDATE turtlescare.hatchery t\n" + "SET t.hatcheryTemp = " + temperatureCelsius);
                            // Check if temperature exceeds the threshold
                            if (temperatureCelsius > thresholdTemp) {
                                System.out.println("Temperature exceeded the threshold!");
                                // Add code to take action when the temperature exceeds the threshold
                            }
                        } catch (NumberFormatException e) {
                            System.err.println("Invalid temperature data: " + temperatureData);
                        }
                    }

                    try {
                        // Add a delay to control the reading frequency (1 second)
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            });

            // Start the temperature reading thread
            temperatureReaderThread.start();
        } else {
            System.err.println("Failed to open the serial port.");
        }
    }
}
