SUMMARY = "Mockito Subclass Mock Maker"
DESCRIPTION = "Mockito preconfigured subclass mock maker."
LICENSE = "MIT"

PV = "5.11.0"

RPM_NAME = "mockito-subclass-5.11.0-3.2.noarch.rpm"
RPM_HASH = "85096ecb65eccdd28f7325619007dad0a42a2deef925acb5cd3c4e7dc6aecd22b20d89d46a248c3e2331603d492a72b12d356ade8d12d9cf7ff9c7bfea0fa821"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "mockito-subclass \
mvn-org.mockito-mockito-subclass \
mvn-org.mockito-mockito-subclass-pom-"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mockito \
mvn-org.mockito-mockito-core"

inherit rpm
