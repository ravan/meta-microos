SUMMARY = "Java regression testing framework"
DESCRIPTION = "JUnit is a popular regression testing framework for Java platform."
LICENSE = "EPL-2.0"

PV = "5.14.4"

RPM_NAME = "junit5-5.14.4-2.2.noarch.rpm"
RPM_HASH = "be0024daa472484161d1a6cf18d8a54f8c2f6eb0d04def46248d17964d159990dbcee9f848ea6f26928e88df77f3c358fc853980bf51d9d7a806be047b22c8cf"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "junit5 \
mvn-org.junit.jupiter-junit-jupiter \
mvn-org.junit.jupiter-junit-jupiter-engine \
mvn-org.junit.jupiter-junit-jupiter-engine-pom- \
mvn-org.junit.jupiter-junit-jupiter-migrationsupport \
mvn-org.junit.jupiter-junit-jupiter-migrationsupport-pom- \
mvn-org.junit.jupiter-junit-jupiter-params \
mvn-org.junit.jupiter-junit-jupiter-params-pom- \
mvn-org.junit.jupiter-junit-jupiter-pom- \
mvn-org.junit.platform-junit-platform-console \
mvn-org.junit.platform-junit-platform-console-pom- \
mvn-org.junit.platform-junit-platform-runner \
mvn-org.junit.platform-junit-platform-runner-pom- \
mvn-org.junit.platform-junit-platform-suite-api \
mvn-org.junit.platform-junit-platform-suite-api-pom- \
mvn-org.junit.platform-junit-platform-suite-commons \
mvn-org.junit.platform-junit-platform-suite-commons-pom- \
mvn-org.junit.platform-junit-platform-suite-engine \
mvn-org.junit.platform-junit-platform-suite-engine-pom- \
mvn-org.junit.platform-junit-platform-testkit \
mvn-org.junit.platform-junit-platform-testkit-pom- \
mvn-org.junit.vintage-junit-vintage-engine \
mvn-org.junit.vintage-junit-vintage-engine-pom- \
osgi-junit-jupiter \
osgi-junit-jupiter-engine \
osgi-junit-jupiter-migrationsupport \
osgi-junit-jupiter-params \
osgi-junit-platform-console \
osgi-junit-platform-runner \
osgi-junit-platform-suite-api \
osgi-junit-platform-suite-commons \
osgi-junit-platform-suite-engine \
osgi-junit-platform-testkit \
osgi-junit-vintage-engine"

RDEPENDS:${PN} += "/usr/bin/bash \
java-headless \
javapackages-filesystem \
javapackages-tools \
junit5-minimal \
mvn-com.univocity-univocity-parsers \
mvn-info.picocli-picocli \
mvn-junit-junit \
mvn-org.assertj-assertj-core \
mvn-org.junit.jupiter-junit-jupiter-api \
mvn-org.junit.platform-junit-platform-commons \
mvn-org.junit.platform-junit-platform-engine \
mvn-org.junit.platform-junit-platform-launcher \
mvn-org.opentest4j-opentest4j"

inherit rpm
