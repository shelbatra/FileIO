package be.intecbrussel.fileIOdemo;

import java.io.*;
import java.nio.file.Files;


public class Write {

    public void writeStringToFile(String myText) {
        File myTextFile = new File("resources/MyTextFile.txt");
//        File myTextFile = new File("E:\\OneDrive\\OneDrive - INTEC BRUSSEL vzw\\Intec\\Opleidingen\\Java September 2020\\Projects\\FileIO\\resources\\MyTextFile.txt");

        try {
            FileWriter fileWriter = new FileWriter(myTextFile, true);
            fileWriter.write(myText + "\n");
            fileWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    public void WriteObjectToFile (Animal animal){
        //File myObjectFile = new File("resources/MyObjectFile.txt");

        try{
            File myObjectFile = new File("resources/MyObjectFile.txt");
            FileOutputStream fos = new FileOutputStream((myObjectFile));
            ObjectOutputStream oos = new ObjectOutputStream(fos);

        oos.writeObject(animal);

        oos.close();
        }catch (IOException ioe){
            ioe.printStackTrace();
        }

    }

    // declaration of array either with (Animal[]animal) or(Animal...animal)
    public void writeAllAnimalsToFile(Animal...animal){
        try{
            File myObjectFile = new File("resources/MyObjectFile.txt");
            Files.deleteIfExists(myObjectFile.toPath());
            FileOutputStream fos = new FileOutputStream(myObjectFile, true);
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            for (Animal animal1 : animal){
                oos.writeObject(animal);
            }
            oos.close();
        }catch (IOException ioe){
            ioe.printStackTrace();
        }

    }

}
