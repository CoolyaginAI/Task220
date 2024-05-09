public class Main {
    public static void main(String[] args) {

        int size = 20;
        int value = 15;
        int[] arr = new int[size];

        for (int i=0; i<size; i++) {
            int n = (int) (1 + java.lang.Math.random()*value);
            arr[i] = n;
            System.out.print(arr[i] + " ");
        }
        System.out.println("");

        for (int i=1; i<value; i++) {
            int amount = 0;
            for (int j=0; j<size; j++){
                if (arr[j] == i) amount++;
            }
            switch (amount) {

            }

                System.out.println("Число '" + i + "' встречается " + amount + " раза");
        }

    }
}