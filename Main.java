public class Main {
    public static void main(String[] args) {
        String[][] liste = new String[7][4];

        for(int i=0;i<liste.length;i++){
            for(int j=0;j<liste[i].length;j++){
                if((i==0 || i==6 || i==3) && (j!=3 )){ //I tried to give curve on the right edges in here after &&
                    liste[i][j]=" * ";
                }else if((j==0 || j==3) && (i!=0 & i!=3 & i!=6)){ //I tried to give curve on the right edges in here after &&
                    liste[i][j]=" * ";
                }else{
                    liste[i][j]="   ";
                }
            }
        }

        for(String lis[]:liste){
            for(String li:lis){
                System.out.print(li);
            }
            System.out.println();
        }
    }
}
