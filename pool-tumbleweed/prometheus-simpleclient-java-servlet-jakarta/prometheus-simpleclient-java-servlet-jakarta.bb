SUMMARY = "Prometheus Java Simpleclient Servlet (jakarta)"
DESCRIPTION = "HTTP servlet exporter for the simpleclient (Jakarta API)."
LICENSE = "Apache-2.0 & CC0-1.0"

PV = "0.16.0"

RPM_NAME = "prometheus-simpleclient-java-servlet-jakarta-0.16.0-2.2.noarch.rpm"
RPM_HASH = "990cef5a26228a73c0a2b4d3ca61150949617e2281190599fd7ebdd505a71eec70d8fbc106e0ed96bb7dda0e4f5dd22a458e74fc27505714d90b9a355cb6f14c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "mvn-io.prometheus-simpleclient-servlet-jakarta \
mvn-io.prometheus-simpleclient-servlet-jakarta-pom- \
osgi-io.prometheus.simpleclient-servlet-jakarta \
prometheus-simpleclient-java-servlet-jakarta"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn-io.prometheus-simpleclient \
mvn-io.prometheus-simpleclient-common \
mvn-io.prometheus-simpleclient-servlet-common"

inherit rpm
