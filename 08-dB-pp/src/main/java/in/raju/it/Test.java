package in.raju.it;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import in.raju.AppConfig;

public class Test {
public static void main(String[] args) {
	ApplicationContext ctx=new AnnotationConfigApplicationContext(AppConfig.class);
	ReportService bean = ctx.getBean(ReportService.class);
	bean.generateReport();
}
}
