SUMMARY = "Prometheus Java Span Context Supplier - Parent"
DESCRIPTION = "Prometheus Java Span Context Supplier - Parent POM."
LICENSE = "Apache-2.0 & CC0-1.0"

PV = "0.16.0"

RPM_NAME = "prometheus-simpleclient-java-tracer-0.16.0-2.2.noarch.rpm"
RPM_HASH = "ca3341e5e0c13cff2f5bacaea835dc642820883e86f6786aadecd4217830ed0c5c28a248cf8e6f362e10c825efa7ff88463c5a19fb080cb5a4e6c514013356d8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "mvn-io.prometheus-simpleclient-tracer-pom- \
prometheus-simpleclient-java-tracer"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn-io.prometheus-parent-pom-"

inherit rpm
