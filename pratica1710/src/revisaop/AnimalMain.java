package revisaop;

import java.util.ArrayList;

public class AnimalMain {

	public static void main(String[] args) {
		
		ArrayList<Gato> gatenhos = new ArrayList<>();
		
		ArrayList<Cachorro> caes = new ArrayList<>();
		
		
		Gato a = new Gato();
		
		a.setNome("armando");
		a.setPatas(4);
		a.setRaça("bonito");
		a.setCor("preto");
		a.setEcossitema("santa catarina");
		a.setComprimento(44.1f);
		
	
		Gato loco = new Gato();
		
		loco.setNome("gato louco");
		loco.setPatas(4);
		loco.setRaça("feio");
		loco.setCor("branco");
		loco.setEcossitema("santa catarina");
		loco.setComprimento(44.9f);
		
		Gato x = new Gato();
		
		x.setNome("xujo");
		x.setPatas(4);
		x.setRaça("arisco");
		x.setCor("laranja");
		x.setEcossitema("santa catarina");
		x.setComprimento(40.8f);
		
		Cachorro j = new Cachorro();
		
		j.setNome("fimo");
		j.setPatas(4);
		j.setRaça("vira lata");
		j.setCor("beje");
		j.setEcossitema("santa catarina");
		j.setComprimento(68.12f);
		
		Cachorro pipo = new Cachorro();
		
		pipo.setNome("pipinha");
		pipo.setPatas(4);
		pipo.setRaça("hot vailer");
		pipo.setCor("preto escuro");
		pipo.setEcossitema("santa catarina");
		pipo.setComprimento(89.0f);
		
		Cachorro noia = new Cachorro();
		
		noia.setNome("manco");
		noia.setPatas(3);
		noia.setRaça("pastor alemão");
		noia.setCor("cinza");
		noia.setEcossitema("santa catarina");
		noia.setComprimento(99.3f);

		
		gatenhos.add(a);
		gatenhos.add(loco);
		gatenhos.add(x);
		
		caes.add(j);
		caes.add(pipo);
		caes.add(noia);
		
		
		
		for (Cachorro cachorro : caes) {
			System.out.println(cachorro.getNome());
			System.out.println(cachorro.getRaça());
			System.out.println(cachorro.getPatas());
			System.out.println(cachorro.getComprimento());
			System.out.println(cachorro.getEcossitema());
			System.out.println(cachorro.getCor());
			
		}
		Cachorro ll = new Cachorro();
		
		
		for (Gato gato : gatenhos) {
			System.out.println(gato.getNome());
			System.out.println(gato.getRaça());
			System.out.println(gato.getPatas());
			System.out.println(gato.getComprimento());
			System.out.println(gato.getEcossitema());
			System.out.println(gato.getCor());
		}
		
		Gato mn = new Gato();	
		
		mn.Mia();
		//fim
		ll.late();
		
		
		
		
		
		
		
	}

}
