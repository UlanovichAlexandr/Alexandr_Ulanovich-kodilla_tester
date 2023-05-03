public class Notebook {
    int weight;
    int price;
    int year;

    public Notebook(int weight, int price, int year) {
        this.weight = weight;
        this.price = price;
        this.year = year;

    }

    public void checkPrice() {
        if (this.price < 600) {
            System.out.println("This notebook is very cheap");
        } else if (this.price >= 600 && this.price <= 1000) {
            System.out.println("This price is good");
        } else {
            System.out.println("This notebook is expensive");
        }
    }

    public void checkWeight() {
        if (this.weight < 800) {
            System.out.println("This notebook is light");
        } else if (this.weight >= 800 && this.weight <= 1600) {
            System.out.println("This notebook is not too heavy");
        } else {
            System.out.println("This notebook is heavy");
        }
    }

    public void checkYearAndPrice() {
        if (this.year < 2010 && this.price < 500) {
            System.out.println("This notebook is old, but price is good");}
        else if (this.year < 2010 && this.price >= 500) {
            System.out.println("This notebook is old, price is expensive");}
        else if (this.year >= 2010 && this.year <= 2020  && this.price < 1000){
            System.out.println("This notebook is new, this price is good");}
        else if (this.year >= 2010 && this.year <= 2020  && this.price >= 1000){
            System.out.println("This notebook is new, this price is expansive");}
        else if (this.year > 2020 && this.price < 1500){
            System.out.println("This notebook is modern, this price is good");}
        else {
            System.out.println("This notebook is modern, this price is expansive");}
    }
}


