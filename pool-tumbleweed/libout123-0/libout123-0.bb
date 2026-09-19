SUMMARY = "MPEG audio decoder library"
DESCRIPTION = "The mpg123 distribution contains a real time MPEG 1.0/2.0/2.5 audio player/decoder for \
layers 1,2 and 3 (most commonly MPEG 1.0 layer 3 aka MP3), as well as re-usable decoding \
and output libraries."
LICENSE = "LGPL-2.1-only"

PV = "1.33.7"

RPM_NAME = "libout123-0-1.33.7-1.1.aarch64.rpm"
RPM_HASH = "3d5ee7cf42089ad0ff8c3d3fdd40c35e1d12bb5dadbdab91d6a18d733c0b8227c3e7a4311175ef5ec96ebbd6439f0536f9f01fda8abaae3514b40cb2dc2e3023"

RPROVIDES:${PN} += "libout123-0 \
libout123.so.0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
