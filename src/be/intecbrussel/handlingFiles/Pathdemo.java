package be.intecbrussel.handlingFiles;
import jdk.swing.interop.SwingInterOpUtils;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
public class Pathdemo {
    public static void main(String[] args) throws IOException {
        Path pathToMyTextFile = Paths.get("resources/MyTextFile.txt");
        System.out.println(pathToMyTextFile.getFileName());
        System.out.println(pathToMyTextFile.isAbsolute());
        System.out.println(pathToMyTextFile.toAbsolutePath());
        System.out.println(pathToMyTextFile.getFileSystem());
        System.out.println(pathToMyTextFile.getParent().resolve("subfolder").resolve("subfile.txt"));
      /*  //Files.createDirectory(Paths.get("resources/subfolder/jeanpierre.txt"));
        Files.createDirectory(Paths.get("resources/subfolder/jeanpierre2"));
        //Files.deleteIfExists(Paths.get("resources/subfolder/jeanpierre.txt"));
        Files.createFile(Paths.get("resources/subfolder/jeanpatapouffe3.txt"));
        Files.walk(Paths.get("resources/..."))
                .forEach(path -> System.out.println(path.getFileName()));*/
if (Files.notExists(Paths.get("resources/subfolder/jeanpierre"))){
    Files.createDirectory(Paths.get("resources/subfolder/jeanpierre"));
}

Files.deleteIfExists(Paths.get("resources/subfolder/jeanpierre.txt"));

        if (Files.notExists(Paths.get("resources/subfolder/jeanpatapouffe.txt"))){
            Files.createFile(Paths.get("resources/subfolder/jeanpierre"));
        }

Path pathToWalk = Paths.get("resources");
        Files.walk(pathToWalk)
                .forEach(path -> System.out.println(path.toString()));

        Files.lines(Paths.get("resources/MyTextFile.txt"))
                .forEach(System.out::println);


       Path fileToCopy =  Paths.get("resources/MyTextFile.txt");
        Path copydestination = Paths.get("resources/MyCopiedTextFile");

        //Files.copy(fileToCopy,copydestination);

        /* dit kunnen we niet gebruiken
        Path loremIpsum = Paths.get("www.lipsum.com/ffed/html");
        Path destination = Paths.get("resources/MyTextFile.txt");
        Files.copy(loremIpsum,destination);

         */

        Files.move(Paths.get("resources/hello.txt"), fileToCopy);



    }
}
