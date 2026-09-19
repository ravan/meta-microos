SUMMARY = "Prometheus Java Simpleclient log4j"
DESCRIPTION = "Metrics collector for log4j appender logging."
LICENSE = "Apache-2.0 & CC0-1.0"

PV = "0.16.0"

RPM_NAME = "prometheus-simpleclient-java-log4j-0.16.0-2.2.noarch.rpm"
RPM_HASH = "cfee3a2ca22d66d650c8a2e6bb0a7752333bf6d0c5aa4b06311995e7f0a1ac7e4d946fc775a7955ccf49a921f302a33681c66030ae74d1e898546cfed6111007"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "mvn-io.prometheus-simpleclient-log4j \
mvn-io.prometheus-simpleclient-log4j-pom- \
osgi-io.prometheus.simpleclient-log4j \
prometheus-simpleclient-java-log4j"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn-io.prometheus-simpleclient"

inherit rpm
