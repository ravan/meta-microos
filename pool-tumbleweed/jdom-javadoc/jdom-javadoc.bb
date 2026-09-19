SUMMARY = "Javadoc for jdom"
DESCRIPTION = "Javadoc for jdom."
LICENSE = "Saxpath"

PV = "1.1.3"

RPM_NAME = "jdom-javadoc-1.1.3-42.9.noarch.rpm"
RPM_HASH = "ccb3b22a3d3a27d186b55b482fde1cd160ccb49f4df682a067e20169e46f75dc03c0822a6d9e5d00c983ed9d658a2b53dd458e7191fa513a0dcaee439b80ffba"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "jdom-javadoc"

RDEPENDS:${PN} += "javapackages-filesystem"

inherit rpm
