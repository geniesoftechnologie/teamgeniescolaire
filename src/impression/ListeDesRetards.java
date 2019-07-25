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
public class ListeDesRetards {
    public void afficherReport(String classe, String filiere, int montant){
        String classes = classe;
        String filieres = filiere;
        try{
            JasperDesign jd = JRXmlLoader.load("src\\report\\listeRetard.jrxml");
            String sql ="SELECT\n"+
                        "etatetudiant.`id` AS etatetudiant_id,\n"+
                        "etatetudiant.`nom` AS etatetudiant_nom,\n"+
                        "etatetudiant.`prenom` AS etatetudiant_prenom,\n"+
                        "etatetudiant.`classe` AS etatetudiant_classe,\n"+
                        "etatetudiant.`filiere` AS etatetudiant_filiere,\n"+
                        "etatetudiant.`paiement` AS etatetudiant_paiement,\n"+
                        "etatetudiant.`Dette` AS etatetudiant_Dette\n"+
                   "FROM\n"+
                        "`etatetudiant` etatetudiant WHERE etatetudiant.classe='"+classes+"' and etatetudiant.filiere='"+filieres+"'and etatetudiant.Dette >='"+montant+"' \n";
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
    
           

 

