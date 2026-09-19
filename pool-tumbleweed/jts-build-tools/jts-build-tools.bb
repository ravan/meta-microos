SUMMARY = "JTS Build Tools"
DESCRIPTION = "JTS Topology Suite Build Configuration"
LICENSE = "EPL-1.0"

PV = "1.20.0"

RPM_NAME = "jts-build-tools-1.20.0-1.6.noarch.rpm"
RPM_HASH = "5d4da6523c72cd6e8d3ed44bb09a85eb31f4cf8d961c5f1bd9a5880a939ed87b863582a53cd5e658f6ff8b2c45a337751261948b49eeecb292d75e45b68800ce"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "jts-build-tools \
mvn-org.locationtech.jts-build-tools \
mvn-org.locationtech.jts-build-tools-pom-"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem"

inherit rpm
