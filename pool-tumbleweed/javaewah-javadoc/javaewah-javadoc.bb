SUMMARY = "Javadoc for javaewah"
DESCRIPTION = "API documentation for javaewah."
LICENSE = "Apache-2.0"

PV = "1.2.3"

RPM_NAME = "javaewah-javadoc-1.2.3-1.9.noarch.rpm"
RPM_HASH = "6b881c3b120848df5fedbe2acc3ab0bd9686837259cbd0666bf2664625d44ac9304f5c9a556a1ff6227e15fbb021aaf1eb6c55a921ebb040359da2f4c159c87c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "javaewah-javadoc"

RDEPENDS:${PN} += "javapackages-filesystem"

inherit rpm
