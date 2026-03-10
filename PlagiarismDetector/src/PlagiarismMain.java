/**
 * PlagiarismMain
 *
 * Driver program for plagiarism detection.
 */

public class PlagiarismMain {

    public static void main(String[] args) {

        PlagiarismDetector detector = new PlagiarismDetector();

        detector.addDocument("doc1", "this is a sample plagiarism detection test");

        System.out.println(detector.check("this is a sample plagiarism detection"));
    }
}