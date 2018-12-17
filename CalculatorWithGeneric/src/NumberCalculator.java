public class NumberCalculator extends GenericNumberCalculator<Number> {
    @Override
    public Number add(Number num1, Number num2) {
        // TODO Auto-generated method stub
        return (num1.doubleValue()+num2.doubleValue());
    }

    @Override
    public Number substract(Number num1, Number num2) {
        // TODO Auto-generated method stub
        return  (num1.doubleValue()-num2.doubleValue());
    }

    @Override
    public Number division(Number num1, Number num2) {
        // TODO Auto-generated method stub
        return  (num1.doubleValue()/num2.doubleValue());
    }

    @Override
    public Number multiplication(Number num1, Number num2) {
        // TODO Auto-generated method stub
        return (num1.doubleValue()*num2.doubleValue());
    }

}
