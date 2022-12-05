/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Widigdo Subagyo
 * TI-B
 * 21104410047
 */
public class Pop {
    
    private String penyanyi = "Raisa";
    private String lagu = "Kali Kedua";
    
    Pop(){
        
    }
    
    Pop(String penyanyi, String lagu){
        this.penyanyi = penyanyi;
        this.lagu = lagu;
        System.out.println(this.penyanyi+" <=> "+this.lagu);
    }
    public void singer(String Penyanyi){
        this.setPenyanyi(getPenyanyi());
    }
    protected void song(String lagu){
        this.getLagu();
    }
    void cetakLabel(){
        System.out.println(this.getPenyanyi()+" <=> "+this.getLagu());
    }

    /**
     * @return the penyanyi
     */
    public String getPenyanyi() {
        return penyanyi;
    }

    /**
     * @param penyanyi the penyanyi to set
     */
    public void setPenyanyi(String penyanyi) {
        this.penyanyi = penyanyi;
    }

    /**
     * @return the lagu
     */
    public String getLagu() {
        return lagu;
    }

    /**
     * @param lagu the lagu to set
     */
    public void setLagu(String lagu) {
        this.lagu = lagu;
    }
}
