SUMMARY = "API documentation for segment"
DESCRIPTION = "This package contains the API documentation for segment."
LICENSE = "Apache-2.0"

PV = "2.0.1"

RPM_NAME = "segment-javadoc-2.0.1-2.10.noarch.rpm"
RPM_HASH = "1b936cd66feb84f89998b4cb3dccf778aa4434fdfe82a86e3f07f9d79909966c09578b888b5f799d040b5249c987de57da6b15d124968b4777a35ab3c4597ee0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "segment-javadoc"

RDEPENDS:${PN} += "javapackages-filesystem"

inherit rpm
