SUMMARY = "Prometheus Java Simpleclient Graphite Bridge"
DESCRIPTION = "Graphite bridge for the Prometheus Java Simpleclient."
LICENSE = "Apache-2.0 & CC0-1.0"

PV = "0.16.0"

RPM_NAME = "prometheus-simpleclient-java-graphite_bridge-0.16.0-2.2.noarch.rpm"
RPM_HASH = "7aa463ff495677aa45d27fc182c4aaf180c8ef5ef5df00355de8d5877311e13e8f8ae730b383ea408e25ed826618af8dd8f6a9a4eebaf1232e406b1c491dfd11"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "mvn-io.prometheus-simpleclient-graphite-bridge \
mvn-io.prometheus-simpleclient-graphite-bridge-pom- \
osgi-io.prometheus.simpleclient-graphite-bridge \
prometheus-simpleclient-java-graphite-bridge"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn-io.prometheus-simpleclient"

inherit rpm
