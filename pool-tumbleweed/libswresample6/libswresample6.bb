SUMMARY = "FFmpeg software resampling library"
DESCRIPTION = "The libswresample library performs audio conversion between different \
sample rates, channel layout and channel formats."
LICENSE = "GPL-3.0-or-later"

PV = "8.1.2"

RPM_NAME = "libswresample6-8.1.2-4.1.aarch64.rpm"
RPM_HASH = "4f0523e73877a2f5cadcb12004bb3c4b9e13b0b625b2b2c044defbf95125458a62e959e26399e628cc6b8cae54d580ca6e9cfdef9a379ed2bb9a2646307fd4cb"

RPROVIDES:${PN} += "libswresample.so.6 \
libswresample6"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libavutil.so.60 \
libavutil60 \
libc.so.6 \
libm.so.6 \
libsoxr.so.0"

inherit rpm
