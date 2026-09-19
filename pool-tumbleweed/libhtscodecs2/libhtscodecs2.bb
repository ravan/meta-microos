SUMMARY = "C library for custom compression for CRAM and other formats"
DESCRIPTION = "htscodecs provides an API to access CRAM codecs used for 'EXTERNAL' block types. \
These consist of two variants of the rANS codec (8-bit and 16-bit renormalisation, \
with run-length encoding and bit-packing also supported in the latter), \
a dynamic arithmetic coder, and custom codecs for name/ID compression \
and quality score compression derived from fqzcomp."
LICENSE = "MIT"

PV = "1.6.1"

RPM_NAME = "libhtscodecs2-1.6.1-1.5.aarch64.rpm"
RPM_HASH = "eccc861918a56c3a698187e67104ef392fd2474451a2f2db6207fbad45f8c0d8f64a7d6a737ec70dd575ead78c5fdad0871599fa283bce5112e909e9258f6ed4"

RPROVIDES:${PN} += "libhtscodecs.so.2 \
libhtscodecs2"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libbz2.so.1 \
libc.so.6 \
libm.so.6"

inherit rpm
