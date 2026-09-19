SUMMARY = "Prometheus Java Span Context Supplier - Common"
DESCRIPTION = "Prometheus Java Span Context Supplier - Common."
LICENSE = "Apache-2.0 & CC0-1.0"

PV = "0.16.0"

RPM_NAME = "prometheus-simpleclient-java-tracer-common-0.16.0-2.2.noarch.rpm"
RPM_HASH = "2de7ccf226e578f7e0ce956f58665859acc8b60baf9633fdf8a11483932acc6820c5999d68fda0a1ab9b0f8174d951072258cdf8702ade8a6b1fb37161dbdb7a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "mvn-io.prometheus-simpleclient-tracer-common \
mvn-io.prometheus-simpleclient-tracer-common-pom- \
osgi-io.prometheus.simpleclient-tracer-common \
prometheus-simpleclient-java-tracer-common"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem"

inherit rpm
