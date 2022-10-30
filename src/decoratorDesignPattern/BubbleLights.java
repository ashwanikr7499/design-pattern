package decoratorDesignPattern;

public class BubbleLights extends TreeDecorator{
    BubbleLights(ChristmasTree tree)
    {
        super(tree);
    }
    @Override
    public String decorate() {
        return super.decorate()+" with Bulb Lights";
    }
}
