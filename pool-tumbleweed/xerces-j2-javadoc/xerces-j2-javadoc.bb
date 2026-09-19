SUMMARY = "Javadocs for xerces-j2"
DESCRIPTION = "This package contains the API documentation for xerces-j2."
LICENSE = "Apache-2.0 & W3C"

PV = "2.12.2"

RPM_NAME = "xerces-j2-javadoc-2.12.2-5.6.noarch.rpm"
RPM_HASH = "e67d5ea5544f46513029f98f8c2ba5a06244b4ce1f8c7b3d9675acd297e9afbf20d75d58558ce9b023c65cd9569524a8bcbfe9250000f6b1b6069a59b182e2c7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "xerces-j2-javadoc"

RDEPENDS:${PN} += "javapackages-filesystem"

inherit rpm
