package sit707;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import java.util.List;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.DisplayName;

public class TestTaskSubmissions<TaskInbox> {

    @Test
    @DisplayName("Test retrieving submitted tasks")
    void testGetSubmittedTasks() {
    	Tasksubmissions taskInbox = new Tasksubmissions();
        List<Task> tasks = taskInbox.getSubmittedTasks("student123");
        
        assertNotNull(tasks);
        assertEquals(3, tasks.size());

        Task task1 = tasks.get(0);
        assertEquals("Math Assignment", task1.getTitle());
        assertEquals("2024-05-20", task1.getSubmissionDate());
        assertEquals("Reviewed", task1.getFeedbackStatus());

        Task task2 = tasks.get(1);
        assertEquals("Science Project", task2.getTitle());
        assertEquals("2024-05-18", task2.getSubmissionDate());
        assertEquals("Pending", task2.getFeedbackStatus());

        Task task3 = tasks.get(2);
        assertEquals("History Essay", task3.getTitle());
        assertEquals("2024-05-15", task3.getSubmissionDate());
        assertEquals("Completed", task3.getFeedbackStatus());
    }
}
