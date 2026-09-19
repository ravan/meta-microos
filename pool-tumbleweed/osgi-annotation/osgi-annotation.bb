SUMMARY = "Annotations for use in compiling OSGi bundles"
DESCRIPTION = "Annotations for use in compiling OSGi bundles. This package is not normally \
needed at run-time."
LICENSE = "Apache-2.0"

PV = "8.1.0"

RPM_NAME = "osgi-annotation-8.1.0-2.8.noarch.rpm"
RPM_HASH = "fc391698a9e13b69bf179f93acd983b83ff2c4abfa088c582e58a25bd2cb6ca35bbc1270e556955461ba0d9ef8d68013cb4bf20e5936fcec3ff4211100391d15"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "mvn-org.osgi-org.osgi.annotation \
mvn-org.osgi-org.osgi.annotation-pom- \
mvn-org.osgi-osgi.annotation \
mvn-org.osgi-osgi.annotation-pom- \
osgi-annotation \
osgi-osgi.annotation"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem"

inherit rpm
