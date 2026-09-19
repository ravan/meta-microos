SUMMARY = "An artifact of fully-specified annotations to power static-analysis checks"
DESCRIPTION = "An artifact of well-specified annotations to power static analysis checks and \
JVM language interop. Developed by consensus of the partner organizations \
listed at our main web site, jspecify.org. \
 \
Our current focus is on annotations for nullness analysis."
LICENSE = "Apache-2.0"

PV = "1.0.0"

RPM_NAME = "jspecify-1.0.0-2.6.noarch.rpm"
RPM_HASH = "c65014eede382e97af6ab9742142cd3660fa5c91058cb0b2acaec4f8654201e4421eb1e52b11fa5a40fe6b63aaa57d7111df3a2bc75acac540d6c086c8265796"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "jspecify \
mvn-org.jspecify-jspecify \
mvn-org.jspecify-jspecify-pom- \
osgi-org.jspecify.jspecify"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem"

inherit rpm
