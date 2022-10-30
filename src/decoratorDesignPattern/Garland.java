package decoratorDesignPattern;

public class Garland extends TreeDecorator{
    Garland(ChristmasTree tree)
    {
        super(tree);
    }

    @Override
    public String decorate() {
        return super.decorate()+" with Garland";
    }
}
