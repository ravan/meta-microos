SUMMARY = "Library for real-time communications with async IO support"
DESCRIPTION = "Libre is a library for real-time communications \
with async I/O support and a complete SIP stack with support for protocols \
such as SDP, RTP/RTCP, STUN/TURN/ICE, BFCP, HTTP and DNS Client."
LICENSE = "BSD-3-Clause"

PV = "4.11.0"

RPM_NAME = "libre45-4.11.0-1.1.aarch64.rpm"
RPM_HASH = "799500fc663a5bfccf4f589096e5ee1b51a307f60e822de17e0bc4ca360e99e161d9d6acc70c441d56304e45c7e1b48f28c4940be257431279fef497520cfe0c"

RPROVIDES:${PN} += "libre.so.45 \
libre45"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libcrypto.so.3 \
libm.so.6 \
libssl.so.3 \
libz.so.1"

inherit rpm
