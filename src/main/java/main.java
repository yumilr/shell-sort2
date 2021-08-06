class shell_sort
    {
    static String ReadLn (int maxLg)
    {
        byte[] lin = new byte [maxLg];
        int lg = 0;
        int car = -1;
        try
        {
            while (lg < maxLg)
            {   car = System.in.read();
                if ((car < 0) || (car == '\n'))
                    break;
                lin [lg++] += car;
            }
        }
        catch (Exception e)
        {
            return (null);
        }
        if ((car < 0) || (lg == 0))
            return (null);
        return (new String (lin, 0, lg));
    }
    public static void main(String[] args )
    {
        String[] v = new String[2000];
        String[] vcasos = new String[2000];
        String[] vp = new String[200];
        int[] vnum = new int[200];
        int ban = 0; 
        int cont = 1; 
        int lon = 1;
        String cad;
        cad = shell_sort.ReadLn(255);
        int dim = Integer.parseInt(cad);
        while (lon <= dim) 
        {
            cad = shell_sort.ReadLn(255);
            int n = Integer.parseInt(cad);
            if (n <= 200) 
            {
                lon++;
                for (int i = 1; i <= n * 2; i++) 
                {
                    if (i <= n) 
                    {
              String nombre = shell_sort.ReadLn(80);
                        v[i] = nombre;
                    } 
                    else 
                    {
              String nombre = shell_sort.ReadLn(80);
                        vp[i - n] = nombre;
                    }
                }
                for (int i = 1; i <= n; i++) 
                {
                    ban = 0;
                for (int j = 1; j <= n && ban == 0; j++) 
                    {
                    if (v[i].equals(vp[j])) 
                    {
                        vnum[i] = j;  ban = 1;
                    }
                }
            }
                    int aux;
                    int posrem = 0; 
                    int sw = 0;
                    int pos = 1; 
                    int pivot = vnum[1];
            if (vnum[1] == 1) 
            {
                pivot += vnum[2];
                             pos = 2;
            }
            while (sw == 0) 
            {
                sw = 1;
            for (int i = pos; i <= n && sw == 1; i++) 
                {
                   if (vnum[i] + 1 == vnum[pos])
                    {
                        posrem = i; sw = 0;
                    }
                }
                aux = vnum[posrem];
                for (int j = posrem; j > 1; j--)
                    vnum[j] = vnum[j - 1];
                vnum[1] = aux;
                pos = 1;
                vcasos[cont] = vp[aux];
                cont++;
                sw = 1;
                for (int j = 1; j <= n; j++)
                    if (vnum[j] != j)
                        sw = 0;
            }
            vcasos [cont] = "";
                    cont++;
        }
    }
    for (int k = 1; k < cont; k++)
        if (vcasos.equals(""))
            logger.log ("\n    s ");
        else
            logger.log(vcasos[k] + "\n");
    } 
}