SUMMARY = "Zip archive library"
DESCRIPTION = "Minizip is a library for manipulation with files from .zip archives."
LICENSE = "Zlib"

PV = "1.3.2"

RPM_NAME = "mingw32-libminizip1-1.3.2-1.6.noarch.rpm"
RPM_HASH = "ec1ac177ec95d028b747e60fe80fb60675838fe2e81a0353ffc70af4376b8929b5c7377b415d09f2e1643ca56d21b1d16d287cdde9fc36b05f56f34916f8a645"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "mingw32-libminizip-1.dll \
mingw32-libminizip1 \
mingw32-minizip"

RDEPENDS:${PN} += "mingw32-libz.dll"

inherit rpm
