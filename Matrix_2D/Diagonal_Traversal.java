package Winner.Matrix_2D;
import java.io.*;
import java.util.*;
public class Diagonal_Traversal {
        public static void main(String args[])throws IOException
        {
            Scanner sc = new Scanner(System.in);
                int n = sc.nextInt();

                int matrix[][] = new int[n][n];

                for(int i = 0; i < n; i++)
                {
                    for(int j = 0; j < n; j++)
                        matrix[i][j] = sc.nextInt();
                }
                Solution1 ob = new Solution1();
                ArrayList<Integer> ans = ob.downwardDiagonal(n, matrix);
                for (Integer val: ans)
                    System.out.print(val+" ");
                System.out.println();
        }
    }
// } Driver Code Ends


//User function Template for Java
class Solution1{
        static ArrayList<Integer> downwardDiagonal(int N, int A[][])
        {
            int row,column;
            ArrayList<Integer> n=new ArrayList<Integer>();
            for(int i=0;i<N;i++)
            {
                row=i;column=0;
                while (row>=0)
                {
                    n.add(A[row][column]);
                    column++;
                    row--;
                }
            }
            System.out.println("Hello");
            for (int j=1;j<=N;j++)
            {
                row=N-1;
                column=j;
                while (column<N)
                {
                    n.add(A[row][column]);
                    column++;
                    row--;
                }
            }
            return n;
        }
    }
class RealQSolution{
    static ArrayList<Integer> downwardDiagonal(int N, int A[][])
    {
        int row,column;
        ArrayList<Integer> n=new ArrayList<Integer>();
        for(int i=0;i<N;i++)
        {
            row=0;column=i;
            while (column>=0)
            {
                n.add(A[row][column]);
                row++;column--;
            }
        }
        for (int j=1;j<N;j++)
        {
            column=N-1;
            row=j;
            while (row<N)
            {
                n.add(A[row][column]);
                row++;column--;
            }
        }
        return n;
    }
}

