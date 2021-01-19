package be.intecbrussel.fileIOdemo;


import java.util.List;

public class TestApp3 {

    public static void main(String[] args) {
        Animal animal = new Animal("Lion", "Anthony", 100);
        Animal animal2 = new Animal("Corcodile", "Also Anthony ? But Zebra", 50);

        //Write write = new Write();
       // write.WriteObjectToFile(animal);
        //write.WriteObjectToFile(animal2);
  //      write.writeAllAnimalsToFile(animal, animal2);

//        write.WriteObjectToFile(animal);

        Read read = new Read();
        List<Animal> animalFromFile =  read.readAllAnimalFromFile();
        animalFromFile.forEach(System.out::println);

    }
}
