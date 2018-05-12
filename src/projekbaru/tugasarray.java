
package projekbaru;
public class tugasarray {
    public static void main (String []args){
        int kuadrat [] ;
        kuadrat = new int[10];
        for (int i=0; i<10; i++)
        {
        
            kuadrat[i]=(i+1)*(i+1);
            System.out.println("kuadrat "+(i+1)+" = "+kuadrat[i]);
        }
    }
}

