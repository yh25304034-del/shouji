package pac.zoo.animal;

public class Hukurou extends AbstractAnimal{
    public Hukurou(String name) {
        super(name);
    }
    @Override
    public void eat() {
        System.out.println("フクロウの"+getName()+"はヒヨコをバリボリ食べます。");
    }
}
