package contest56;

public class oneBitAnd2BitCharacter {
    public static void main(String[] args) {
        new oneBitAnd2BitCharacter().run();
    }
    public void run(){
        int[] bit={1,1,0,0};
        System.out.println(isOneBitCharacter(bit));
    }
    public boolean isOneBitCharacter(int[] bit){
        boolean judge=false;
        for (int i = 0; i <bit.length-1; i++) {
            if (judge==true){
                judge=false;
            }else {
                if (bit[i]==1){
                    judge=true;
                }
            }
        }
        return !judge;
    }
}
