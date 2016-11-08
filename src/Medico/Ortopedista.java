/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Medico;

import hospital.Imagiologia;

/**
 *
 * @author UserPL022Pc17
 */
public class Ortopedista extends Medico {
    
    public void analisar(Imagiologia raiox){}
    
    public Ortopedista(Integer anoDoutoramento, String instEnsino, String idLicenca) {
        super(anoDoutoramento, instEnsino, idLicenca);
    }
    
}
