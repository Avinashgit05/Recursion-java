public class TowerOfHonoi {
    public static void  TOH(int disks, char A, char B, char C){
        if(disks==0){
            return;
        }
        TOH(disks-1, A, C, B);
        System.out.println("move disk"+disks+"from"+A+"to" +C);
        TOH(disks-1, B, A,C);

    }
    public static void main(String[] args) {
        TOH(3, 'A', 'B','C');
    }
    
}
