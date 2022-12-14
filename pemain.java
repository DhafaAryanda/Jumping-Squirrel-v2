
/**
 * Write a description of class pemain here.
 *
 * @author Dhafa Aryanda
 * @version 11.0.11
 * link presentasi: https://drive.google.com/file/d/1bIdzvEANWCb82fzKLm9jMggLHwQmsR7l/view?usp=sharing
 */
public class pemain
{
    // instance variables - replace the example below with your own
    private String nama;
    private int nilai;

    /**
     * Constructor for objects of class pemain
     */
    public pemain()
    {

    }

    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    public String getNama()
    {
        return this.nama;
    }
    
    public void setNama(String nama) 
    {
        this.nama = nama;
    }
    
    public int getNilai() {
        return nilai;
    }

    public int setNilai(int nilaiBaru) {
        this.nilai = nilaiBaru;
        return nilai;
    }

    public boolean buatSquirrel(boolean squirrel) {
        return squirrel;
    }
}
