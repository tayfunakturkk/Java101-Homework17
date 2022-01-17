package Arrays.Homework3;
public class ArraysHomework3 {
    public static void main(String[] args) {
        int[][] matrix={
            {2,3,4},
            {5,6,4}};
            int[][] transpose=new int[matrix[0].length][matrix.length];
            for(int row=0; row<matrix.length;row++){
                for(int col=0; col<matrix[row].length;col++){
                    transpose[col][row]=matrix[row][col];



                }
            }
            System.out.println("Matrix:");
            for (int[] t : matrix) {
                for (int item1 : t) {
                    System.out.print(+item1 + "   ");
                }
                System.out.println();
            }
            System.out.println("  ");
            
            System.out.println("Traspose:");
             for (int[] s : transpose) {
                for (int item2 : s) {
                    System.out.print(item2 + "    ");
                }
                System.out.println();
            }
            System.out.println();

}
}
