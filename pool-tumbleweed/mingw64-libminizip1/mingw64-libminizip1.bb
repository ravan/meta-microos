SUMMARY = "Zip archive library"
DESCRIPTION = "Minizip is a library for manipulation with files from .zip archives."
LICENSE = "Zlib"

PV = "1.3.2"

RPM_NAME = "mingw64-libminizip1-1.3.2-1.6.noarch.rpm"
RPM_HASH = "dbf4dee2d3fa0ab93b72879d55230e253d38caf8681031c51b0989c8011a4b5267e13cd0fd640e5a2d5e89d4eededf4906acc50ae1cf6fa8b1270daf84b43a90"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "mingw64-libminizip-1.dll \
mingw64-libminizip1 \
mingw64-minizip"

RDEPENDS:${PN} += "mingw64-libz.dll"

inherit rpm
