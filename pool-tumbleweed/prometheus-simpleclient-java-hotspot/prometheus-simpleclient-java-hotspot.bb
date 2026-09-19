SUMMARY = "Prometheus Java Simpleclient Hotspot"
DESCRIPTION = "Collectors of data from Java Hotspot."
LICENSE = "Apache-2.0 & CC0-1.0"

PV = "0.16.0"

RPM_NAME = "prometheus-simpleclient-java-hotspot-0.16.0-2.2.noarch.rpm"
RPM_HASH = "27a4ef70e3c227ac5048f0ceeb0364dc1096d1dc9230647aed9d7c273445bc8f2510820ea4955e67b239ca883cee541bc1d2c86bb0934d809c7326c9048a4211"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "mvn-io.prometheus-simpleclient-hotspot \
mvn-io.prometheus-simpleclient-hotspot-pom- \
osgi-io.prometheus.simpleclient-hotspot \
prometheus-simpleclient-java-hotspot"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn-io.prometheus-simpleclient"

inherit rpm
