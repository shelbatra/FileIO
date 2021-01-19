package be.intecbrussel.fileIOdemo;

public class DemoApp {
    public static void main(String[] args) {
        Write wd = new Write();
        //wd.writeStringToFile("Potato");

        Read rd = new Read();
        rd.readStringFromFile2();
    }
}