package sit707;

import java.util.ArrayList;
import java.util.List;

// Class to represent an individual task
class Task {
    private String title;
    private String submissionDate;
    private String feedbackStatus;

    public Task(String title, String submissionDate, String feedbackStatus) {
        this.title = title;
        this.submissionDate = submissionDate;
        this.feedbackStatus = feedbackStatus;
    }

    public String getTitle() {
        return title;
    }

    public String getSubmissionDate() {
        return submissionDate;
    }

    public String getFeedbackStatus() {
        return feedbackStatus;
    }
}

// Class to handle the task inbox functionality
public class Tasksubmissions {

    // Method to get submitted tasks for a specific student
    public List<Task> getSubmittedTasks(String studentId) {
        // This is a stub implementation. Replace with actual data retrieval logic.
        List<Task> tasks = new ArrayList<>();
        tasks.add(new Task("Math Assignment", "2024-05-20", "Reviewed"));
        tasks.add(new Task("Science Project", "2024-05-18", "Pending"));
        tasks.add(new Task("History Essay", "2024-05-15", "Completed"));
        return tasks;
    }

    public static void main(String[] args) {
        Tasksubmissions taskInbox = new Tasksubmissions();
        List<Task> tasks = taskInbox.getSubmittedTasks("student123");

        System.out.println("Submitted Tasks:");
        for (Task task : tasks) {
            System.out.println("Title: " + task.getTitle());
            System.out.println("Submission Date: " + task.getSubmissionDate());
            System.out.println("Feedback Status: " + task.getFeedbackStatus());
            System.out.println();
        }
    }
}
