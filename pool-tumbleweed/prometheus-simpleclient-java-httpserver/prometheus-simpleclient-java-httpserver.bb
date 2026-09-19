SUMMARY = "Prometheus Java Simpleclient Httpserver"
DESCRIPTION = "Httpserver exposition for the simpleclient."
LICENSE = "Apache-2.0 & CC0-1.0"

PV = "0.16.0"

RPM_NAME = "prometheus-simpleclient-java-httpserver-0.16.0-2.2.noarch.rpm"
RPM_HASH = "d825a1e6db8833670cd9992a50fad32a68b24d98b2ddebabe81b74ccdfd073b22570d05412ddba146e534306f37e656163b868caa57d78909cd302216c3ef3f2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "mvn-io.prometheus-simpleclient-httpserver \
mvn-io.prometheus-simpleclient-httpserver-pom- \
osgi-io.prometheus.simpleclient-httpserver \
prometheus-simpleclient-java-httpserver"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn-io.prometheus-simpleclient \
mvn-io.prometheus-simpleclient-common"

inherit rpm
