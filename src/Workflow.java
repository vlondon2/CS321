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

    public int addToReviewQueue(Petition petition) {
        //reviewQueue.add(petition);
        return 0;
    }

    public int addToApprovalQueue(Petition petition) {
        //approvalQueue.add(petition);
        return 0;
    }

    public Petition removeFromReviewQueue() {

        //return reviewQueue.remove();
        return null;
    }

    public Petition removeFromApprovalQueue() {

        //return approvalQueue.remove();
        return null;
    }

    public Queue<String> getReviewQueue() {
        return reviewQueue;
    }

    public Queue<String> getApprovalQueue() {
        return approvalQueue;
    }
}
