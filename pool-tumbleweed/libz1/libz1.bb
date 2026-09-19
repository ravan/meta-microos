SUMMARY = "Library implementing the DEFLATE compression algorithm"
DESCRIPTION = "zlib is a general-purpose lossless data-compression library, \
implementing an API for the DEFLATE algorithm, the latter of \
which is being used by, for example, gzip and the ZIP archive \
format."
LICENSE = "Zlib"

PV = "1.3.1"

RPM_NAME = "libz1-1.3.1-3.3.aarch64.rpm"
RPM_HASH = "07ac3b81fcecfd2da62aa6e7f1da2ef84d29b76ee0e2f1b9b43e6c215aa6fa22f17c9fd260e659e1ec59d61411e889d547bb1972ca463f9136f9255388e8ece2"

RPROVIDES:${PN} += "libz.so.1 \
libz1 \
zlib"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
