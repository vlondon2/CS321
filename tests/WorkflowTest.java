package tests;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import src.Workflow;

public class WorkflowTest {
    private Workflow workflow;

    @Before
    public void create() {
        workflow = new Workflow();
    }
    
    @Test
    public void testAddToReviewQueue() {
        int currentSize = workflow.getReviewQueue().size();
        int returnResult = workflow.addToReviewQueue();
        int newSize = workflow.getReviewQueue().size();

        assertEquals(currentSize + 1, newSize);
        assertEquals(1, returnResult);
    }

    @Test
    public void testAddToApprovalQueue() {
        int currentSize = workflow.getApprovalQueue().size();
        int returnResult = workflow.addToApprovalQueue();
        int newSize = workflow.getApprovalQueue().size();

        assertEquals(currentSize + 1, newSize);
        assertEquals(1, returnResult);
    }
}
