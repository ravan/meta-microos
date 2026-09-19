SUMMARY = "Development files for the minizip library"
DESCRIPTION = "This package contains the libraries and header files needed for \
developing applications which use minizip."
LICENSE = "Zlib"

PV = "1.3.2"

RPM_NAME = "mingw32-minizip-devel-1.3.2-1.6.noarch.rpm"
RPM_HASH = "bd42cbb67d5f294da70df50ae0732ebb59a5332805a9a3b5c68f7bcdae617462bfb545b37c8f817e4a4c5addbdb9734d9d5e77867f0abfd48dd3a353e7966b47"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "mingw32-lib-minizip \
mingw32-minizip-devel \
mingw32-pkg-minizip"

RDEPENDS:${PN} += "mingw32-libminizip1"

inherit rpm
