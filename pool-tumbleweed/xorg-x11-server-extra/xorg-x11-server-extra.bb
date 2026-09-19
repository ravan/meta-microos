SUMMARY = "Additional Xservers Xephyr, Xnest)"
DESCRIPTION = "This package contains additional Xservers (Xephyr, Xnest)."
LICENSE = "MIT"

PV = "21.1.24"

RPM_NAME = "xorg-x11-server-extra-21.1.24-1.2.aarch64.rpm"
RPM_HASH = "12abd3a9aaf229573745789fb553ed7ff668b60a9aab33e1dc10addc39c9d8f41e2e00beab351cd68def9c58b2c2139bb28d5ec9be178d34892facec0c7c7954"

RPROVIDES:${PN} += "xorg-x11-Xnest \
xorg-x11-server-extra"

RDEPENDS:${PN} += "Mesa \
ld-linux-aarch64.so.1 \
libGL.so.1 \
libX11-xcb.so.1 \
libX11.so.6 \
libXau.so.6 \
libXdmcp.so.6 \
libXext.so.6 \
libXfont2.so.2 \
libc.so.6 \
libcrypto.so.3 \
libepoxy.so.0 \
libm.so.6 \
libpixman-1.so.0 \
libsystemd.so.0 \
libudev.so.1 \
libxcb-icccm.so.4 \
libxcb-image.so.0 \
libxcb-keysyms.so.1 \
libxcb-randr.so.0 \
libxcb-render-util.so.0 \
libxcb-render.so.0 \
libxcb-shape.so.0 \
libxcb-shm.so.0 \
libxcb-util.so.1 \
libxcb-xkb.so.1 \
libxcb-xv.so.0 \
libxcb.so.1 \
libxshmfence.so.1 \
xkbcomp \
xkeyboard-config"

inherit rpm
