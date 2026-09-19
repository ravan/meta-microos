SUMMARY = "Frame Streams implementation in C"
DESCRIPTION = "This is fstrm, a C implementation of the Frame Streams data transport protocol. \
 \
This packages holds the shared library file."
LICENSE = "MIT"

PV = "0.6.1"

RPM_NAME = "libfstrm0-0.6.1-1.16.aarch64.rpm"
RPM_HASH = "57e1de2e9cd508643da67941fd87e81bfe941744856152d7de575341ff2b3a09aeca80f71218952a2fdf902fa130c4766b698e5e6398a4f28ca3b8c18d5b83b2"

RPROVIDES:${PN} += "libfstrm.so.0 \
libfstrm0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
