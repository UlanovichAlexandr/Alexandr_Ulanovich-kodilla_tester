public class SimpleArray {
    public static void main(String[] args) {
        String[] names = new String[5];
        names[0] = "Yuliya";
        names[1] = "Mikhail";
        names[2] = "Marcin";
        names[3] = "Witalij";
        names[4] = "Magda";
String name = names[3];
System.out.println(name);
int numberOfNames = names.length;
System.out.println("Moja tablica zawiera " + numberOfNames + " elementów" );
    }
}
