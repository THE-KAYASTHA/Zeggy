public class user {

    private String address;
    private String name;
    private int contact;


    public void setInfo(String name,String address,int contact){
        this.address=address;
        this.name=name;
        this.contact=contact;


    }
    public String getName(){
        return this.name;
    }
    public String getAddress(){
        return this.address;
    }
    public int getContact(){
        return this.contact;
    }


}
