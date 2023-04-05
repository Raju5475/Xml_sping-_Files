package in.raju.it;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Repository;

@Repository("Oracledao")
@Primary
public class OracleDao implements ReportDao {
public void generate_data() {
		System.out.println("Oracle DBMS Data Printed...");
		
	}

}
