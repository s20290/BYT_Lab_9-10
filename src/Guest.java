


public class Guest {
    public class RegistrationData
    {
        public String Login;
        public String Password;
        public String Email;
    }


    private static int _idCounter = 0;

    protected int _id;


    public Guest()
    {
        _id = _idCounter++;
    }


    public int getId()
    {
        return _id;
    }


    public Player logIn(String login, String password)
    {
        // Additional checks to remove some possibilities of hacking

        // Logs via Singleton system SingletonSystem.logIn(login, password)
        // - in case of wrong user-input data we return null, so guest will remain as a Guest
        // - in case of successful logging we return Player class that will substitute Guest 
        // and promote him into the Player
        return null;
    }

    public boolean register(RegistrationData registrationData)
    {
        // Additional checks to remove some possibilities of hacking

        // Registration via Singleton system SingletonSystem.register(registrationData)
        // - in case of wrong user-input data we return false, so new player won't be created
        // - in case of successful logging we return true, so new player will be created
        // true/false will notify the guest about successfulness of profile creation
        return false;
    }

    public void reportBug(String shortDescription, String message)
    {
        // Singleton system that handles acquiring reports 
        // from the guest by accepting SingletonSystem.reportBug(shortDescription, message)
    }
}
