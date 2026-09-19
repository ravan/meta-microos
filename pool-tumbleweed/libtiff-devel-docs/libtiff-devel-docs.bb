SUMMARY = "Development Documentation for Programs which will use the libtiff Library"
DESCRIPTION = "This package contains the header files and static libraries for \
developing programs which will manipulate TIFF format image files using \
the libtiff library. \
 \
This package holds the development man pages."
LICENSE = "HPND"

PV = "4.7.2"

RPM_NAME = "libtiff-devel-docs-4.7.2-1.1.noarch.rpm"
RPM_HASH = "d6bd1dc0551d0224d914eb565b25d37852e0f6645257e34859757b18cb15d33aa304e805ccb09743b6d1de221219e993352e5f788ddbf151ffd0c2ec5aa9652b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libtiff-devel-docs"

RDEPENDS:${PN} += "libtiff-devel"

inherit rpm
