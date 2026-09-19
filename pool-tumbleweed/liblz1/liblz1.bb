SUMMARY = "LZMA Compression and Decompression Library"
DESCRIPTION = "The lzlib compression library provides in-memory LZMA compression and \
decompression functions, including integrity checking of the \
decompressed data. The compressed data format used by the library is \
the lzip format."
LICENSE = "BSD-2-Clause & GPL-2.0-or-later"

PV = "1.16"

RPM_NAME = "liblz1-1.16-1.3.aarch64.rpm"
RPM_HASH = "fde1de99a965b060b67e22f97c1314c473c7c15481b1967f868eeac4478c8e4015ddd8ef19cb313127d3611ec766c28b91cd14403b65de32e3291ef0b6dfe18c"

RPROVIDES:${PN} += "liblz.so.1 \
liblz1"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
