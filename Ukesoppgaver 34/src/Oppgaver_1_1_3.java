 public class Oppgaver_1_1_3 {

    public static int[] minmaks(int[] a){
        int min = a[0]; int max = a[0];
        int mix = 0; int maix = 0;
        for(int i = 1; i<a.length; i++)
        {
            if(a[i] < min) { // 1 sammenligning
                min = a[i];
                mix = i;

            }
            if(a[i] > max) { // 1 sammenligning
                max = a[i];
                maix = i;
            }
                                // 2n - 2 sammenligninger totalt
        }
        int[] m1m2 = {mix, maix};
        return m1m2;

    }
    public static long fak(int n)
    {
        int fak = 1;
        for(int i = 2; i <=n; i++)
            fak = fak * i;
        return fak;
    }
    public static void main(String[] args){
        int[] x = {10, 5};
        int[] calculated = minmaks(x);
        for(int i = 0; i<calculated.length; i++)
            System.out.println(calculated[i]);
        System.out.println(fak(5));
    }
}








