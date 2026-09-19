SUMMARY = "Javadoc for bnd-maven-plugin"
DESCRIPTION = "API documentation for bnd-maven-plugin."
LICENSE = "Apache-2.0"

PV = "6.4.1"

RPM_NAME = "bnd-maven-plugin-javadoc-6.4.1-7.1.noarch.rpm"
RPM_HASH = "7a8c68588d2e75ad0ea57db8a1e5867627b9be5e88b1812dc606ad74296df1922145a2f4e26370a4c55a4b3de12aa8ab24eb5bbbaebbb0c82fec1d349c63500a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "bnd-maven-plugin-javadoc"

RDEPENDS:${PN} += "javapackages-filesystem"

inherit rpm
