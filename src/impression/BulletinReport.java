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
public class BulletinReport {
    public void afficherReport(int nbre){
        int numc = nbre;
        try{
            JasperDesign jd = JRXmlLoader.load("src\\report\\BulletinReport.jrxml");
            String sql ="SELECT\n"+
                        "bulletin.`id` AS bulletin_id,\n"+
                        "bulletin.`id_etu` AS bulletin_id_etu,\n"+
                        "bulletin.`nom` AS bulletin_nom,\n"+
                        "bulletin.`prenom` AS bulletin_prenom,\n"+
                        "bulletin.`classe` AS bulletin_classe,\n"+
                        "bulletin.`filiere` AS bulletin_filiere,\n"+
                        "bulletin.`annee` AS bulletin_annee,\n"+
                        "bulletin.`semestre` AS bulletin_semestre,\n"+
                        "bulletin.`java` AS bulletin_java,\n"+
                        "bulletin.`langc` AS bulletin_langc,\n"+
                        "bulletin.`php` AS bulletin_php,\n"+
                        "bulletin.`sys` AS bulletin_sys,\n"+
                        "bulletin.`math` AS bulletin_math,\n"+
                        "bulletin.`reseau` AS bulletin_reseau,\n"+
                        "bulletin.`somme` AS bulletin_somme,\n"+
                        "bulletin.`moy` AS bulletin_moy,\n"+
                        "bulletin.`etat` AS bulletin_etat\n"+
                   "FROM\n"+
                        "`bulletin` bulletin WHERE bulletin.id >= "+numc+"\n";
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
    
           

 

