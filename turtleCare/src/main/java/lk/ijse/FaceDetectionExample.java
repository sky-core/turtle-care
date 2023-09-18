package lk.ijse;

import org.opencv.core.*;
import org.opencv.highgui.HighGui;
import org.opencv.imgproc.Imgproc;
import org.opencv.objdetect.CascadeClassifier;
import org.opencv.videoio.VideoCapture;
import org.opencv.videoio.Videoio;

public class FaceDetectionExample {
    public static void faceDetection() {
        System.loadLibrary(Core.NATIVE_LIBRARY_NAME);

        // Load the Haar Cascade classifier for face detection
        String xmlPath = System.getProperty("user.dir") + "\\turtle-care\\turtleCare\\src\\main\\resources\\haarcascade_frontalface_default.xml";
        CascadeClassifier faceDetector = new CascadeClassifier(xmlPath);

        //CascadeClassifier faceDetector = new CascadeClassifier(FaceDetectionExample.class
                //.getResource("assets/haarcascade_frontalface_default.xml").getPath());

        // Open the default camera (usually 0) or specify the camera index you want to use
        VideoCapture capture = new VideoCapture(0);

        if (!capture.isOpened()) {
            System.out.println("Camera not found!");
            return;
        }

        // Set the camera frame width and height
        capture.set(Videoio.CAP_PROP_FRAME_WIDTH, 640);
        capture.set(Videoio.CAP_PROP_FRAME_HEIGHT, 480);

        Mat frame = new Mat();

        while (true) {
            // Read a frame from the camera
            capture.read(frame);

            // Convert the frame to grayscale for face detection
            Mat gray = new Mat();
            Imgproc.cvtColor(frame, gray, Imgproc.COLOR_BGR2GRAY);

            // Detect faces in the grayscale frame
            MatOfRect faceDetections = new MatOfRect();
            faceDetector.detectMultiScale(gray, faceDetections);

            // Draw rectangles around the detected faces
            for (Rect rect : faceDetections.toArray()) {
                Imgproc.rectangle(
                        frame,
                        new Point(rect.x, rect.y),
                        new Point(rect.x + rect.width, rect.y + rect.height),
                        new Scalar(0, 255, 0),
                        2
                );
            }

            // Display the frame with detected faces
            HighGui.imshow("Face Detection", frame);
            int key = HighGui.waitKey(30);

            // Exit the loop when the 'q' key is pressed
            if (key == 'q') {
                break;
            }
        }

        // Release the camera and close the OpenCV HighGui window
        capture.release();
        HighGui.destroyAllWindows();
    }
}
