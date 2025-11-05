public class Die {

    private int sides;

    public Die(int numOfSides){
        sides = numOfSides;
    }

    public int rollDie(){
        return (int)(Math.random()*(this.sides) + 1);
    }

    public String toString(){
        return this.sides + " sided die";
    }

    public static void main(String[] args) {
        Die d6 = new Die(6);
        System.out.println(d6);
        for(int i=0; i<=6; i++){
            System.out.println(d6.rollDie());
        }
    }


}
