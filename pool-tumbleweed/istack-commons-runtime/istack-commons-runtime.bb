SUMMARY = "Istack-commons runtime"
DESCRIPTION = "This package contains istack-commons runtime."
LICENSE = "CDDL-1.1 & GPL-2.0-only-with-Classpath-exception-2.0"

PV = "3.0.7"

RPM_NAME = "istack-commons-runtime-3.0.7-8.10.noarch.rpm"
RPM_HASH = "92ce7237a083c4423f33056fa23d35a93a0c596be1145ab7a49083cf31550523e7d21ee35610a48d89675603948d9c453a7b9987b56ce9773eae0a1ea4c73a7a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "istack-commons-runtime \
mvn-com.sun.istack-istack-commons-runtime \
mvn-com.sun.istack-istack-commons-runtime-pom- \
osgi-com.sun.istack.commons-runtime"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn-javax.activation-javax.activation-api"

inherit rpm
