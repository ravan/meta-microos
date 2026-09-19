SUMMARY = "Prometheus Java Simpleclient Jetty"
DESCRIPTION = "Collector of data from Jetty StatisticsHandler."
LICENSE = "Apache-2.0 & CC0-1.0"

PV = "0.16.0"

RPM_NAME = "prometheus-simpleclient-java-jetty-0.16.0-2.2.noarch.rpm"
RPM_HASH = "151bcf53d44e554ca2745c91eca49fa32cdcd01cfd5cbc213d53c07feb2288d512f53d108b90deb148ee062ccc84175014e8aa27871a09ddcc4e69887b332d90"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "mvn-io.prometheus-simpleclient-jetty \
mvn-io.prometheus-simpleclient-jetty-pom- \
osgi-io.prometheus.simpleclient-jetty \
prometheus-simpleclient-java-jetty"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn-io.prometheus-simpleclient \
mvn-org.eclipse.jetty-jetty-server \
mvn-org.eclipse.jetty-jetty-servlet"

inherit rpm
