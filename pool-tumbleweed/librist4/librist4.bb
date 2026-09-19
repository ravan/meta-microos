SUMMARY = "Reliable Internet Stream Transport protocol"
DESCRIPTION = "A library that can be used to speak the RIST protocol (as defined by Video \
Services Forum (VSF) Technical Recommendations TR-06-1 and TR-06-2)."
LICENSE = "BSD-2-Clause"

PV = "0.2.20"

RPM_NAME = "librist4-0.2.20-1.1.aarch64.rpm"
RPM_HASH = "3502811fd36117065efdc4c6bfc87f7d02dd02280dc621f04483d1a888ddc513d199e0eea56c4ad9f04fe840fc303942b25dffabb5fe55edda9dac73752aabce"

RPROVIDES:${PN} += "librist.so.4 \
librist4"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libcjson.so.1 \
libgmp.so.10 \
libgnutls.so.30 \
libhogweed.so.6 \
libnettle.so.8"

inherit rpm
