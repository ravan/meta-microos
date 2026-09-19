SUMMARY = "Prometheus Java Simpleclient Pushgateway"
DESCRIPTION = "Pushgateway exporter for the simpleclient."
LICENSE = "Apache-2.0 & CC0-1.0"

PV = "0.16.0"

RPM_NAME = "prometheus-simpleclient-java-pushgateway-0.16.0-2.2.noarch.rpm"
RPM_HASH = "62101a5e8d008a762b8cced373f7290fb61f2cedecd0b0d1fb168f776ae73f403248a43932af2a3bf646c303ca031d2167f2dff86ffe8bff91d94cbe47c8823f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "mvn-io.prometheus-simpleclient-pushgateway \
mvn-io.prometheus-simpleclient-pushgateway-pom- \
osgi-io.prometheus.simpleclient-pushgateway \
prometheus-simpleclient-java-pushgateway"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn-io.prometheus-simpleclient \
mvn-io.prometheus-simpleclient-common"

inherit rpm
