SUMMARY = "Prometheus Java Simpleclient log4j2"
DESCRIPTION = "Metrics collector for log4j2 appender logging."
LICENSE = "Apache-2.0 & CC0-1.0"

PV = "0.16.0"

RPM_NAME = "prometheus-simpleclient-java-log4j2-0.16.0-2.2.noarch.rpm"
RPM_HASH = "85b402d4146719b8db82d5cc74bfc3c6948e6f580fb54855f645f92171d44b8d13bc1251f5bfb98801a2c3992a75686baa5e8b4c411c8baf422421106cd4255e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "mvn-io.prometheus-simpleclient-log4j2 \
mvn-io.prometheus-simpleclient-log4j2-pom- \
osgi-io.prometheus.simpleclient-log4j2 \
prometheus-simpleclient-java-log4j2"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn-io.prometheus-simpleclient"

inherit rpm
