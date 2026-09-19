SUMMARY = "Prometheus Java Simpleclient logback"
DESCRIPTION = "Metrics collector for logback appender logging."
LICENSE = "Apache-2.0 & CC0-1.0"

PV = "0.16.0"

RPM_NAME = "prometheus-simpleclient-java-logback-0.16.0-2.2.noarch.rpm"
RPM_HASH = "488948d9c73b669744d6475834d809d9fba21ce33d13384df1c373baaef4c4a70dc3bd355630015089cc65b26f6344cdb7d3b7de1ceb58925c4b076f5bf9fcf4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "mvn-io.prometheus-simpleclient-logback \
mvn-io.prometheus-simpleclient-logback-pom- \
osgi-io.prometheus.simpleclient-logback \
prometheus-simpleclient-java-logback"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn-ch.qos.logback-logback-classic \
mvn-io.prometheus-simpleclient"

inherit rpm
