SUMMARY = "Small XML pull parser"
DESCRIPTION = "kXML is a small XML pull parser, specially designed for constrained \
environments such as Applets, Personal Java or MIDP devices."
LICENSE = "MIT"

PV = "2.3.0"

RPM_NAME = "kxml-2.3.0-21.7.noarch.rpm"
RPM_HASH = "0c77135777fb1f456dce8bcf043f4caac91c42e37c4e5be326720a80d579ffcc3d2d86e01c56250a13f8c15763c8b6397800dd8dd44b57f024c84867c5c12f4f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "kxml \
mvn-net.sf.kxml-kxml2 \
mvn-net.sf.kxml-kxml2-min \
mvn-net.sf.kxml-kxml2-min-pom- \
mvn-net.sf.kxml-kxml2-pom- \
osgi-org.kxml2"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
xpp3"

inherit rpm
