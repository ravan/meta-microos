SUMMARY = "FFmpeg's utility library"
DESCRIPTION = "The libavutil library is a utility library to aid portable multimedia \
programming. It contains safe portable string functions, random \
number generators, data structures, additional mathematics functions, \
cryptography and multimedia related functionality (like enumerations \
for pixel and sample formats)."
LICENSE = "GPL-3.0-or-later"

PV = "4.4.8"

RPM_NAME = "libavutil56_70-4.4.8-5.1.aarch64.rpm"
RPM_HASH = "2d008059fed736b4386ebbd96316806e8919f669281e9fc8234a158e87fc2e088da409eaeb2e384bf4ead35bc188b3072335ed4b2f8e7d17c5e22c43f8b48cb9"

RPROVIDES:${PN} += "libavutil.so.56.70 \
libavutil56-70"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libX11.so.6 \
libc.so.6 \
libdrm.so.2 \
libm.so.6 \
libva-drm.so.2 \
libva.so.2 \
libvdpau.so.1 \
libvulkan.so.1"

inherit rpm
