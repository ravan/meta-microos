SUMMARY = "Apache Maven JMod Plugin"
DESCRIPTION = "Create JMod files http://openjdk.java.net/jeps/261"
LICENSE = "Apache-2.0"

PV = "3.0.0"

RPM_NAME = "maven-jmod-plugin-3.0.0-1.4.noarch.rpm"
RPM_HASH = "7042bad1709f0216a7550f75db5a9fe7b7eff48e2e0b14269e935435f76f14aaa1fabdb9522e104dde23d040de24cb593828bb95cfd756ad5c5699c1524101e8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "maven-jmod-plugin \
mvn-org.apache.maven.plugins-maven-jmod-plugin \
mvn-org.apache.maven.plugins-maven-jmod-plugin-pom-"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn-org.apache.maven.shared-maven-shared-utils \
mvn-org.codehaus.plexus-plexus-java"

inherit rpm
