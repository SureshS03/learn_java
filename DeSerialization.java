import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectStreamClass;
import java.io.Serializable;

public class DeSerialization {
    public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {

        // De-Serialization is the back process of converting the file into an object

        User u;

        FileInputStream filein = new FileInputStream("User.ser");
        ObjectInputStream in = new ObjectInputStream(filein);

        u = (User) in.readObject();

        in.close();
        filein.close();

        System.err.println(u.name);
        System.out.println(u.password); // this will be null because its transient

        long serializeVersionUID = ObjectStreamClass.lookup(u.getClass()).getSerialVersionUID();
        System.out.println(serializeVersionUID); // -8540239347632378430

    }
}

class User implements Serializable {
    int id;
    String name;
    transient String password;

    public User(int id, String name, String password) {
        this.id = id;
        this.name = name;
        this.password = password;
    }
}