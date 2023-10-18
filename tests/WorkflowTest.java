package tests;

import static org.junit.Assert.*;
import org.junit.*;

import src.Petition;
import src.Workflow;

public class WorkflowTest {
    private Workflow workflow;
    private Petition newPetition;

    /**
     * Before each test, create a workflow and petition object
     */
    @Before // create a new workflow object to test with
    public void createObjectsForTests() {
        workflow = new Workflow();
        newPetition = new Petition();
    }

    /**
     * test name:  testAddToReviewQueue()
     * parameters: none
     * Notes:
     *  This test creates a new petition to add to the review queue.
     *  It stores the size before and after adding object to queue.
     *  Test fails if the new queue size does not equal the old queue size plus one.
     */
    @Test
    public void testAddToReviewQueue() {
        int currentSize = workflow.getReviewQueue().size();
        workflow.addToReviewQueue(newPetition);
        int newSize = workflow.getReviewQueue().size();

        assertEquals(currentSize + 1, newSize);
    }

    /**
     * test name:  testAddToRApprovalQueue()
     * parameters: none
     * Notes:
     *  This test creates a new petition to add to the approval queue.
     *  It stores the size before and after adding object to queue.
     *  Test fails if the new queue size does not equal the old queue size plus one.
     */
    @Test
    public void testAddToApprovalQueue() {
        int currentSize = workflow.getApprovalQueue().size();
        workflow.addToApprovalQueue(newPetition);
        int newSize = workflow.getApprovalQueue().size();

        assertEquals(currentSize + 1, newSize);
    }

    /**
     * test name:  testRemoveFromReviewQueue()
     * parameters: none
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
        workflow.addToReviewQueue(newPetition);
        int currentSize = workflow.getReviewQueue().size();
        workflow.removeFromReviewQueue();
        int newSize = workflow.getReviewQueue().size();

        assertEquals(currentSize - 1, newSize);
    }

    /**
     * test name:  testRemoveFromApprovalQueue()
     * parameters: none
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
        workflow.addToApprovalQueue(newPetition);
        int currentSize = workflow.getApprovalQueue().size();
        workflow.removeFromApprovalQueue();
        int newSize = workflow.getApprovalQueue().size();

        assertEquals(currentSize - 1, newSize);
    }
}

