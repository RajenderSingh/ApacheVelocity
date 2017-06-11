package sample1;

import java.io.StringWriter;

import org.apache.velocity.Template;
import org.apache.velocity.VelocityContext;
import org.apache.velocity.app.VelocityEngine;

public class Hello {

	public static void main(String[] args) {
		VelocityEngine ve = new VelocityEngine();
		ve.init();
		Template t = ve.getTemplate("./src/main/resources/templates/hello.vm");
		VelocityContext vc = new VelocityContext();
		vc.put("greet", "Hello World!!!");
		StringWriter sw = new StringWriter();
		t.merge(vc, sw);
		System.out.println(sw);
	}

}
