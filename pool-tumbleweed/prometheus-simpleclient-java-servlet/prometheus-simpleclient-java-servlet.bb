SUMMARY = "Prometheus Java Simpleclient Servlet (javax)"
DESCRIPTION = "HTTP servlet exporter for the simpleclient (Javax API)."
LICENSE = "Apache-2.0 & CC0-1.0"

PV = "0.16.0"

RPM_NAME = "prometheus-simpleclient-java-servlet-0.16.0-2.2.noarch.rpm"
RPM_HASH = "2bf5d01f3ac4405914dc825936cb56f3fd4adf8ef76b0b23751b781f468cecabf34b6dab8e90e2ddeda696c4d0cf672ca4ade6d9653feeb1efc8fc7bb64c5dd1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "mvn-io.prometheus-simpleclient-servlet \
mvn-io.prometheus-simpleclient-servlet-pom- \
osgi-io.prometheus.simpleclient-servlet \
prometheus-simpleclient-java-servlet"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn-io.prometheus-simpleclient \
mvn-io.prometheus-simpleclient-common \
mvn-io.prometheus-simpleclient-servlet-common"

inherit rpm
