SUMMARY = "C99 implementation of Huffman encoding/decoding"
DESCRIPTION = "A C99 implementation of Huffman encoding/decoding. \
 \
This package contains the dynamically linked library."
LICENSE = "Apache-2.0"

PV = "0.3.2"

RPM_NAME = "libaws-c-compression1_0_0-0.3.2-1.3.aarch64.rpm"
RPM_HASH = "f2fee05ee66cacd40004b96e7bac847d471cf5c61a89a99e1360783a160157bbdd3c4867e7524e91e6dbb9b53e1e405135de26278eaa0cfd65ed365f143c42f7"

RPROVIDES:${PN} += "libaws-c-compression.so.1.0.0 \
libaws-c-compression1-0-0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libaws-c-common.so.1 \
libc.so.6"

inherit rpm
