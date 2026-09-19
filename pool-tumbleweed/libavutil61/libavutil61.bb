SUMMARY = "FFmpeg's utility library"
DESCRIPTION = "The libavutil library is a utility library to aid portable multimedia \
programming. It contains safe portable string functions, random \
number generators, data structures, additional mathematics functions, \
cryptography and multimedia related functionality (like enumerations \
for pixel and sample formats)."
LICENSE = "GPL-3.0-or-later"

PV = "9.0.1"

RPM_NAME = "libavutil61-9.0.1-5.1.aarch64.rpm"
RPM_HASH = "4bde62ef12691ae6be1a89de5e03d94518bd9321b494188840880d76e5a4aeec53edfbbb165165d21e784efba4977b7c917b26e226da45188ab894d550d76749"

RPROVIDES:${PN} += "libavutil.so.61 \
libavutil61"

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
