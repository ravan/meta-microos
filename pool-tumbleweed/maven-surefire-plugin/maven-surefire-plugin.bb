SUMMARY = "Surefire plugin for maven"
DESCRIPTION = "Maven surefire plugin for running tests via the surefire framework."
LICENSE = "Apache-2.0 & CPL-1.0"

PV = "3.6.0"

RPM_NAME = "maven-surefire-plugin-3.6.0-1.1.noarch.rpm"
RPM_HASH = "044edfea620fa5380ca664d1df230a92005bc20ad1c22c1ae1af3e4d6108cebbc8bd58c7b8cc4b235645f3cbc8f3af4c492dcfa9f814ee4cb730b21451c3a5d1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "maven-surefire-plugin \
mvn-org.apache.maven.plugins-maven-surefire-plugin \
mvn-org.apache.maven.plugins-maven-surefire-plugin-pom-"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn-org.apache.maven.surefire-maven-surefire-common \
mvn-org.apache.maven.surefire-surefire-api \
mvn-org.apache.maven.surefire-surefire-extensions-api \
mvn-org.slf4j-slf4j-simple"

inherit rpm
