package H3_CoR;

 class AccessLevelAdministrator extends Access {

     AccessLevelAdministrator(AccessLevels priorityLevel) {
        super(priorityLevel);
    }

    @Override
    public void processRequest(Person person) {
        if (person.getLevels().ordinal() == AccessLevels.ADMINISTRATOR.ordinal())
            System.out.println("Уровень доступа администратор");
        else accessManager(person);
    }
}
