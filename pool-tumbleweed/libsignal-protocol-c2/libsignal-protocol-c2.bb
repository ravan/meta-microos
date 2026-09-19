SUMMARY = "Signal Protocol C Library"
DESCRIPTION = "The libsignal-protocol-c library is a forward secrecy protocol library written in C."
LICENSE = "GPL-3.0-only"

PV = "2.3.3"

RPM_NAME = "libsignal-protocol-c2-2.3.3-2.3.aarch64.rpm"
RPM_HASH = "45ae764ffb67e2ab98756c1380e8fe7d0bcdd31c07bf7d09e61e4dab637e4a21447629a56b03ced8b9116f5a5f31602cfccce8760ae9fc08ac4e1130be1d0d96"

RPROVIDES:${PN} += "libsignal-protocol-c.so.2 \
libsignal-protocol-c2"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
