SUMMARY = "Javadoc for maven-javadoc-plugin"
DESCRIPTION = "API documentation for maven-javadoc-plugin."
LICENSE = "Apache-2.0"

PV = "3.12.0"

RPM_NAME = "maven-javadoc-plugin-javadoc-3.12.0-3.1.noarch.rpm"
RPM_HASH = "c7f4525e965b8535372dc92d9f89c99b78793e16b00e5a03cf1a07510fbfce05d5548cb2c5760d12c852bdf97d53341af44cfd0534a9f22d6733e38357205e77"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "maven-javadoc-plugin-javadoc"

RDEPENDS:${PN} += "javapackages-filesystem"

inherit rpm
