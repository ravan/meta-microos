SUMMARY = "Javadoc for reflectasm"
DESCRIPTION = "This package contains javadoc for reflectasm."
LICENSE = "BSD-3-Clause"

PV = "1.11.1"

RPM_NAME = "reflectasm-javadoc-1.11.1-2.10.noarch.rpm"
RPM_HASH = "09ef83a80722b58e9f747f59092ae86a572612087eaa82d3863daabfcd4f5d132fb8be764ec8fe7797550152e519fde8334b40f5de66f4e2304f99ce8e3b4605"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "reflectasm-javadoc"

RDEPENDS:${PN} += "javapackages-filesystem"

inherit rpm
