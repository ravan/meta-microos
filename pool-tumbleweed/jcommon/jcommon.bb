SUMMARY = "Common library"
DESCRIPTION = "Collection of classes used by Object Refinery Projects, for example \
jfreechart"
LICENSE = "LGPL-2.1-only"

PV = "1.0.24"

RPM_NAME = "jcommon-1.0.24-3.8.noarch.rpm"
RPM_HASH = "abbe59db6e8e95026fb8e96ca5688752f378aafde86cab800785366d3e2b7bf1bc84b591befa6f5e466dc022a606afece4c0375f9ba29feeeaae8c71f1b76388"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "jcommon \
mvn-org.jfree-jcommon \
mvn-org.jfree-jcommon-pom-"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem"

inherit rpm
