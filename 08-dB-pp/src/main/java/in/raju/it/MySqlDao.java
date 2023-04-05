package in.raju.it;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Repository;

@Repository("MySqldao")
@Primary
public class MySqlDao implements ReportDao {
public void generate_data() {
System.out.println("MySql data proced...");
	
}
}
