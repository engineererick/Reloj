public class Reloj
{
    private int horas;
    private int minutos;
    
    public Reloj(int horaIn, int minutoIn)
    {
        horas=horaIn;
        minutos=minutoIn;
    }
    
    public void TicTac()
    {
        minutos +=1;
        if(minutos==60)
        {
            minutos=0;
            horas+=1;
        }
        
        if(horas==24)
        {
            horas = 0;
        }
    }
    
    public String dimeTuTiempo()
    {
        
        String cadResultado="";
        if(horas<10)
        {
            cadResultado+="0";
        }
        
        cadResultado+=horas;
        cadResultado+=":";
        
        if(minutos<10)
        {
            cadResultado+="0";
        }
        
        cadResultado+=minutos;

        return cadResultado;
    }
}