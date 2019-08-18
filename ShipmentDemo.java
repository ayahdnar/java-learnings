class Box{
    private double height;
    private double width;
    private double depth;

    Box(Box ob){
        height = ob.height;
        width = ob.width;
        depth = ob.depth;
    }

    Box(double h, double w, double d){
        height = h;
        width = w;
        depth = d;
    }

    Box(){
        height = -1;
        width = -1;
        depth = -1;
    }

    Box(double len){
        height = width = depth = len;
    }

    double volume(){
        return( height * width * depth);
    }
}

class WeightBox extends Box{
    double weight;

    WeightBox( WeightBox ob){
        super(ob);
        weight = ob.weight;
    }

    WeightBox(double h, double w, double d, double m){
        super(h , w, d);
        weight = m;
    }

    WeightBox(){
        super();
        weight = -1;
    }

    WeightBox(double len , double m){
        super(len);
        weight = m;
    }
}

class Shipment extends WeightBox {
    double cost;

    Shipment( Shipment ob){
        super(ob);
        cost = ob.cost;
    }

    Shipment( double h, double w, double d, double m, double c){
        super( h, w, d, m);
        cost = c;
    }

    Shipment(){
        super();
        cost = -1;
    }

    Shipment(double len , double m, double c){
        super( len, m);
        cost = c;
    }
}

class ShipmentDemo{
    public static void main( String agrs[]){
        Shipment first = new Shipment(10 , 20 , 30 , 40 , 50);
        Shipment second = new Shipment();
        Shipment third = new Shipment(30, 20, 10);
        Shipment forth = new Shipment( first);

        double vol;

        vol = first.volume();
        System.out.println("first volume = " +vol);
        System.out.println("weight = " + first.weight);
        System.out.println("Cost = "+ first.cost);

        vol = second.volume();
        System.out.println(" second volume = " +vol);
        System.out.println("weight= " + second.weight);
        System.out.println(" cost= " +second.cost);

        vol = third.volume();
        System.out.println("third volume= " +vol);
        System.out.println(" weight= " + third.weight);
        System.out.println(" cost = " + third.cost);

        vol = forth.volume();
        System.out.println(" forth volume= " + vol);
        System.out.println(" weight= " +forth.weight);
        System.out.println(" cost= " + forth.cost);
    }
}