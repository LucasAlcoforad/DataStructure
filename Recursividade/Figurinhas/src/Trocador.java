import java.util.Scanner;

public class Trocador {
    public int mdc = 1;
    public int divisor = 2;
    public int mao1;
    public int mao2;
    public int vezes;

    public int getVezes() {
        return vezes;
    }

    public void setVezes(int vezes) {
        this.vezes = vezes;
    }

    public int getMdc() {
        return mdc;
    }

    public void setMdc(int mdc) {
        this.mdc = mdc;
    }

    public int getMao1() {
        return mao1;
    }

    public void setMao1(int mao1) {
        this.mao1 = mao1;
    }

    public int getMao2() {
        return mao2;
    }

    public void setMao2(int mao2) {
        this.mao2 = mao2;
    }

    public int getDivisor() {
        return divisor;
    }

    public void setDivisor(int divisor) {
        this.divisor = divisor;
    }
    public void jogar(Scanner scanner){
        this.setVezes(scanner.nextInt());
        for(int i = 0;i<this.getVezes();i++){
            this.setMao1(scanner.nextInt());
            this.setMao2(scanner.nextInt());
            calculadorMDC();
        }
        return;
    }
    public void calculadorMDC(){
        if (this.getMao1()==1 && this.getMao2()==1){
            System.out.println(this.getMdc());
        } else {
            if (this.getMao1()%this.getDivisor()==0 && this.getMao2()%this.getDivisor()==0){
                this.setMdc(this.getMdc()*this.getDivisor());
                this.setMao1(this.getMao1()/this.getDivisor());
                this.setMao2(this.getMao2()/this.getDivisor());
                calculadorMDC();
            } else if (this.getMao1()%this.getDivisor()==0){
                this.setMao1(this.getMao1()/this.getDivisor());
                this.setDivisor(this.getDivisor()+1);
                calculadorMDC();
            } else if (this.getMao2()%this.getDivisor()==0) {
                this.setMao2(this.getMao2() / this.getDivisor());
                this.setDivisor(this.getDivisor() + 1);
                calculadorMDC();
            } else if (this.getMao1()>this.getDivisor() && this.getMao2()>this.getDivisor()){
                System.out.println(this.getDivisor());
                this.setDivisor(this.getDivisor()+1);
                calculadorMDC();
            }
        }
    }

}
