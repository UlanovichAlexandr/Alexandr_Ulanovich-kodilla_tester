public class FirstClas {
    public static void main (String[] args) {
        Notebook notebook = new Notebook(600,1000, 2017);
        System.out.println( notebook.weight  + " " + notebook.price + " " + notebook.year);
        notebook.checkPrice();
        notebook.checkWeight();
        notebook.checkYearAndPrice();

        Notebook heavyNotebook = new Notebook(2000,1500, 2022);
        System.out.println(heavyNotebook.weight + " " + heavyNotebook.price + " " + heavyNotebook.year);
        heavyNotebook.checkPrice();
        heavyNotebook.checkWeight();
        heavyNotebook.checkYearAndPrice();

        Notebook oldNotebook = new Notebook(1600,500, 2008);
        System.out.println(oldNotebook.weight + " " + oldNotebook.price + " " + oldNotebook.year);
        oldNotebook.checkPrice();
        oldNotebook.checkWeight();
        oldNotebook.checkYearAndPrice();

        Notebook modernNotebook = new Notebook(100,10000, 3000);
        System.out.println(modernNotebook.weight + " " + modernNotebook.price + " " + modernNotebook.year);
        modernNotebook.checkPrice();
        modernNotebook.checkWeight();
        modernNotebook.checkYearAndPrice();

}
}