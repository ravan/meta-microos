SUMMARY = "HK2 core module"
DESCRIPTION = "Hundred Kilobytes Kernel core module."
LICENSE = "EPL-2.0 | GPL-2.0-only-with-Classpath-exception-2.0"

PV = "2.5.0"

RPM_NAME = "glassfish-hk2-core-2.5.0-11.6.noarch.rpm"
RPM_HASH = "6fa7e79479c722a7f50f8dd1a855776bbd4a2beafa723ef9fc4e6a7a944ed88eafc7d18639f341751b1f1a0829b3e60b95277d695e2ec7f715c92245a70a5807"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "glassfish-hk2-core \
mvn-org.glassfish.hk2-hk2-core \
mvn-org.glassfish.hk2-hk2-core-pom- \
osgi-org.glassfish.hk2.core"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn-org.glassfish.hk2-hk2-locator \
mvn-org.glassfish.hk2-hk2-utils"

inherit rpm
