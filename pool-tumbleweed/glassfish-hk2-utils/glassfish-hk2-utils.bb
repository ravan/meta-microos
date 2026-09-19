SUMMARY = "HK2 Implementation Utilities"
DESCRIPTION = "Hundred Kilobytes Kernel Implementation Utilities."
LICENSE = "EPL-2.0 | GPL-2.0-only-with-Classpath-exception-2.0"

PV = "2.5.0"

RPM_NAME = "glassfish-hk2-utils-2.5.0-11.6.noarch.rpm"
RPM_HASH = "2808ec7ef6c9f98aa42e633124e8102399487aa02e45389fec9c36f336a58c16b3605de145cfcd999f3436610e1ed180f9aafd4539dbad07acc6c308e35ef1a0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "glassfish-hk2-utils \
mvn-org.glassfish.hk2-hk2-utils \
mvn-org.glassfish.hk2-hk2-utils-pom- \
osgi-org.glassfish.hk2.utils"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn-javax.annotation-javax.annotation-api \
mvn-javax.inject-javax.inject"

inherit rpm
