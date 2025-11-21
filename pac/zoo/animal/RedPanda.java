package pac.zoo.animal;

public class RedPanda extends AbstractAnimal {
    public RedPanda(String name) {
        super(name);
    }
    @Override
    public void eat() {
        System.out.println("レッサーパンダの"+getName()+"は笹をポリポリと食べます。");
    }
}
