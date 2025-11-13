package H3_CoR;

public abstract class Access {
    private AccessLevels priorityLevel;
    private Access nextAccess;

    public Access(AccessLevels piorityLevel) {
        this.priorityLevel = piorityLevel;
    }

    public void setNextPriorityLevel(Access nextAccess) {
        this.nextAccess = nextAccess;
    }

    public void accessManager(Person person) {
        if (nextAccess != null) {
            nextAccess.processRequest(person);
        }
    }

    public abstract void processRequest(Person request);

}
