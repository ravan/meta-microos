SUMMARY = "Prometheus Java Simpleclient Servlet"
DESCRIPTION = "HTTP servlet exporter for the simpleclient."
LICENSE = "Apache-2.0 & CC0-1.0"

PV = "0.16.0"

RPM_NAME = "prometheus-simpleclient-java-servlet-common-0.16.0-2.2.noarch.rpm"
RPM_HASH = "13d54c35f141a09c613f287f5501eaeace967bc955892ee44aea879034d272acd87a03f8ed33cfe22093d9014438ecea30766f4c87aaeafbf3dfaa18dbdf2286"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "mvn-io.prometheus-simpleclient-servlet-common \
mvn-io.prometheus-simpleclient-servlet-common-pom- \
osgi-io.prometheus.simpleclient-servlet-common \
prometheus-simpleclient-java-servlet-common"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn-io.prometheus-simpleclient \
mvn-io.prometheus-simpleclient-common"

inherit rpm
