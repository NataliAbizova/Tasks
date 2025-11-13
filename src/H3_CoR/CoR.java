package H3_CoR;

public class CoR {
    public static void main(String[] args) {
        Access guestAccess = new AccessLevelGuest(AccessLevels.GUEST);
        Access userlAccess = new AccessLevelUser(AccessLevels.USER);
        Access administratorAccess = new AccessLevelAdministrator(AccessLevels.ADMINISTRATOR);

        guestAccess.setNextPriorityLevel(userlAccess);
        userlAccess.setNextPriorityLevel(administratorAccess);

        Person[] person = new Person[3];
        person[0] = new Person("Пользователь_1", AccessLevels.GUEST);
        person[1] = new Person("Пользователь_2", AccessLevels.USER);
        person[2] = new Person("Пользователь_3", AccessLevels.ADMINISTRATOR);

        for (int i = 0; i < person.length; i++)
            guestAccess.processRequest(person[i]);
    }
}
