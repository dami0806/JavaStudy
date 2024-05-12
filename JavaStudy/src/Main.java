//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        int arr[][] = {{1, 1}, {2, 2}, {3, 3}};
        int arr2[][] = new int[3][2];
        for (int i = 0; i < arr.length; i++) {
            arr2 = arr.clone();

        }

        arr2[2][1] = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.println(arr2[i][j]);
            }
        }
    }
}