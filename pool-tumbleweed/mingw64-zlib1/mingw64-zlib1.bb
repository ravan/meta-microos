SUMMARY = "Zlib compression library"
DESCRIPTION = "zlib is a general-purpose lossless data-compression library, \
implementing an API for the DEFLATE algorithm, the latter of \
which is being used by, for example, gzip and the ZIP archive \
format."
LICENSE = "Zlib"

PV = "1.3.2"

RPM_NAME = "mingw64-zlib1-1.3.2-1.6.noarch.rpm"
RPM_HASH = "3108db3403e1061c3a00af524e383ec8ff1eb7ef600772019c2b2ccff02f99d1390b33ad4988b76fd5377f16426bc2602088dfa217f9fb6b7a171e31f36ca258"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "mingw64-zlib \
mingw64-zlib1"

RDEPENDS:${PN} += ""

inherit rpm
