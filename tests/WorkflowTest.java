package tests;

import static org.junit.Assert.*;
import org.junit.*;

import src.Petition;
import src.Workflow;

import java.util.Queue;

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
     *  This test stores the size before and after adding object to queue.
     *  Test fails if the new queue size does not equal the old queue size plus one.
     */
    @Test
    public void testAddToReviewQueueIncrement() {
        int currentSize = workflow.getReviewQueue().size();
        workflow.addToReviewQueue(newPetition.getaNumber());
        int newSize = workflow.getReviewQueue().size();

        assertEquals(currentSize + 1, newSize);
    }

    /**
     *  This test adds a petition to the workflow
     *  Test fails if not successfully dded to queue
     */
    @Test
    public void testAddToReviewQueueReturn() {
        int result = workflow.addToReviewQueue(newPetition.getaNumber());

        assertEquals(1, result);
    }

    /**
     *  This test stores the size before and after adding object to queue.
     *  Test fails if the new queue size does not equal the old queue size plus one.
     */
    @Test
    public void testAddToApprovalQueueIncrement() {
        int currentSize = workflow.getApprovalQueue().size();
        workflow.addToApprovalQueue(newPetition.getaNumber());
        int newSize = workflow.getApprovalQueue().size();

        assertEquals(currentSize + 1, newSize);
    }

    /**
     *  This test adds a petition to the workflow
     *  Test fails if not successfully dded to queue
     */
    @Test
    public void testAddToApprovalQueueReturn() {
        int result = workflow.addToApprovalQueue(newPetition.getaNumber());

        assertEquals(1, result);
    }

    /**
     *  This test adds a new petition to queue.
     *  Test fails if return from removal function is false.
     */
    @Test
    public void testRemoveFromReviewQueueReturnNotNull() {
        workflow.addToReviewQueue(newPetition.getaNumber());
        Petition returnResult = workflow.removeFromReviewQueue();

        assertNotNull(returnResult);
    }

    /**
     *  This test adds a new petition to queue.
     *  Test fails if returned type in not a petition object.
     */
    @Test
    public void testRemoveFromReviewQueueReturnResult() {
        workflow.addToReviewQueue(newPetition.getaNumber());
        Petition returnResult = workflow.removeFromReviewQueue();

        assertEquals(newPetition, returnResult);
    }

    /**
     *  This test adds a new petition to the queue.
     *  It stores the size after adding the object to the queue.
     *  removeFromReviewQueue() is called, attempting to remove item from queue.
     *  It stores the new size after attempting to remove object from queue.
     *  Test fails if new size does not equal old size minus 1.
     *  **Will not work until after add to queue function is complete**
     */
    @Test
    public void testRemoveFromReviewQueueDecrement() {
        workflow.addToReviewQueue(newPetition.getaNumber());
        int currentSize = workflow.getReviewQueue().size();
        Petition returnResult = workflow.removeFromReviewQueue();
        int newSize = workflow.getReviewQueue().size();

        assertEquals(currentSize - 1, newSize);
    }

    /**
     *  This test adds a new petition to queue.
     *  Test fails if return from removal function is false.
     */
    @Test
    public void testRemoveFromApprovalQueueReturnNotNull() {
        workflow.addToApprovalQueue(newPetition.getaNumber());
        Petition returnResult = workflow.removeFromApprovalQueue();

        assertNotNull(returnResult);
    }

    /**
     *  This test adds a new petition to queue.
     *  Test fails if returned type in not a petition object.
     */
    @Test
    public void testRemoveFromApprovalQueueReturnResult() {
        workflow.addToApprovalQueue(newPetition.getaNumber());
        Petition returnResult = workflow.removeFromApprovalQueue();

        assertEquals(newPetition, returnResult);
    }

    /**
     *  This test adds a new petition to the queue.
     *  It stores the size after adding the object to the queue.
     *  removeFromReviewQueue() is called, attempting to remove item from queue.
     *  It stores the new size after attempting to remove object from queue.
     *  Test fails if new size does not equal old size minus 1.
     *  **Will not work until after add to queue function is complete**
     */
    @Test
    public void testRemoveFromApprovalQueueDecrement() {
        workflow.addToApprovalQueue(newPetition.getaNumber());
        int currentSize = workflow.getApprovalQueue().size();
        Petition returnResult = workflow.removeFromApprovalQueue();
        int newSize = workflow.getApprovalQueue().size();

        assertEquals(currentSize - 1, newSize);
    }

    /**
     *  This test checks the return type.
     *  Test fails if returned type is null.
     */
    @Test
    public void testGetReviewQueueNotNull() {
        Queue<String> queue = workflow.getReviewQueue();

        assertNotNull(queue);
    }

    /**
     *  This test checks the return type.
     *  Test fails if returned type is null.
     */
    @Test
    public void testGetApprovalQueueNotNull() {
        Queue<String> queue = workflow.getApprovalQueue();

        assertNotNull(queue);
    }
}

