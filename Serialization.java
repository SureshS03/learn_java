import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.ObjectStreamClass;
import java.io.Serializable;

public class Serialization {
    public static void main(String[] args) throws FileNotFoundException, IOException {

        // Serilaization is the process of saving the state of the object into a file
        // (.ser) after the program exits
        // amd it can be used in diff machine and scan sent over the network

        // De-Serialization is the back process of converting the file into an object

        User u = new User(1, "Suresh", "testpass123");

        FileOutputStream fileout = new FileOutputStream("User.ser"); // creating a new file to store the object stream
                                                                     // as output
        ObjectOutputStream out = new ObjectOutputStream(fileout); // create new object stream class to write the user
                                                                  // object to a file

        out.writeObject(u); // writing
        out.close();
        fileout.close();

        long serializeVersionUID = ObjectStreamClass.lookup(u.getClass()).getSerialVersionUID(); // using
                                                                                                 // ObjectStreamClass
                                                                                                 // its static lookup
                                                                                                 // method to which is
                                                                                                 // gonna give
                                                                                                 // ObjectStreamClass of
                                                                                                 // User object and
                                                                                                 // using
                                                                                                 // getSerialVersionUID
                                                                                                 // static method to get
                                                                                                 // the
                                                                                                 // ObjectStreamClass id

        System.out.println(serializeVersionUID);

        // Notes

        // children class of a parnets class that implements serializable, can able to
        // do same serialization
        // static filed are cant be serializable beacsue they belong to the class
        // we need to cast the object to it object type
        // feilds declared as "transient" are cant be serializable, they are ignored
        // serialVersionUID is unique version id, it act as checker between sender and
        // revicers are using the same class to serialize or deserialize the object, it
        // will work by veriy the class name, agurments and all, like a hash function

    }
}

class User implements Serializable {
    int id;
    String name;
    transient String password;
    private static final long serializeVersionUID = 1L; // this is best practice to added UID as static 

    public User(int id, String name, String password) {
        this.id = id;
        this.name = name;
        this.password = password;
    }
}