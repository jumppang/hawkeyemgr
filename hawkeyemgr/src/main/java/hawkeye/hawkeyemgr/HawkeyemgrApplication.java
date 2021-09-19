package hawkeye.hawkeyemgr;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import hawkeye.common.core.hawkeyMgrBase;

@SpringBootApplication
public class HawkeyemgrApplication extends hawkeyMgrBase {

	public static void main(String[] args) throws Exception {
		SpringApplication.run(HawkeyemgrApplication.class, args);
	}

}
