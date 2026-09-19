SUMMARY = "Single C source file zlib-replacement library"
DESCRIPTION = "Miniz is a lossless, high performance data compression library in a single \
source file that implements the zlib (RFC 1950) and Deflate (RFC 1951) \
compressed data format specification standards. It supports the most commonly \
used functions exported by the zlib library, but is a completely independent \
implementation so zlib's licensing requirements do not apply. Miniz also \
contains simple to use functions for writing .PNG format image files and \
reading/writing/appending .ZIP format archives."
LICENSE = "MIT"

PV = "3.1.2"

RPM_NAME = "libminiz3-3.1.2-1.3.aarch64.rpm"
RPM_HASH = "05453dcc4b17c3f04c607810a517728efb1cf3174c083d303dc49e6fbcbb8980bc0b6415199dda5211679c6554324b548232ee94d7cf378408ef5ec0173f511d"

RPROVIDES:${PN} += "libminiz.so.3 \
libminiz3"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
