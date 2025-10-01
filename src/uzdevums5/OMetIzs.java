package uzdevums5;

import javax.swing.JOptionPane;

import uzdevums1.MinkuTante;

public class OMetIzs {
	static void izsauktMetodi(int poga) {
		switch(poga) {
		case 0:
			int cPNr = OIzveide.cPIzvele();
			Figuras.centraObjekti.get(cPNr).parvietot(MinkuTante.skaitlaParbaude("Cik vienības pabīdīt pa x asi?", -100, 100), MinkuTante.skaitlaParbaude("Cik vienības pabīdīt pa y asi?", -100, 100));
			
			break;
			
		case 1:
			int cetNr = OIzveide.cetIzvele();
			
			JOptionPane.showMessageDialog(null, Figuras.cetrsturaObjekti.get(cetNr).rekinat(), "Četrstūra Laukums", JOptionPane.INFORMATION_MESSAGE);
			
			break;
			
		case 2:
			int aplNr = OIzveide.aplIzvele();
			String[] opcijas = {"Apļa laukums", "Riņķa līnija "};
			int izv;
			
			izv = JOptionPane.showOptionDialog(null, "Izvēlaties opciju", "Paziņojums", JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE, null, opcijas, opcijas);
			
			if(izv == 0)
				JOptionPane.showMessageDialog(null, Figuras.aplaObjekti.get(aplNr).rinkaLaukums(), "Apļa Laukums", JOptionPane.INFORMATION_MESSAGE);
			else if(izv == 1)
				
			break;
			
		case 3:
			int tritNr = OIzveide.triIzvele();
			
			JOptionPane.showMessageDialog(null, Figuras.trijsturaObjekti.get(tritNr).tLaukums(), "Trijstūra Laukums", JOptionPane.INFORMATION_MESSAGE);
			
			break;
			
		}
	}
}
