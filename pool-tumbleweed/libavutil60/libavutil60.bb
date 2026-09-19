SUMMARY = "FFmpeg's utility library"
DESCRIPTION = "The libavutil library is a utility library to aid portable multimedia \
programming. It contains safe portable string functions, random \
number generators, data structures, additional mathematics functions, \
cryptography and multimedia related functionality (like enumerations \
for pixel and sample formats)."
LICENSE = "GPL-3.0-or-later"

PV = "8.1.2"

RPM_NAME = "libavutil60-8.1.2-4.1.aarch64.rpm"
RPM_HASH = "b865ed3b9c95b4d2846bc58989837cc2bdf00cbe2d9b298a4f8fccad5fb600ebfc39f4758ab1b2a8d9c29c36600ba8440a0b80d58a70f74e9948cc0c99c328b7"

RPROVIDES:${PN} += "libavutil.so.60 \
libavutil60"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libX11.so.6 \
libc.so.6 \
libcrypto.so.3 \
libdrm.so.2 \
libm.so.6 \
libva-drm.so.2 \
libva-x11.so.2 \
libva.so.2 \
libvdpau.so.1 \
libz.so.1"

inherit rpm
