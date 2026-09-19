SUMMARY = "API documentation for woodstox-core"
DESCRIPTION = "This package contains the API documentation for woodstox-core."
LICENSE = "Apache-2.0"

PV = "7.2.1"

RPM_NAME = "woodstox-core-javadoc-7.2.1-3.2.noarch.rpm"
RPM_HASH = "4e4b9ce249ead02621597e7e3a530d854aff81269d0f3d01d1e5a9e2376d835d3469a4101784a54c66812dfa8341a8ec199d8013b0d9e4e3cd8b5f01e3c46da8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "woodstox-core-javadoc"

RDEPENDS:${PN} += "javapackages-filesystem"

inherit rpm
