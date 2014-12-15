package model.entidade;

/**
 * @author Lockland
 */
public enum ESTADOCIVIL {

    C("casado(a)"), 
    S("solteiro(a)"), 
    D("divorciado(a)"), 
    V("viuvo(a)");
    
    private String description = "";
    
    private ESTADOCIVIL(String description){
        this.description = description;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
    
}