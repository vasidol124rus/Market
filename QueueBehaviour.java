public interface QueueBehaviour {
    void takeInQueue(Client actor);
    void takeOrder();
    void giveOrder();
    void releaseFromQueue();
}