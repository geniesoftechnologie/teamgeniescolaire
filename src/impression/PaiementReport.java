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
public class PaiementReport {
    public void afficherReport(int txt_id_etu){
        int numc = txt_id_etu;
        try{
            JasperDesign jd = JRXmlLoader.load("src\\report\\Paiement.jrxml");
                  String sql ="SELECT\n"+
                     "paiement.`id` AS paiement_id,\n"+
                     "paiement.`id_etu` AS paiement_id_etu,\n"+
                     "paiement.`nom` AS paiement_nom,\n"+
                     "paiement.`prenom` AS paiement_prenom,\n"+
                     "paiement.`classe` AS paiement_classe,\n"+
                     "paiement.`filiere` AS paiement_filiere,\n"+
                     "paiement.`annee` AS paiement_annee,\n"+
                     "paiement.`montant` AS paiement_montant,\n"+
                     "paiement.`dateIns` AS paiement_dateIns\n"+
                "FROM\n"+
                     "`paiement` paiement where paiement.id ="+numc+"\n";
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
    
           

 

