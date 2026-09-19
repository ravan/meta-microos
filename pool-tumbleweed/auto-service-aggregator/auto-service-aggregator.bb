SUMMARY = "AutoService Aggregator"
DESCRIPTION = "Aggregator POM for @AutoService."
LICENSE = "Apache-2.0"

PV = "1.6.1"

RPM_NAME = "auto-service-aggregator-1.6.1-3.4.noarch.rpm"
RPM_HASH = "71b0ad26fe0ed6cc964e6aba54bb0d5c7d8166e81896da66e7a004953bcecc8b15ca3008e250e16e6deb1b73498f7f61cbc90d17cdb7b1cbd4fff3ee8d3471d4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "auto-service-aggregator \
mvn-com.google.auto.service-auto-service-aggregator-pom-"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn-org.sonatype.oss-oss-parent-pom-"

inherit rpm
