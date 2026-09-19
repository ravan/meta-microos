SUMMARY = "Javadocs for hawtjni"
DESCRIPTION = "This package contains the API documentation for hawtjni."
LICENSE = "Apache-2.0 & EPL-1.0 & BSD-3-Clause"

PV = "1.18"

RPM_NAME = "hawtjni-javadoc-1.18-3.1.noarch.rpm"
RPM_HASH = "925ad46ad714950d02f9f619e136de4919c966c7ac83d2346c078a58bdf1e6f3e15e6189d8ecea0c251ecd17867d1d32e31b7b3480575d45bbdddd9b9702c609"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "hawtjni-javadoc"

RDEPENDS:${PN} += "javapackages-filesystem"

inherit rpm
