SUMMARY = "Javadoc for jnr-netdb"
DESCRIPTION = "Javadoc for jnr-netdb."
LICENSE = "Apache-2.0"

PV = "1.2.0"

RPM_NAME = "jnr-netdb-javadoc-1.2.0-1.23.noarch.rpm"
RPM_HASH = "a9cb32bef8d5e0e970794eed2ecab2dbd77fb83c4f37cf889638f63caad7c1ea8f8ba04ee3297f4e6f6ad69ee079d9750874d6b8969023b8ff5d7cacc84fd6fb"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "jnr-netdb-javadoc"

RDEPENDS:${PN} += "javapackages-filesystem"

inherit rpm
