import java.util.Arrays;
public class Main {

    public static void display(int[][] matrs){
        for (int[] row:matrs){
            for (int col:row){
                System.out.print(col);
            }
            System.out.println();
        }

    }
    public static void main(String[] args) {
        int row=3,column=3;
        int [][] matrs={{2,3,4},{5,6,7},{8,9,0}};
        System.out.println("matris:");
        display(matrs);
        System.out.println("/////////////////////");
        int[][] transpoze=new int[column][row];
        for (int i=0;i<row;i++){
            for (int j=0;j<column;j++){
                transpoze[j][i]=matrs[i][j];
            }
        }
        System.out.println("Transpoze:");
        display(transpoze);


    }
}