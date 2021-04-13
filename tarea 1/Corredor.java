
public class Corredor{
    private String nombre;
    private int edad;
    private int tiempo;
    private int distancia;
    private char sexo;
    
    public Corredor(String nombre, int edad, int tiempo, int distancia, char sexo){
        this.nombre = nombre;
        this.edad   = edad;
        this.tiempo = tiempo;
        this.distancia = distancia;
        this.sexo   = sexo;
    }
    
    public int calcularVelocidad(){
        int velocidad;
        velocidad = distancia / tiempo ;
        return velocidad;
    }
    
    public String datos(){
        String datos;    
        datos = nombre + " edad " + edad + " distancia " + distancia + " tiempo " + tiempo ;
        return datos;
    } 
    
    public String getnombre(){
        return nombre;
    }
    public String setnombre(String nombre){
        this.nombre = nombre;
        return nombre;
    }
    
    public int getedad(){
        return edad;
    }
    public int setedad(int edad){
        this.edad = edad;
        return edad;
    }
    
    public int gettiempo(){
        return tiempo;
    }
    public int settiempo(int tiempo){
        this.tiempo = tiempo;
        return tiempo;
    }
    
    public int getdistancia(){
        return distancia;
    }
    public int setdistancia(int distancia){
        this.distancia = distancia;
        return distancia;
    }
    
    public char getsexo(){
        return sexo;
    }
    public char setsexo(char sexo){
        this.sexo = sexo;
        return sexo;
    }
    
    
    
    
   
}
