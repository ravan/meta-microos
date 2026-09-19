SUMMARY = "HK2 API module"
DESCRIPTION = "Hundred Kilobytes Kernel API module."
LICENSE = "EPL-2.0 | GPL-2.0-only-with-Classpath-exception-2.0"

PV = "2.5.0"

RPM_NAME = "glassfish-hk2-api-2.5.0-11.6.noarch.rpm"
RPM_HASH = "e63f98a9a05a48ad4a323293b709b1b04315f9d170b9994995a4a6a75465513c6043856419c6aef4439b5db307cd47bfd335f86f2b6f957654cbcccc35016d2b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "glassfish-hk2-api \
mvn-org.glassfish.hk2-hk2-api \
mvn-org.glassfish.hk2-hk2-api-pom- \
osgi-org.glassfish.hk2.api"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn-aopalliance-aopalliance \
mvn-javax.inject-javax.inject \
mvn-org.glassfish.hk2-hk2-utils"

inherit rpm
