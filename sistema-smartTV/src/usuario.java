public class usuario {
    public static void main(String[] args) throws Exception {
        smartTV smartTV = new smartTV();
        
        System.out.println("SmartTV está ligada? " + smartTV.ligada);
        System.out.println("Canal atual: " + smartTV.canal);
        System.out.println("Volume atual: " + smartTV.volume );

        smartTV.ligar();
        System.out.println("SmartTV está ligada? " + smartTV.ligada);

        smartTV.aumentarVolume();
        smartTV.aumentarVolume();
        System.out.println("Volume atual: " + smartTV.volume);

        smartTV.diminuirVolume();
        System.out.println("Volume atual: " + smartTV.volume);

        System.out.println("Canal atual: " + smartTV.canal);

        smartTV.mudarCanal(11);
        System.out.println("Canal atual: " + smartTV.canal);








    }
}
