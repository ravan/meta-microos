SUMMARY = "Prometheus Java Simpleclient Jetty JDK 8"
DESCRIPTION = "Collector of data from Jetty Statistics for Jetty versions which require JDK 8."
LICENSE = "Apache-2.0 & CC0-1.0"

PV = "0.16.0"

RPM_NAME = "prometheus-simpleclient-java-jetty_jdk8-0.16.0-2.2.noarch.rpm"
RPM_HASH = "9a7229bda014b75e4856367cdab7f99c1651c669ff350a8ffe9e66c2bbcbcdbb9121ffabd7a4a0ace0a10b015f9578efa43ad27c58d376c3615bda712ac014f6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "mvn-io.prometheus-simpleclient-jetty-jdk8 \
mvn-io.prometheus-simpleclient-jetty-jdk8-pom- \
osgi-io.prometheus.simpleclient-jetty-jdk8 \
prometheus-simpleclient-java-jetty-jdk8"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn-io.prometheus-simpleclient \
mvn-org.eclipse.jetty-jetty-server \
mvn-org.eclipse.jetty-jetty-servlet"

inherit rpm
