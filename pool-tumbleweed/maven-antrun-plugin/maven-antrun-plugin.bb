SUMMARY = "Maven AntRun Plugin"
DESCRIPTION = "This plugin provides the ability to run Ant tasks from within Maven. \
It is even possible to embed Ant scripts in the POM."
LICENSE = "Apache-2.0"

PV = "3.2.0"

RPM_NAME = "maven-antrun-plugin-3.2.0-1.5.noarch.rpm"
RPM_HASH = "e7b972db097f2de28efaa5bba60f912246f0e01fd469a7576ac2aa598848f97c76a86a6a6f6ae481729029388b3d300b501874ef9f72b8807c6bebf3b4b733ad"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "maven-antrun-plugin \
mvn-org.apache.maven.plugins-maven-antrun-plugin \
mvn-org.apache.maven.plugins-maven-antrun-plugin-pom-"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn-org.apache.ant-ant \
mvn-org.codehaus.plexus-plexus-utils \
mvn-org.codehaus.plexus-plexus-xml"

inherit rpm
