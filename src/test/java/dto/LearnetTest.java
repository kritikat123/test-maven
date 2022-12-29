package dto;


import org.example.dto.Learner;
import org.junit.Assert;
import org.junit.Test;

public class LearnetTest {

    @Test
    public void testGetLearner() {

        Learner learner = new Learner("kt");
        Assert.assertEquals("The caller is : kt", learner.getId());
    }

}
