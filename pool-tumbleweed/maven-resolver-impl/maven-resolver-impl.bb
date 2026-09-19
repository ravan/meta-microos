SUMMARY = "Maven Artifact Resolver Implementation"
DESCRIPTION = "An implementation of the repository system."
LICENSE = "Apache-2.0"

PV = "2.0.22"

RPM_NAME = "maven-resolver-impl-2.0.22-1.1.noarch.rpm"
RPM_HASH = "54522309ed2f4d2c16b75bed0dccd8669b5cc946e711b44d53bf683677241900896ce7082eff36a592c268e9c7b898b77c2e7c614b84ba6e2a6b7f7baa9507d9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "maven-resolver-impl \
mvn-org.apache.maven.resolver-maven-resolver-impl \
mvn-org.apache.maven.resolver-maven-resolver-impl-pom- \
mvn-org.eclipse.aether-aether-impl \
mvn-org.eclipse.aether-aether-impl-pom- \
osgi-org.apache.maven.resolver.impl"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn-org.apache.maven.resolver-maven-resolver-api \
mvn-org.apache.maven.resolver-maven-resolver-named-locks \
mvn-org.apache.maven.resolver-maven-resolver-spi \
mvn-org.apache.maven.resolver-maven-resolver-util \
mvn-org.slf4j-slf4j-api"

inherit rpm
