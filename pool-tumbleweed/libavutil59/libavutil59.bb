SUMMARY = "FFmpeg's utility library"
DESCRIPTION = "The libavutil library is a utility library to aid portable multimedia \
programming. It contains safe portable string functions, random \
number generators, data structures, additional mathematics functions, \
cryptography and multimedia related functionality (like enumerations \
for pixel and sample formats)."
LICENSE = "GPL-3.0-or-later"

PV = "7.1.5"

RPM_NAME = "libavutil59-7.1.5-3.1.aarch64.rpm"
RPM_HASH = "e6b3fcb12a21fa36192b14a49804d6996dee9f5b347321ff77ebd5c597b4bb0dd9ada4335e7501445dc18c44462d093f8d506f9443c11d2cfafcbe178096cd95"

RPROVIDES:${PN} += "libavutil.so.59 \
libavutil59"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libX11.so.6 \
libc.so.6 \
libdrm.so.2 \
libm.so.6 \
libva-drm.so.2 \
libva-x11.so.2 \
libva.so.2 \
libvdpau.so.1"

inherit rpm
