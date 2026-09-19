SUMMARY = "Javadocs for eclipse-swt"
DESCRIPTION = "This package contains the API documentation for eclipse-swt."
LICENSE = "EPL-2.0"

PV = "4.29"

RPM_NAME = "eclipse-swt-javadoc-4.29-4.3.noarch.rpm"
RPM_HASH = "c99e1c9e76b0125731613c9a61d8fd5af055e137a902e492d4ffe731b58484e2e58f66b2bba1ebc6173a89eee4a3d698e22458de7f7e9900528da3733d47049b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "eclipse-swt-javadoc"

RDEPENDS:${PN} += "javapackages-filesystem"

inherit rpm
