package TESTS.src;

import PRAC3.src.Author;

public class AuthorTest {
    public AuthorTest() {
        System.out.println("Author test");

        Author a1 = new Author("Andrei", "andr113@gmail.com", 'm');
        Author a2 = new Author("Maria", "mari21@gmail.com", 'w');

        System.out.println("author name test");
        if(!(a1.GetName() == "Andrei" && a2.GetName() == "Maria")){
            System.out.println("test not passed");
        }
        System.out.println("test passed");

        System.out.println("author email test");

        var email = "authors@gmail.com";

        a1.SetEmail(email);
        a2.SetEmail(email);

        if(!(a1.GetEmail() == a2.GetEmail() && a2.GetEmail() == email)){
            System.out.println("test not passed");
        }
        System.out.println("test passed");

        System.out.println("author gender test");

        if(!(a1.getGender() == 'm' && a2.getGender() == 'w')){
            System.out.println("test not passed");
        }
        System.out.println("test passed");

        System.out.println(a1);
        System.out.println(a2);

    }
}