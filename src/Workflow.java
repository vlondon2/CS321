package src;

import java.util.LinkedList;
import java.util.Queue;

public class Workflow {
    private Queue<String> reviewQueue;
    private Queue<String> approvalQueue;

    public Workflow() {
        reviewQueue = new LinkedList<>();
        approvalQueue = new LinkedList<>();
    }

    /**
     * The function adds a petition to the workflow review queue
     *
     * @param aNumber Holds the petition to add
     * @return returns 1 if added successfully, 0 if not
     */
    public int addToReviewQueue(String aNumber) {
        //reviewQueue.add(aNumber);
        return 0;
    }

    /**
     * The function adds a petition to the workflow approval queue
     *
     * @param aNumber Holds the petition to add
     * @return returns 1 if added successfully, 0 if not
     */
    public int addToApprovalQueue(String aNumber) {
        //approvalQueue.add(aNumber;
        return 0;
    }

    /**
     * The function removes a petition from the workflow review queue
     * and passes it to the caller.
     *
     * @return returns removed petition
     */
    public Petition removeFromReviewQueue() {

        //return reviewQueue.remove();
        return null;
    }

    /**
     * The function removes a petition from the workflow approval queue
     * and passes it to the caller.
     *
     * @return returns removed petition
     */
    public Petition removeFromApprovalQueue() {

        //return approvalQueue.remove();
        return null;
    }

    /**
     * used for workflow junit test
     *
     * @return returns review queue object
     */
    public Queue<String> getReviewQueue() {
        return null;
        //return reviewQueue;
    }

    /**
     * used for workflow junit test
     *
     * @return returns approval queue object
     */
    public Queue<String> getApprovalQueue() {
        return null;
        //return approvalQueue;
    }
}
