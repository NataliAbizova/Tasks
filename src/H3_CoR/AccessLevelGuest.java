package H3_CoR;

 class AccessLevelGuest extends Access {

     AccessLevelGuest(AccessLevels priorityLevel) {
        super(priorityLevel);
    }

    @Override
    public void processRequest(Person person) {
        if (person.getLevels().ordinal() == AccessLevels.GUEST.ordinal())
            System.out.println("Уровень доступа гость");
        else accessManager(person);
    }
}
