public class diagonal {                     //Заполнение диагоналей 1
    private static void main(String[] args) {
        int n = 3;
        int[][] arr=new int[n][n];
        for (int i=0;i<n;i++){
            for (int j=0;j<n;j++){
                if (i==j){                   //Главная диагональ
                    arr[i][j]=1;
                }
                else{
                    if (j==(n-i-1)){        //Побочная диагональ
                        arr[i][j]=1;
                    }
                }
                System.out.println(arr[i][j] + " ");
            }
        }
    }
}


