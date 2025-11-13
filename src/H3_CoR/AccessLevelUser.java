package H3_CoR;

 class AccessLevelUser extends Access {

     AccessLevelUser(AccessLevels priorityLevel) {
        super(priorityLevel);
    }

    @Override
    public void processRequest(Person person) {
        if (person.getLevels().ordinal() == AccessLevels.USER.ordinal())
            System.out.println("Уровень доступа пользователь");
        else accessManager(person);
    }
}
