SUMMARY = "Prometheus Java Simpleclient Common"
DESCRIPTION = "Common code used by various modules of the Simpleclient."
LICENSE = "Apache-2.0 & CC0-1.0"

PV = "0.16.0"

RPM_NAME = "prometheus-simpleclient-java-common-0.16.0-2.2.noarch.rpm"
RPM_HASH = "ef5423916e11382528843fa19e7621638f2f16261e0f507b245c6dd4f5fd74bdbb29b758e2eaab69189fdba51ead69e150e42c4efb5bc9f5afc7e404e3d47708"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "mvn-io.prometheus-simpleclient-common \
mvn-io.prometheus-simpleclient-common-pom- \
osgi-io.prometheus.simpleclient-common \
prometheus-simpleclient-java-common"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn-io.prometheus-simpleclient"

inherit rpm
