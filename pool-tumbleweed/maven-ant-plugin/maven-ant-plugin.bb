SUMMARY = "Apache Maven Ant Plugin"
DESCRIPTION = "The Ant Plugin generates build files for Ant 1.6.2 or above from the POM."
LICENSE = "Apache-2.0"

PV = "2.4"

RPM_NAME = "maven-ant-plugin-2.4-5.8.noarch.rpm"
RPM_HASH = "8398367d66569324ac86f2a1e8017b989ae86521d7cbaa65f7eac745241f546b7b3d7b0ed9cdf738a9d0c1275bd1215621a420059e0f6674a77e74059d2247a2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "maven-ant-plugin \
mvn-org.apache.maven.plugins-maven-ant-plugin \
mvn-org.apache.maven.plugins-maven-ant-plugin-pom-"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn-org.apache.ant-ant \
mvn-org.apache.maven-maven-artifact \
mvn-org.apache.maven-maven-compat \
mvn-org.apache.maven-maven-core \
mvn-org.apache.maven-maven-model \
mvn-org.apache.maven-maven-plugin-api \
mvn-org.apache.maven-maven-settings \
mvn-org.codehaus.plexus-plexus-utils \
mvn-xalan-xalan \
mvn-xml-apis-xml-apis"

inherit rpm
