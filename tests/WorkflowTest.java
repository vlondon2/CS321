package tests;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import src.Petition;
import src.Workflow;

public class WorkflowTest {
    private Workflow workflow;

    @Before
    public void create() {
        workflow = new Workflow();
    }
    
    @Test
    public void testAddToReviewQueue() {
        Petition newPetition = new Petition();

        int currentSize = workflow.getReviewQueue().size();
        int returnResult = workflow.addToReviewQueue(newPetition);
        int newSize = workflow.getReviewQueue().size();

        assertEquals(currentSize + 1, newSize);
        assertEquals(1, returnResult);
    }

    @Test
    public void testAddToApprovalQueue() {
        Petition newPetition = new Petition();

        int currentSize = workflow.getApprovalQueue().size();
        int returnResult = workflow.addToApprovalQueue(newPetition);
        int newSize = workflow.getApprovalQueue().size();

        assertEquals(currentSize + 1, newSize);
        assertEquals(1, returnResult);
    }

    @Test
    public void testRemoveFromReviewQueue() {
        Petition newPetition = new Petition();

        workflow.addToReviewQueue(newPetition);

        int currentSize = workflow.getReviewQueue().size();

        workflow.removeFromReviewQueue();

        int newSize = workflow.getReviewQueue().size();

        assertEquals(currentSize - 1, newSize);
    }

    @Test
    public void testRemoveFromApprovalQueue() {
        Petition newPetition = new Petition();

        workflow.addToApprovalQueue(newPetition);

        int currentSize = workflow.getApprovalQueue().size();

        workflow.removeFromApprovalQueue();

        int newSize = workflow.getApprovalQueue().size();

        assertEquals(currentSize - 1, newSize);
    }
}

