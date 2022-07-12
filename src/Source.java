public class Source {
    public static void main(String[] args) {
        final int n = 2;
        System.out.println(nearestSq(n)==1);
    }
    public static int nearestSq(final int n){
    return (int) Math.pow(Math.round(Math.sqrt(n)),2);
    }
}
