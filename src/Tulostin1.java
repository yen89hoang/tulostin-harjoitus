
public class Tulostin1 {
    public static void main(String[] args) throws Exception {
        System.out.println("Hei, olen Tulostin-ohjelma");
        System.out.print("Ohjelman tekijä: ");
        String name;
        name = "Yen";
        System.out.println(name);

        double luku1, luku2, tulo, sum, ero, jako;
        luku1 = 5;
        luku2 = 2;
        System.out.println("Luku1-muuttujan arvo on" + luku1);
        System.out.println("Luku2-muuttujan arvo on" + luku2);

        ero = luku1 - luku2;
        System.out.println(luku1 + " - " + luku2 + " = " + ero);

        tulo = luku1 * luku2;
        System.out.println(luku1 + " * " + luku2 + " = " + tulo);

        jako = luku1 / luku2;
        System.out.println(luku1 + " / " + luku2 + " = " + jako);

        sum = luku1 + luku2;
        System.out.println(luku1 + " + " + luku2 + " = " + sum);

    }
}
