package ErsteHausaufgabe;

enum AccountType {
    PUBLIC,
    PRIVATE
}


public class User {
    private final String username;
    private final String displayName;
    private final AccountType accountType;

    public  User(String username, String displayName, AccountType accountType){
        this.username = username;
        if (displayName == null){
            this.displayName = username;
        }
        else {
            this.displayName = displayName;
        }
        this.accountType = accountType;

    }

    public User(String username, AccountType accountType){
        this(username, username, accountType);
    }

    public String getUsername(){
        return this.username;
    }

    public String getDisplayName(){
        return this.displayName;
    }

    public AccountType getAccountType(){
        return this.accountType;
    }

    public String toString(){
        return username +" (" + displayName + ") , " + getAccountType();
    }

    public String showProfile() {
        return "Username: " + username +"\nDisplayname: " + displayName + "\nAccounttype: " + getAccountType();
    }

    public boolean equals(Object o){
        if (this == o) {
            return true;
        }
        if (this.getClass() != o.getClass()  || this == null){
            return false;
        }
        User tempUser = (User)o;
        if (this.username.toLowerCase().equals(tempUser.username.toLowerCase())){
            return true;
        }
        else {
            return false;
        }
    }

    public int hashCode(){
        return username.toLowerCase().hashCode();
    }

    public static void main(String[] args) {
        User Merse = new User("Merse","Esrem",AccountType.PRIVATE);
        System.out.println(Merse.showProfile());

        if (new User( " Max " , AccountType.PUBLIC ).hashCode() == new User( " max " , AccountType.PUBLIC ).hashCode()){
            System.out.println("True");
        }
    }

}

