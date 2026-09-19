SUMMARY = "Audio Compression Format"
DESCRIPTION = "Musepack is an audio compression format with an emphasis on audio \
quality. It is not lossless, but it is designed for transparency, so \
that differences between the original wave file and the much smaller \
MPC file are indiscernible (given enough of a bitrate, as usual). \
 \
It is based on the MPEG-1 Layer-2 / MP2 algorithms, but has further \
been developed."
LICENSE = "BSD-3-Clause & Zlib"

PV = "r475"

RPM_NAME = "libmpcdec6-r475-6.10.aarch64.rpm"
RPM_HASH = "6cfdd9004509ce6da17c357a2de397aa156cd237a9e8a696448d36dfb45bd2d02b33c2d456073b7e0fd30e74c3c39ebf794e3f21f210efb4f5b7a6f48154fba4"

RPROVIDES:${PN} += "libmpcdec.so.6 \
libmpcdec6"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libm.so.6"

inherit rpm
