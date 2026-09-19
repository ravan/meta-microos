SUMMARY = "FFmpeg software resampling library"
DESCRIPTION = "The libswresample library performs audio conversion between different \
sample rates, channel layout and channel formats."
LICENSE = "GPL-3.0-or-later"

PV = "4.4.8"

RPM_NAME = "libswresample3_9-4.4.8-5.1.aarch64.rpm"
RPM_HASH = "6c20dc4b026c8c88b54887522dba661ab719d4bed51f8504601297b4d687efea8e9238cc378d8df85e6820f55bea0a65484915c682aa080f11f6618e113399e9"

RPROVIDES:${PN} += "libswresample.so.3.9 \
libswresample3-9"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libavutil.so.56.70 \
libavutil56-70 \
libc.so.6 \
libm.so.6 \
libsoxr.so.0"

inherit rpm
