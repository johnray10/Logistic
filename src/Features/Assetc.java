/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Features;

import javax.swing.ImageIcon;

/**
 *
 * @author Jayjomjohn
 */
class Assetc {
    private final int assetid;
    private String pn,sn,branches,department,owner,category,subcategory,cost,brand,
                   servicelife,source,servicedate,description;
    private final byte[] picture;
      
       public Assetc(int assetid, String pn, String sn, String branches, String department,String owner, 
               String category,String subcategory,String cost,String brand,String servicelife, 
               String source,String servicedate,String description,byte []image)
    {
        this.assetid=assetid;
        this.pn=pn;
        this.sn=sn;
        this.branches=branches;
        this.department=department;
        this.owner=owner;
        this.category=category;
        this.subcategory=subcategory;
        this.cost=cost;
        this.brand=brand; 
        this.servicelife=servicelife;
        this.source=source;
        this.servicedate=servicedate;
        this.description=description;          
        this.picture=image;
        
    }

    Assetc(int aInt, String string, String string0, String string1, String string2, String string3, byte[] bytes) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    Assetc(int aInt, String string, String string0, String string1, String string2, String string3, String string4, byte[] bytes) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    public int getassetid(){
        return assetid;
    }
    public String getpn(){
        return pn;
    }
    public String getsn(){
        return sn;
    }
    public String getbrandches(){
        return branches;
    }
    public String getdepartment(){
        return department;
    }
    public String getowner(){
        return owner;
    }
    public String getcategory(){
        return category;
    }
    public String getsubcategory(){
        return subcategory;
    }
    public String getcost(){
        return cost;
    }
    public String getbrand(){ 
        return brand;
    }
    public String getservicelife(){
        return servicelife;
    }
    public String getsource(){
        return source;
    }
    public String getservicedate(){
        return servicedate;
    }
    public String getdescription(){
        return description;
    }
    public byte[] getimage(){
    return picture;
    }
    public ImageIcon getImage(){
        return new ImageIcon(new ImageIcon (picture).getImage().getScaledInstance(100, 100, java.awt.Image.SCALE_SMOOTH));
    }
}
