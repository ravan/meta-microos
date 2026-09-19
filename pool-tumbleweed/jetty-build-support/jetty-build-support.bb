SUMMARY = "Jetty build support files"
DESCRIPTION = "Build Support for Jetty. Contains enforcer rules, PMD rulesets, etc."
LICENSE = "Apache-2.0 | EPL-1.0"

PV = "1.5"

RPM_NAME = "jetty-build-support-1.5-5.4.noarch.rpm"
RPM_HASH = "0804172f33fad3ab0f7d35ab784664f5ac9b311cb52861a0be9604bb3b9b4799bef1d7045b413c9ca0b6849137061a52f4aba3e553b8ff76d3319298a5e0091b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "jetty-build-support \
mvn-org.eclipse.jetty.toolchain-jetty-build-support \
mvn-org.eclipse.jetty.toolchain-jetty-build-support-pom-"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn-org.apache.maven-maven-artifact \
mvn-org.apache.maven-maven-core \
mvn-org.apache.maven-maven-plugin-api \
mvn-org.apache.maven.enforcer-enforcer-api \
mvn-org.apache.maven.plugins-maven-shade-plugin \
mvn-org.apache.maven.shared-maven-shared-utils \
mvn-org.codehaus.plexus-plexus-container-default \
mvn-org.junit.jupiter-junit-jupiter-engine \
mvn-org.junit.jupiter-junit-jupiter-params"

inherit rpm
