SUMMARY = "Development files for the minizip library"
DESCRIPTION = "This package contains the libraries and header files needed for \
developing applications which use minizip."
LICENSE = "Zlib"

PV = "1.3.2"

RPM_NAME = "mingw64-minizip-devel-1.3.2-1.6.noarch.rpm"
RPM_HASH = "c47f5b69e80a4ced2a7f7dd93105dbfe9c99d2806bea099376374cbec29ed4b9479fcbb48b1b31549028722cb874b63716a25450511680b1ace431608882c621"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "mingw64-lib-minizip \
mingw64-minizip-devel \
mingw64-pkg-minizip"

RDEPENDS:${PN} += "mingw64-libminizip1"

inherit rpm
