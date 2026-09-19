SUMMARY = "Library for communicating with Icecast servers"
DESCRIPTION = "libshout is a library for communicating with and sending data to an \
Icecast server. It handles the socket connection, the timing of the \
data, and prevents bad data from getting to the Icecast server."
LICENSE = "LGPL-2.1-or-later"

PV = "2.4.6"

RPM_NAME = "libshout3-2.4.6-3.8.aarch64.rpm"
RPM_HASH = "5e69cf9c2ac8b449ce4b8cbf7f22908402686add95cd3960a9e79a54577a52469030423bcd05bafcfa2d3a0908041e29712d055f06e9cd7f51a0f4367f70e209"

RPROVIDES:${PN} += "libshout.so.3 \
libshout3"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libcrypto.so.3 \
libogg.so.0 \
libspeex.so.1 \
libssl.so.3 \
libtheora.so.1 \
libvorbis.so.0"

inherit rpm
