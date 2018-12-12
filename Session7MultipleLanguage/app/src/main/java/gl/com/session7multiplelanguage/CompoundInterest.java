package gl.com.session7multiplelanguage;

public class CompoundInterest extends SimpleInterest{


    public CompoundInterest(){

        this.num1=num1;
        this.num2=num2;
        this.num3=num3;
    }

    public int compoundInterest(int num1,int num2,int num3) {

        {

            return ((int) (num1 * (Math.pow((1 + num3 / 100), num2))));

        }
    }

}
