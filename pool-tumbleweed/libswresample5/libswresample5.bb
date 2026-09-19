SUMMARY = "FFmpeg software resampling library"
DESCRIPTION = "The libswresample library performs audio conversion between different \
sample rates, channel layout and channel formats."
LICENSE = "GPL-3.0-or-later"

PV = "7.1.5"

RPM_NAME = "libswresample5-7.1.5-3.1.aarch64.rpm"
RPM_HASH = "20d901025e5127abc11c4c46a6bf741fe372816ed8d29cd7df30436e46045bf26fe0a99612329248ff2d0447e82205087628b87d582d186e505f464f2654b2fa"

RPROVIDES:${PN} += "libswresample.so.5 \
libswresample5"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libavutil.so.59 \
libavutil59 \
libc.so.6 \
libm.so.6 \
libsoxr.so.0"

inherit rpm
