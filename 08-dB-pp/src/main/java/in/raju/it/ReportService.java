package in.raju.it;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
public class ReportService {
	private ReportDao dao;
	public ReportService() {
		System.out.println("0-param Constructor...");
	}
	@Autowired
	//@Qualifier("MySqldao")
	public ReportService(ReportDao dao) {
		this.dao=dao;
		System.out.println("Constructor called...");
		
	}

	public void generateReport() {
		dao.generate_data();
		System.out.println("data Generated...");
	}
}
