SUMMARY = "Apache Commons Parent Pom"
DESCRIPTION = "The Project Object Model files for the apache-commons packages."
LICENSE = "Apache-2.0"

PV = "81"

RPM_NAME = "apache-commons-parent-81-1.4.noarch.rpm"
RPM_HASH = "ea4898556fc4b383fe50a7ef77fd532233ac100a949d5868974acdaf8ebd6afda5409e17a33f7aade67aed54f850a699978db31f399d6643f3fd1135d781e741"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "apache-commons-parent \
mvn-org.apache.commons-commons-parent-pom-"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn-org.apache-apache-pom- \
mvn-org.apache.felix-maven-bundle-plugin \
mvn-org.apache.maven.plugins-maven-antrun-plugin \
mvn-org.apache.maven.plugins-maven-assembly-plugin \
mvn-org.apache.maven.plugins-maven-compiler-plugin \
mvn-org.apache.maven.plugins-maven-jar-plugin \
mvn-org.apache.maven.plugins-maven-surefire-plugin \
mvn-org.codehaus.mojo-build-helper-maven-plugin"

inherit rpm
