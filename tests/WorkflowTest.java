package tests;

import static org.junit.Assert.*;
import org.junit.*;

import src.Petition;
import src.Workflow;

public class WorkflowTest {
    private Workflow workflow;

    @Before // create a new workflow object to test with
    public void create() {
        workflow = new Workflow();
    }

    /**
     * testAddToReviewQueue()
     *
     * parameters:
     *
     * Notes:
     *  This test creates a new petition to add to the review queue.
     *  It stores the size before and after adding object to queue.
     *  Test fails if the new queue size does not equal the old queue size plus one.
     */
    @Test
    public void testAddToReviewQueue() {
        Petition newPetition = new Petition();

        int currentSize = workflow.getReviewQueue().size();
        int newSize = workflow.getReviewQueue().size();

        assertEquals(currentSize + 1, newSize);
    }

    /**
     * testAddToRApprovalQueue()
     *
     * parameters:
     *
     * Notes:
     *  This test creates a new petition to add to the approval queue.
     *  It stores the size before and after adding object to queue.
     *  Test fails if the new queue size does not equal the old queue size plus one.
     */
    @Test
    public void testAddToApprovalQueue() {
        Petition newPetition = new Petition();

        int currentSize = workflow.getApprovalQueue().size();
        int newSize = workflow.getApprovalQueue().size();

        assertEquals(currentSize + 1, newSize);
    }

    /**
     * testRemoveFromReviewQueue()
     *
     * parameters:
     *
     * Notes:
     *  This test creates a new petition to add to the review queue.
     *  It stores the size after adding the object to the queue.
     *  removeFromReviewQueue() is called, attempting to remove item from queue.
     *  It stores the new size after attempting to remove object from queue.
     *  Test fails if new size does not equal old size minus 1.
     *  **Will not work until after add to queue function is complete**
     */
    @Test
    public void testRemoveFromReviewQueue() {
        Petition newPetition = new Petition();

        workflow.addToReviewQueue(newPetition);

        int currentSize = workflow.getReviewQueue().size();

        workflow.removeFromReviewQueue();

        int newSize = workflow.getReviewQueue().size();

        assertEquals(currentSize - 1, newSize);
    }

    /**
     * testRemoveFromApprovalQueue()
     *
     * parameters:
     *
     * Notes:
     *  This test creates a new petition to add to the approval queue.
     *  It stores the size after adding the object to the queue.
     *  removeFromApprovalQueue() is called, attempting to remove item from queue.
     *  It stores the new size after attempting to remove object from queue.
     *  Test fails if new size does not equal old size minus 1.
     *  **Will not work until after add to queue function is complete**
     */
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

