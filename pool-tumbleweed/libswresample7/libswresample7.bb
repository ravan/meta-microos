SUMMARY = "FFmpeg software resampling library"
DESCRIPTION = "The libswresample library performs audio conversion between different \
sample rates, channel layout and channel formats."
LICENSE = "GPL-3.0-or-later"

PV = "9.0.1"

RPM_NAME = "libswresample7-9.0.1-5.1.aarch64.rpm"
RPM_HASH = "657e85a7da3aed9d26649cb01de6ba4fc9a629c0f4271004d14d64217d6cb4c83fdb516edc7a39eac494ae38aa6cf9f192560a594f5b3629f9e68c8b76b2eacc"

RPROVIDES:${PN} += "libswresample.so.7 \
libswresample7"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libavutil.so.61 \
libavutil61 \
libc.so.6 \
libm.so.6 \
libsoxr.so.0"

inherit rpm
