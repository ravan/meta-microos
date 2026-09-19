SUMMARY = "A manual tiling window manager"
DESCRIPTION = "herbstluftwm is a manual tiling window manager for X11 using Xlib and Glib."
LICENSE = "BSD-2-Clause"

PV = "0.9.6"

RPM_NAME = "herbstluftwm-0.9.6-1.3.aarch64.rpm"
RPM_HASH = "9b30b80b98c05667a3f0226e0a9bc48c404d625337bc1826444c7847c7d037c3ecf44315d932535fa5e94d65cb5ce5ee3dca77b4c521ef6135abc34473636b8a"

RPROVIDES:${PN} += "herbstluftwm"

RDEPENDS:${PN} += "/usr/bin/bash \
ld-linux-aarch64.so.1 \
libX11.so.6 \
libXext.so.6 \
libXfixes.so.3 \
libXft.so.2 \
libXinerama.so.1 \
libXrandr.so.2 \
libXrender.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6"

inherit rpm
