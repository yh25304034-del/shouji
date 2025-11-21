package pac;

import pac.zoo.TamaZoo;
import pac.zoo.animal.*;

public class ZooTest {
    public static void main(String[] args) {
        TamaZoo zoo = new TamaZoo();
        zoo.addAnimal(new Lion("しょうじ"));
        zoo.addAnimal(new RedPanda("リス"));
        zoo.addAnimal(new Hukurou("写輪眼"));
        zoo.meal();
    }
}