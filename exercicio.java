package EXERCICIO;
import java.util.*;

public class exercicio {
    public static void main(String args[]) {
        Scanner reader = new Scanner(System.in).useDelimiter("[,\\s+]");  // le os valores passados em forma de varios valores em uma linha separados por virgula
        System.out.print("Entre com os valores:");

        //adiciona os valores a uma lista
        String line = reader.nextLine();
        String[] inValues = line.split(",");
        int[] list = new int[inValues.length];
        for(int i = 0; i < inValues.length; i++){
            list[i] = Integer.parseInt(inValues[i]);
        }

        int size = list.length;
        int sr = (int)Math.sqrt(size);
        int k = 0;
        //verifica se a lista passada é valida
        if (((sr * sr) != size && sr!=0))
        {
            for (int a =0; a<size; a++)
            {
                System.out.print(list[a]+",");
            }
            System.out.println("- Invalido");
            System. exit(1);
        }
        int[][] matrix = new int [sr][sr];
        //cria uma matriz com os valores passados
        for (int i = 0; i<sr;i++)
        {
            for (int j = 0; j<sr; j++)
            {
                matrix[i][j] = list[k];
                k++;
            }
        }
        int temp=0;
        int ant=0;
        int ant2=0;
        //rotaciona a matriz
        for (int i = 0; i<sr;i++)
        {
            //se for a primeira linha da matriz
            if (i == 0)
            {
                for (int j = 0; j<sr; j++)
                {
                    //primeira coluna
                    if (j == 0)
                    {
                        ant=matrix[i][j+1];
                        matrix[i][j+1] = matrix[i][j];
                    }
                    //colunas do meio
                    if (j < sr-1 && j>0)
                    {
                        temp = matrix[i][j];
                        matrix[i][j] = ant;
                        ant = matrix[i][j+1];
                        matrix[i][j+1] = matrix[i][j];
                        matrix[i][j] = temp;
                    }
                    //ultima coluna
                    if (j == sr-1)
                    {
                        temp = matrix[i][j];
                        matrix[i][j] = ant;
                        ant = matrix[i+1][j];
                        matrix[i+1][j] = matrix[i][j];
                        matrix[i][j] = temp;
                    }

                }
            }

            //ultima linha
            if (i == sr-1)
            {
                for (int j = sr-1; j>-1; j--)
                {

                    if (j > 0 )//&& j != sr-1
                    {
                        temp = matrix[i][j];
                        matrix[i][j] = ant;
                        ant = matrix[i][j-1];
                        matrix[i][j-1] = matrix[i][j];
                        matrix[i][j] = temp;
                    }
                    if (j == 0)
                    {
                        temp = matrix[i][j];
                        matrix[i][j] = ant;
                        ant = matrix[i-1][j];
                        ant2 = matrix[i-1][j];
                        matrix[i-1][j] = matrix[i][j];
                        matrix[i][j] = temp;
                    }
                }
            }

            //caso ultima coluna das linhas do meio
            if (i>0 && i<sr-1)
            {
                for (int j = sr-1; j>-1; j--)
                {
                    if (j == sr-1)
                    {

                        temp = matrix[i][j];
                        matrix[i][j] = ant;
                        ant = matrix[i+1][j];
                        matrix[i+1][j] = matrix[i][j];
                        matrix[i][j] = temp;
                    }


                }
            }

        }

        //caso primeira coluna das linhas do meio
        for (int i = sr-2; i>0;i--)
        {
            temp = matrix[i][0];
            matrix[i][0] = ant2;
            ant2 = matrix[i-1][0];
            matrix[i-1][0] = matrix[i][0];
            matrix[i][0] = temp;

        }



        for (int i = 0; i<sr;i++)
        {
            for (int j = 0; j<sr; j++)
            {

                System.out.print(matrix[i][j] + ",");
            }
        }
        System.out.print("- Valido");
    }
}
