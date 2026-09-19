SUMMARY = "Mockito Proxy Mock Maker"
DESCRIPTION = "Mockito preconfigured proxy mock mock maker \
(to support interfaces without code generation)."
LICENSE = "MIT"

PV = "5.11.0"

RPM_NAME = "mockito-proxy-5.11.0-3.2.noarch.rpm"
RPM_HASH = "52a0a8823258d56b775a951f2d08575a9f603cafcca7c2f5cc81d1e3d24f3e690bd2c16dd9e778d8a085077aa3297cf2dbbc9be8d9ffdea94c6c8534b287d408"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "mockito-proxy \
mvn-org.mockito-mockito-proxy \
mvn-org.mockito-mockito-proxy-pom-"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mockito \
mvn-org.mockito-mockito-core"

inherit rpm
