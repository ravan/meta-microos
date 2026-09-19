SUMMARY = "Java chart library"
DESCRIPTION = "JFreeChart is a comprehensive free chart library for the Java™ platform that \
can be used on the client-side (JavaFX and Swing) or the server side, with \
export to multiple formats including SVG, PNG and PDF."
LICENSE = "LGPL-2.1-or-later"

PV = "1.5.5"

RPM_NAME = "jfreechart-1.5.5-1.4.noarch.rpm"
RPM_HASH = "6c769b699b13dd02f9bbf2ace678490a8f89dc83179982e33890ea828a7d27769070da81130eff75458826aaa68099c9d402a1a9230990d20f218d2968883ee8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "jfreechart \
mvn-org.jfree-jfreechart \
mvn-org.jfree-jfreechart-pom- \
osgi-org.jfree.jfreechart"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem"

inherit rpm
