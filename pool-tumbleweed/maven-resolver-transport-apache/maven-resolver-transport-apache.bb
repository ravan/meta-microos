SUMMARY = "Maven Artifact Resolver Transport Apache"
DESCRIPTION = "A transport implementation for repositories using http:// and https:// URLs."
LICENSE = "Apache-2.0"

PV = "2.0.22"

RPM_NAME = "maven-resolver-transport-apache-2.0.22-1.1.noarch.rpm"
RPM_HASH = "14e1f5c7189b091517adc01e45256a4e8476c4fd83878058c43cd28b54793c43323bdb9a95c55eb005b818318da7f6429395ed348404cbe8b3147d09b86629ec"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "maven-resolver-transport-apache \
mvn-org.apache.maven.resolver-maven-resolver-transport-apache \
mvn-org.apache.maven.resolver-maven-resolver-transport-apache-pom- \
mvn-org.eclipse.aether-aether-transport-apache \
mvn-org.eclipse.aether-aether-transport-apache-pom- \
osgi-org.apache.maven.resolver.transport.apache"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn-commons-codec-commons-codec \
mvn-org.apache.httpcomponents-httpclient \
mvn-org.apache.httpcomponents-httpcore \
mvn-org.apache.maven.resolver-maven-resolver-api \
mvn-org.apache.maven.resolver-maven-resolver-spi \
mvn-org.apache.maven.resolver-maven-resolver-util \
mvn-org.slf4j-jcl-over-slf4j \
mvn-org.slf4j-slf4j-api"

inherit rpm
