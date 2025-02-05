public class Dessert {
    private int flavor;
    private int price;
    private static int numDesserts = 0;
    public Dessert(int flavor,int price){
        this.flavor = flavor;
        this.price = price;
        numDesserts+=1;
    }
    public void printDessert(){
        System.out.println(this.flavor + " " + this.price + " " + Dessert.numDesserts);
    }

    public static void main(String[] args) {
        System.out.println("I love dessert!");
    }
}
