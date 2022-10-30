package decoratorDesignPattern;

public class ChristmasTreeImpl implements ChristmasTree{

    ChristmasTreeImpl()
    {
        System.out.println("initialized Christmas Tree Impl");
    }
    @Override
    public String decorate() {
        return "Christmas Tree";
    }
}
