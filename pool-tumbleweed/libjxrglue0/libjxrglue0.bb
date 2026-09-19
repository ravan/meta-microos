SUMMARY = "Open source implementation of jpegxr"
DESCRIPTION = "This is an open source implementation of the jpegxr image format standard. \
 \
This package the libjxrglue shared library"
LICENSE = "BSD-2-Clause"

PV = "1.3.2"

RPM_NAME = "libjxrglue0-1.3.2-1.3.aarch64.rpm"
RPM_HASH = "5ab787d1a57170c17f713014966af5277be432f28746f68bd4739c01a5dfab42cdbdf6e61451bbaf316216bd534750ad93c3c1d09c327bf3821819b2e42783cd"

RPROVIDES:${PN} += "libjxrglue.so.0 \
libjxrglue0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libjpegxr.so.0 \
libm.so.6"

inherit rpm
