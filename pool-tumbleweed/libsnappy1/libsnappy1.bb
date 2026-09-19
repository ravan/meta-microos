SUMMARY = "A compressor/decompressor library favoring time"
DESCRIPTION = "Snappy is a compression/decompression library. It does not aim for maximum \
compression, or compatibility with any other compression library; instead, it \
aims for high speeds and reasonable compression. For instance, compared to \
the fastest mode of zlib, Snappy is an order of magnitude faster for most \
inputs, but the resulting compressed files are anywhere from 20% to 100% \
bigger. On a single core of a 1st-generation Core i7 processor in 64-bit \
mode, Snappy compresses at about 250 MB/sec or more and decompresses at about \
500 MB/sec or more. \
 \
This package holds the shared library of snappy."
LICENSE = "BSD-3-Clause"

PV = "1.2.2"

RPM_NAME = "libsnappy1-1.2.2-1.5.aarch64.rpm"
RPM_HASH = "aa1e4437bf8cbc8c43843fc440e40fa040eed889c761f36a29449efc014026bd03c27c089bd66782de369221f6ddc3dab9633e4285dee2a474c4b7ab83bc7188"

RPROVIDES:${PN} += "libsnappy.so.1 \
libsnappy1"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libstdc++.so.6"

inherit rpm
