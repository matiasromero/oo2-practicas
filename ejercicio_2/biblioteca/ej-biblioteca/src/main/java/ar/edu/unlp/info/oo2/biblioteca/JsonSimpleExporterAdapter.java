package ar.edu.unlp.info.oo2.biblioteca;

import java.util.List;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

public class JsonSimpleExporterAdapter extends VoorheesExporter {

	private String exportar(Socio socio) {
		JSONObject obj = new JSONObject();
		obj.put("nombre", socio.getNombre());
		obj.put("email", socio.getEmail());
		obj.put("legajo", socio.getLegajo());		
		return obj.toJSONString();
	}

	public String exportar(List<Socio> socios) {
		if (socios.isEmpty()) {
			return "[]";
		}
		
		JSONArray list = new JSONArray();
		socios.forEach(socio -> {
			list.add(this.exportar(socio));
		});
		
		return list.toJSONString().replaceAll("\\\\","");
	}
}
