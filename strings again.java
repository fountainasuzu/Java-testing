public class Main {
    public static void main(String args[]) {
        //TODO: Your code goes here
        String firstName = "Harry";
        String lastName = "Grow";
        String email = "harry.grow@example.com";

        String username = firstName.toLowerCase() + lastName.toLowerCase();
        String newrafemail = email.replace("example.com","gmail.com");
        int windex = email.indexOf('@');

        System.out.println("The username is: " + username);
        System.out.println("The new email is: " + newrafemail);
        System.out.println("The index is: " + windex);
    
            }
}