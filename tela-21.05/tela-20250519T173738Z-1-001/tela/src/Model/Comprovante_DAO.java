package Model;

import java.io.FileOutputStream;
import java.io.OutputStream;
import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.PageSize;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfWriter;
import java.awt.Desktop;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import javax.swing.JOptionPane;

public class Comprovante_DAO {
    public static void Gerando_Comprovante() throws FileNotFoundException, DocumentException, IOException{
        Document doc = null;
        OutputStream os = null;
        String x = JOptionPane.showInputDialog(null, "Digite o seu nome ?");
        String y = JOptionPane.showInputDialog(null, "Digite a data  ?");  
   
        try {

            //cria o documento tamanho A4, margens de 2,54cm
            doc = new Document(PageSize.A4, 72, 72, 72, 72);

            //cria a stream de saída
            os = new FileOutputStream("Relatorio1.pdf");

            //associa a stream de saída ao
            PdfWriter.getInstance(doc, os);

            //abre o documento
            doc.open();

            //adiciona o texto ao PDF
            Paragraph par = new Paragraph("Ticket   \n Nome : " + x +"  \n e a data é  " + y);
            doc.add(par);
           
            Paragraph par2 = new Paragraph("Ticket   \n Nome : " + x +"  \n e a data é  " + y);
            doc.add(par2);

        } finally {

            if (doc != null) {

                //fechamento do documento
                doc.close();
            }

            if (os != null) {
                //fechamento da stream de saída
                os.close();
            }
        }
       
        Desktop.getDesktop().open(new File("C:\\Users\\Alunos\\Documents\\Comprovante.pdf"));
    }
}
        
    

