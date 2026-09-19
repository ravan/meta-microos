SUMMARY = "Prometheus Java Simpleclient Caffeine"
DESCRIPTION = "Metrics collector for caffeine based caches."
LICENSE = "Apache-2.0 & CC0-1.0"

PV = "0.16.0"

RPM_NAME = "prometheus-simpleclient-java-caffeine-0.16.0-2.2.noarch.rpm"
RPM_HASH = "0388afab5c8d80433d87555ff2239f4498f2267c16d6ba48625c0dd958c71f810e305361cd3cb2ff012993e79f24fc0daba7aa9c1600870caab61ba8c02c0589"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "mvn-io.prometheus-simpleclient-caffeine \
mvn-io.prometheus-simpleclient-caffeine-pom- \
osgi-io.prometheus.simpleclient-caffeine \
prometheus-simpleclient-java-caffeine"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn-com.github.ben-manes.caffeine-caffeine \
mvn-io.prometheus-simpleclient"

inherit rpm
