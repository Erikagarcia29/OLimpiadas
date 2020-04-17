package app;

public class Maratonista extends Deportista {
    public String categoria;
    public Double KilometrosMaximoCorrido;
    public Double marca;
    public double velocidad;
    public int energia;

    public boolean correr() {
        if (this.energia < 0) {
            this.velocidad = 20;
            this.energia -= 5;
            this.playAnimacionCorrer(){
                public void playAnimacionLargada() {
                    for (int i = 3; i > 0; i--) {
            
                        System.out.print(i);
                        System.out.print("\r");
                        try {
                            Thread.sleep(1000);
                        } catch (InterruptedException e) {
                            // TODO Auto-generated catch block
                            e.printStackTrace();
                        }
                    }
                    System.out.println("lalalal");
                }
            
                public void playAnimacionCorrer() {
            
                    System.out.print("\r");
                    String blancos = "";
                    for (int i = 100; i > energia; i--) {
            
                        blancos += " ";
            
                    }
                    String cuerpo = "\\o/";
            
                    if (this.energia % 2 != 0)
                        cuerpo = "/o\\";
            
                    System.out.print(blancos + cuerpo);
            
                    try {
                        Thread.sleep(500);
                    } catch (InterruptedException e) {
                        // TODO Auto-generated catch block
                        e.printStackTrace();
                    }
            
                } 
            }
            return true;
        }
        return false;
    }

    public void acelerar() {
        velocidad++;
    }
}