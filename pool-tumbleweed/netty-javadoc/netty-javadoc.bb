SUMMARY = "API documentation for netty"
DESCRIPTION = "API documentation for netty."
LICENSE = "Apache-2.0"

PV = "4.1.136"

RPM_NAME = "netty-javadoc-4.1.136-1.1.noarch.rpm"
RPM_HASH = "58f2c8506d31602db8e24859f800bad4de3f785999c014608ba012334e49b2372e6891f857c3945c6c57417c092ed0f1cad8e626ae273222476e9ac1f6a532a2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "netty-javadoc"

RDEPENDS:${PN} += "javapackages-filesystem"

inherit rpm
