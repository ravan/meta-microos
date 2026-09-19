SUMMARY = "RELAX NG Datatype API"
DESCRIPTION = "RELAX NG is a public space for test cases and other ancillary software \
related to the construction of the RELAX NG language and its \
implementations."
LICENSE = "BSD-3-Clause"

PV = "2011.1"

RPM_NAME = "relaxngDatatype-2011.1-6.8.noarch.rpm"
RPM_HASH = "c97b7804fe30700776c2e1fdf6ece26f46ac7d9f861a50874864c83f56f3282dbea615709fa1b1df4c9e5dcebd9dca4d7c3c12fb1532929a8732d0cc5d75577b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "mvn-com.github.relaxng-relaxngDatatype \
mvn-com.github.relaxng-relaxngDatatype-pom- \
mvn-relaxngDatatype-relaxngDatatype \
mvn-relaxngDatatype-relaxngDatatype-pom- \
relaxngDatatype"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem"

inherit rpm
