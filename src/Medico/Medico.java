/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Medico;

/**
 *
 * @author UserPL022Pc17
 */
public class Medico {
    
    Integer anoDoutoramento;
    String instEnsino;
    String idLicenca;

    public Medico(Integer anoDoutoramento, String instEnsino, String idLicenca) {
        this.anoDoutoramento = anoDoutoramento;
        this.instEnsino = instEnsino;
        this.idLicenca = idLicenca;
    }

    public Integer getAnoDoutoramento() {
        return anoDoutoramento;
    }

    public void setAnoDoutoramento(Integer anoDoutoramento) {
        this.anoDoutoramento = anoDoutoramento;
    }

    public String getInstEnsino() {
        return instEnsino;
    }

    public void setInstEnsino(String instEnsino) {
        this.instEnsino = instEnsino;
    }

    public String getIdLicenca() {
        return idLicenca;
    }

    public void setIdLicenca(String idLicenca) {
        this.idLicenca = idLicenca;
    }
    
    
    public void PrescreverTratamento(){
        
    }
    
}
