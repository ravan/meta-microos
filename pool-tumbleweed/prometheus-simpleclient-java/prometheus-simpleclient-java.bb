SUMMARY = "Prometheus Java Suite"
DESCRIPTION = "The Prometheus Java Suite: Client Metrics, Exposition, and Examples."
LICENSE = "Apache-2.0 & CC0-1.0"

PV = "0.16.0"

RPM_NAME = "prometheus-simpleclient-java-0.16.0-2.2.noarch.rpm"
RPM_HASH = "cd0263d4c4a3dd03e056c7b5126a7614aecedf66f59592e2f0dc41c8bbd5b557be6ffba724ccd3cc02834ef1db5b1e9cabb60320ad63fe2304162411ced27a8d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "mvn-io.prometheus-simpleclient \
mvn-io.prometheus-simpleclient-pom- \
osgi-io.prometheus.simpleclient \
prometheus-simpleclient-java"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn-io.prometheus-simpleclient-tracer-common"

inherit rpm
