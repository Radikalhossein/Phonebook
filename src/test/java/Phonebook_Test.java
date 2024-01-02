/**
 * writing unit tests for each method of classes
 * If you have no idea about how to write unit tests, you can search the internet or check your first assignment
 * After each unit test you've written, please commit the changes and push to your repo

 * Hint: Your test coverage should be 100%
 * Attention:  We would check your commits and it will affect your score
 */
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
public class Phonebook_Test {
    @Test
    public void testGetPhoneNumber() {
        Person person = new Person("parsa","09121111111");
        Person person1 = new Person("javad","09123333333");
        Person person2 = new Person("majid","09124444444");

        Phonebook phonebook = new Phonebook();

        phonebook.addContact(person);
        phonebook.addContact(person1);
        phonebook.addContact(person2);

        Assertions.assertEquals("09124444444",phonebook.getPhoneNumber("majid"));
        Assertions.assertEquals("Contact Not Found",phonebook.getPhoneNumber("bob"));
    }

    @Test
    public void testGetContact(){

        Person person = new Person("parsa","09121111111");
        Person person1 = new Person("javad","09123333333");
        Person person2 = new Person("majid","09124444444");

        Phonebook phonebook = new Phonebook();

        phonebook.addContact(person);
        phonebook.addContact(person1);
        phonebook.addContact(person2);

        Assertions.assertEquals(1,phonebook.getContact("javad"));
        Assertions.assertEquals(0,phonebook.getContact("Sara"));
    }

    @Test
    public void testUpdateContactName(){

        Person person = new Person("parsa","09121111111");
        Person person1 = new Person("javad","09123333333");
        Person person2 = new Person("majid","09124444444");

        Phonebook phonebook = new Phonebook();

        phonebook.addContact(person);
        phonebook.addContact(person1);
        phonebook.addContact(person2);

        Assertions.assertEquals(1,phonebook.updateContactName("parsa","saman"));
        Assertions.assertEquals(0,phonebook.updateContactName("jafar","ali"));
    }

    @Test
    public void testUpdateContactPhoneNumber(){

        Person person = new Person("parsa","09121111111");
        Person person1 = new Person("javad","09123333333");
        Person person2 = new Person("majid","09124444444");

        Phonebook phonebook = new Phonebook();

        phonebook.addContact(person);
        phonebook.addContact(person1);
        phonebook.addContact(person2);

        Assertions.assertEquals(1,phonebook.updateContactPhoneNumber("majid","09211938196"));
        Assertions.assertEquals(0,phonebook.updateContactPhoneNumber("Sara","09124567896"));
    }

    @Test
    public void testDeleteContact(){

        Person person = new Person("parsa","09121111111");
        Person person1 = new Person("javad","09123333333");
        Person person2 = new Person("majid","09124444444");

        Phonebook phonebook = new Phonebook();

        phonebook.addContact(person);
        phonebook.addContact(person1);
        phonebook.addContact(person2);

        Assertions.assertEquals(1,phonebook.deleteContact("javad"));
        Assertions.assertEquals(0,phonebook.deleteContact("sahar"));
    }

    @Test
    public void testGetAllContacts(){

        Person person = new Person("parsa","09121111111");
        Person person1 = new Person("javad","09123333333");
        Person person2 = new Person("majid","09124444444");

        Phonebook phonebook = new Phonebook();
        Phonebook phonebook1 = new Phonebook();

        phonebook.addContact(person);
        phonebook.addContact(person1);
        phonebook.addContact(person2);

        Assertions.assertEquals(person.getName(),phonebook.getAllContacts().get(0).getName());
        Assertions.assertEquals(phonebook1.getAllContacts(),phonebook1.getAllContacts());

    }

    @Test
    public void testSetAllContactsHidden(){

        Person person = new Person("parsa","09121111111");
        Person person1 = new Person("javad","09123333333");
        Person person2 = new Person("majid","09124444444");

        Phonebook phonebook = new Phonebook();

        phonebook.addContact(person);
        phonebook.addContact(person1);
        phonebook.addContact(person2);

        phonebook.setAllContactsHidden();

        for (Person personC : phonebook.getAllContacts()){

            Assertions.assertTrue(personC.isHidden());
        }

    }


}
