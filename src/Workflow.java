package src;

import java.util.LinkedList;
import java.util.Queue;

public class Workflow {
    private Queue<Petition> reviewQueue;
    private Queue<Petition> approvalQueue;

    public Workflow() {
        reviewQueue = new LinkedList<>();
        approvalQueue = new LinkedList<>();
    }

    public int addToReviewQueue() {
        return 0;
    }

    public int addToApprovalQueue() {
        return 0;
    }

    public int removeFromReviewQueue() {
        return 0;
    }

    public int removeFromApprovalQueue() {
        return 0;
    }

    public Queue<Petition> getReviewQueue() {
        return reviewQueue;
    }

    public Queue<Petition> getApprovalQueue() {
        return approvalQueue;
    }
}
