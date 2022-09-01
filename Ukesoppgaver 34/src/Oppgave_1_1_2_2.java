public class Oppgave_1_1_2_2 {

    public static int min(int[] a)
    {
        if(a.length <1)
            throw new java.util.NoSuchElementException("Tabellen a er tom! ");

        int m = 0;
        for(int i = 0; i <= a.length-1; i++)
        {
            if(a[i] < a[m]) m = i;
        }
        return m;
    }


    public static int max(int[] a, int fra, int til){
        int max_index = fra;
        int maksverdi = a[max_index];
        for(int l = fra + 1; l < til; l++)
        {
            if(a[l] > maksverdi) {
                maksverdi = a[l];
                max_index = l;
            }
        }

        return max_index;
    }
    public static void bytt(int[] a, int i, int j) {
        int temp = a[i]; a[i] = a[j]; a[j] = temp;

    }

    public static void main(String[] args)
    {
        int[ ] x = {1, 4, 5, 2, 0};
        for(int i = 0; i <x.length; i++)
        {
            int placement = max(x, 0, x.length);
            bytt(x, i, placement);

        }
        for(int y = 0; y <x.length; y++)
        System.out.println(x[y]);
    }



}
