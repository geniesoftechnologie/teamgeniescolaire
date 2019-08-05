/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package impression;

import dao.Connect;
import javax.swing.JOptionPane;
import net.sf.jasperreports.engine.JasperCompileManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.design.JRDesignQuery;
import net.sf.jasperreports.engine.design.JasperDesign;
import net.sf.jasperreports.engine.xml.JRXmlLoader;
import net.sf.jasperreports.view.JasperViewer;

/**
 *
 * @author HP
 */
public class InscriptionGeneral {
    public void afficherReport(int txt_id_etu){
        int numc = txt_id_etu;
        try{
            JasperDesign jd = JRXmlLoader.load("src\\report\\InscriptionG.jrxml");
            String sql ="SELECT\n"+
                    "inscription.`id` AS inscription_id,\n"+
                    "inscription.`id_etu` AS inscription_id_etu,\n"+
                    "inscription.`nom` AS inscription_nom,\n"+
                    "inscription.`prenom` AS inscription_prenom,\n"+
                    "inscription.`classe` AS inscription_classe,\n"+
                    "inscription.`filiere` AS inscription_filiere,\n"+
                    "inscription.`annee` AS inscription_annee,\n"+
                    "inscription.`fraisIns` AS inscription_fraisIns,\n"+
                    "inscription.`fraisAca` AS inscription_fraisAca,\n"+
                    "inscription.`dateIns` AS inscription_dateIns\n"+
               "FROM\n"+
                    "`inscription` inscription WHERE inscription.id_etu="+numc+"\n";
            System.out.println("Query");
            
            JRDesignQuery newQuery = new JRDesignQuery();
            newQuery.setText(sql);
            jd.setQuery(newQuery);
            JasperReport jasperReport = JasperCompileManager.compileReport(jd);
            JasperPrint jasperprint = JasperFillManager.fillReport(jasperReport,null, Connect.getInstance());
            JasperViewer.viewReport(jasperprint, false);
        }catch(Exception ex){
            JOptionPane.showMessageDialog(null, ex.getMessage(),"Messege", JOptionPane.PLAIN_MESSAGE);
        }
        }
    }
    
           

 

