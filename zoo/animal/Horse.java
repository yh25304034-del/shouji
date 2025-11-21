package pac.zoo.animal;

public class Horse extends AbstractAnimal{
    public Horse(String name){
        super(name);

    }
    @Override
    public void eat(){
        System.out.println("馬の"+ getName()+"は草をたべます。");
    }
}