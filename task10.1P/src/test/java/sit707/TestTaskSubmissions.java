package sit707;



import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class TestTaskSubmissions {
    public TestTaskSubmissions() {
    }

    @Test
 
    void testAnswerToAll() {
    	Tasksubmissions superComputer = new Tasksubmissions();
        assertEquals(42, superComputer.answer_to_the_ultimate_question_of_life_the_universe_and_everything());
    }
}
