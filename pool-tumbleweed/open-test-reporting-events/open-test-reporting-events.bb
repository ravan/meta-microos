SUMMARY = "Module 'events' of open-test-reporting"
DESCRIPTION = "Test reporting formats that are agnostic of testing framework \
and programming language. \
This package contains the module 'events'"
LICENSE = "Apache-2.0"

PV = "0.1.0~M2"

RPM_NAME = "open-test-reporting-events-0.1.0~M2-2.9.noarch.rpm"
RPM_HASH = "d989a7eff5e9ec207f2e61e51ba437db8eec3e426bc17fe50f24a3e5e5cc569d43da207907847c195c4e40e97a994889023307bb1d3302b5cab9ccd4c9a4e074"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "mvn-org.opentest4j.reporting-open-test-reporting-events \
mvn-org.opentest4j.reporting-open-test-reporting-events-pom- \
open-test-reporting-events"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn-org.opentest4j.reporting-open-test-reporting-schema"

inherit rpm
