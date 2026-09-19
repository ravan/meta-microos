SUMMARY = "Plugin to sign/verify a project artifact and attachments using jarsigner"
DESCRIPTION = "This plugin provides the capability to sign or verify \
a project artifact and attachments using jarsigner. \
 \
If you need to sign a project artifact and all attached artifacts, \
just configure the sign goal appropriately in your pom.xml \
for the signing to occur automatically during the package phase. \
 \
If you need to verify the signatures of a project artifact \
and all attached artifacts, just configure the verify goal \
appropriately in your pom.xml for the verification to occur \
automatically during the verify phase."
LICENSE = "Apache-2.0"

PV = "3.0.0"

RPM_NAME = "maven-jarsigner-plugin-3.0.0-4.16.noarch.rpm"
RPM_HASH = "b5c54849228075ce6b73c5249d6988162f9ba5c2102cb61277ab145f10352af0d679c71f16e48c4038f1491f620739abe64386db65b6d9ae0bd76b883849cef3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "maven-jarsigner-plugin \
mvn-org.apache.maven.plugins-maven-jarsigner-plugin \
mvn-org.apache.maven.plugins-maven-jarsigner-plugin-pom-"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn-org.apache.maven-maven-artifact \
mvn-org.apache.maven-maven-core \
mvn-org.apache.maven-maven-plugin-api \
mvn-org.apache.maven-maven-settings \
mvn-org.apache.maven.shared-maven-jarsigner \
mvn-org.apache.maven.shared-maven-shared-utils \
mvn-org.sonatype.plexus-plexus-sec-dispatcher"

inherit rpm
