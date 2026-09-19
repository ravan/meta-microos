SUMMARY = "Prometheus Java Simpleclient guava"
DESCRIPTION = "Metrics collector for guava based caches."
LICENSE = "Apache-2.0 & CC0-1.0"

PV = "0.16.0"

RPM_NAME = "prometheus-simpleclient-java-guava-0.16.0-2.2.noarch.rpm"
RPM_HASH = "0abcf2464ed3564876b16a1cb700762aaabc855d7f8d256a2fb757293b6baac4bb70f382fbebfdafc8abfaf10e7b14c459c80175997a03fed19c24f9dccb5cbe"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "mvn-io.prometheus-simpleclient-guava \
mvn-io.prometheus-simpleclient-guava-pom- \
osgi-io.prometheus.simpleclient-guava \
prometheus-simpleclient-java-guava"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn-com.google.guava-guava \
mvn-io.prometheus-simpleclient"

inherit rpm
