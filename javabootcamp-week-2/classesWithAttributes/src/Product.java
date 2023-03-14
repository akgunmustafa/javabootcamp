public class Product {
    public Product(int id, String name, String description, double price, int stockAmount,String renk){
        System.out.println("Yapıcı blok");
        this._id=id;
        this.name=name;
        this._kod=getKod();
        this._price=price;
        this._stockAmount=stockAmount;
        this._renk=renk;
        this._description=description;

    }
    public Product(){

    }
    private int _id;
    private String name;
    private String _description;
    private double _price;
    private int _stockAmount;
    private String _renk;
    private String _kod;

    //getter
    public int getID(){
        return _id;
    }

    //setter
    public void setId(int id){
        _id=id;
    }

    public String getDescription(){
        return _description;
    }
    public void setDescription(String description){
         _description=description;
    }

    public double getPrice(){
        return _price;
    }
    public void setPrice(double price){
        _price=price;
    }

    public int getStockAmount(){
        return _stockAmount;
    }
    public void setStockAmount(int stockAmount){
        _stockAmount=stockAmount;
    }

    public String getRenk(){
        return _renk;
    }
    public void setRenk(String renk){
        _renk=renk;
    }


       public String getKod(){
        return name.substring(0,1) + _id;
      }


   /* public String getKod(){
        return _kod;
    }
    public void setKod(String kod){
        _kod=kod;
    }
    */


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
