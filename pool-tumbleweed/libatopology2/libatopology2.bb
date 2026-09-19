SUMMARY = "ALSA Topology Library"
DESCRIPTION = "This package contains the library for ALSA topology support."
LICENSE = "LGPL-2.1-or-later"

PV = "1.2.16.1"

RPM_NAME = "libatopology2-1.2.16.1-2.1.aarch64.rpm"
RPM_HASH = "ca00ee1a3c6a6a6c266a329d215b703a935c03c26c7f51ae1ccabb5f974b296ab3773d6bedf928ecf3ebababcb44aa2e9ac534b13d700192aa041202d647c161"

RPROVIDES:${PN} += "libatopology.so.2 \
libatopology2"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libasound.so.2 \
libc.so.6"

inherit rpm
