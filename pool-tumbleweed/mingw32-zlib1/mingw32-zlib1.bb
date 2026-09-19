SUMMARY = "Zlib compression library"
DESCRIPTION = "zlib is a general-purpose lossless data-compression library, \
implementing an API for the DEFLATE algorithm, the latter of \
which is being used by, for example, gzip and the ZIP archive \
format."
LICENSE = "Zlib"

PV = "1.3.2"

RPM_NAME = "mingw32-zlib1-1.3.2-1.6.noarch.rpm"
RPM_HASH = "a15c4f6ff036153ced8ff2c386d140f4378a3fcb6cb63b67473b0ed2a6c8656787c78571f19be376bbfac0a3224651e402048a31f2670bd531a521285b4eadd8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "mingw32-zlib \
mingw32-zlib1"

RDEPENDS:${PN} += ""

inherit rpm
