SUMMARY = "Test framework project"
DESCRIPTION = "Surefire is a test framework project."
LICENSE = "Apache-2.0 & CPL-1.0"

PV = "3.6.0"

RPM_NAME = "maven-surefire-3.6.0-1.1.noarch.rpm"
RPM_HASH = "7317e236826243ff4a600429161771e8b7a94132892f9e5e2d4f9720313068a2dff2e48995c685d0b9dadf3c92906e8aae6837980b3a787c05ec8b07df3ee30c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "maven-surefire \
mvn-org.apache.maven.surefire-common-java5 \
mvn-org.apache.maven.surefire-common-java5-pom- \
mvn-org.apache.maven.surefire-maven-surefire-common \
mvn-org.apache.maven.surefire-maven-surefire-common-pom- \
mvn-org.apache.maven.surefire-surefire-api \
mvn-org.apache.maven.surefire-surefire-api-pom- \
mvn-org.apache.maven.surefire-surefire-booter \
mvn-org.apache.maven.surefire-surefire-booter-pom- \
mvn-org.apache.maven.surefire-surefire-extensions-api \
mvn-org.apache.maven.surefire-surefire-extensions-api-pom- \
mvn-org.apache.maven.surefire-surefire-extensions-spi \
mvn-org.apache.maven.surefire-surefire-extensions-spi-pom- \
mvn-org.apache.maven.surefire-surefire-logger-api \
mvn-org.apache.maven.surefire-surefire-logger-api-pom-"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn-org.apache.commons-commons-compress \
mvn-org.apache.commons-commons-lang3 \
mvn-org.apache.maven.resolver-maven-resolver-util \
mvn-org.apache.maven.shared-maven-common-artifact-filters \
mvn-org.apache.maven.shared-maven-shared-utils \
mvn-org.codehaus.plexus-plexus-java \
procps"

inherit rpm
