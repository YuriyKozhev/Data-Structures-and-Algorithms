import structure.array.Array;

public class Main {
    public static void main(String[] args) {
        Array<Integer> array = new Array<Integer>(5);

        for (int i = 0; i < array.getLength(); i++) {
            array.setItem(i, i);
        }

        for (Integer n: array) {
            System.out.println(n);
        }

        System.out.println(array.getItem(0));
    }


}
