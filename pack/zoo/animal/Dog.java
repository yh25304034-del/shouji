package pac.zoo.animal;

public class Dog extends AbstractAnimal{
    public Dog(String name){
        super(name);
    }
    @Override
    public void eat(){
        System.out.println("犬の"+getName()+"は肉とライスをたべます。");
    }
}