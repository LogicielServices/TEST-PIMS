package muzammil.runner;

import Services.dashboardTests;
import org.junit.platform.suite.api.SelectClasses;
import org.junit.platform.suite.api.Suite;

@Suite
@SelectClasses(dashboardTests.class)
public class RunMainTest {
}
