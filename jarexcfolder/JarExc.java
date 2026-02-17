package jarexcfolder; // package and folder name sshould be same and all lowercase

public class JarExc {
    public static void main(String[] args) {
        System.out.println("Hello from executable JAR!");
    }
}

// comppile the program to create .class file
// then create a manifest file to tell jaba where to start and mention the Main Class in that manifesr file like
// Main-Class: JarExc
// the create jar by
// syntax : - jar cfm Name.jar manifestfile.txt Name.class
// jar cfm JarExc.jar manifest.txt JarExc.class
// c - create, f - file, m - includes manfest

// to run the jar
// java -jar name.jar(JarExc.jar)

// you can make that .jar file into excuteable by chmod u+x JarExc.jar and just run normaly like ./JarExc.jar
// u can complie a total package also by speficy the whole pcakge like com/exmaple/*.class and mentaion main class in manifest file
