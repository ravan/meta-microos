SUMMARY = "Random number generators library for Java"
DESCRIPTION = "The Uncommons Maths library provides five easy-to-use, \
statistically sound, high-performance pseudo-random \
number generators (RNGs)."
LICENSE = "Apache-2.0"

PV = "1.2.3"

RPM_NAME = "uncommons-maths-1.2.3-3.7.noarch.rpm"
RPM_HASH = "8087d4d0a4647e4400cb1069861a734695e25dad5e8626ae716e9d3f1d461094c9addb191c6710cd0e7a66d3d36d9fee0cc9cc2eccf0d7a471a3fdec2a5b8dd6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "mvn-org.uncommons.maths-uncommons-maths \
mvn-org.uncommons.maths-uncommons-maths-pom- \
osgi-org.uncommons.maths \
uncommons-maths"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn-org.jfree-jcommon \
mvn-org.jfree-jfreechart"

inherit rpm
