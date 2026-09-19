SUMMARY = "Zlib compression library (development files)"
DESCRIPTION = "zlib is a general-purpose lossless data-compression library, \
implementing an API for the DEFLATE algorithm, the latter of \
which is being used by, for example, gzip and the ZIP archive \
format. \
 \
This subpackage holds the development headers for the library."
LICENSE = "Zlib"

PV = "1.3.2"

RPM_NAME = "mingw32-zlib-devel-1.3.2-1.6.noarch.rpm"
RPM_HASH = "0d2ffb719b7ca078706cd185e8f47dbf188fc042128029c192d900f57d98a02061da64a4e4ab38c83bb2e96705ed1afaa7910ef8dacfc31eadc1260555d92e2e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "mingw32-cmake-ZLIB \
mingw32-lib-z \
mingw32-pkg-zlib \
mingw32-pkg-zlib-static \
mingw32-zlib-devel"

RDEPENDS:${PN} += "mingw32-libz"

inherit rpm
