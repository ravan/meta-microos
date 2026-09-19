SUMMARY = "Zlib compression library (development files)"
DESCRIPTION = "zlib is a general-purpose lossless data-compression library, \
implementing an API for the DEFLATE algorithm, the latter of \
which is being used by, for example, gzip and the ZIP archive \
format. \
 \
This subpackage holds the development headers for the library."
LICENSE = "Zlib"

PV = "1.3.2"

RPM_NAME = "mingw64-zlib-devel-1.3.2-1.6.noarch.rpm"
RPM_HASH = "dfb11038bef274b4564acebb6055acc60724fdf3b9e0e697dfb75e2cc29141f0524f0f7902a241b4f40c67b3341f59c64efe5ea7442b723429636676a0209a98"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "mingw64-cmake-ZLIB \
mingw64-lib-z \
mingw64-pkg-zlib \
mingw64-pkg-zlib-static \
mingw64-zlib-devel"

RDEPENDS:${PN} += "mingw64-libz"

inherit rpm
