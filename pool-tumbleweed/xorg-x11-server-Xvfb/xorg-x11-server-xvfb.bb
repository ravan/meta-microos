SUMMARY = "Virtual Xserver Xvfb"
DESCRIPTION = "This package contains the virtual Xserver Xvfb."
LICENSE = "MIT"

PV = "21.1.24"

RPM_NAME = "xorg-x11-server-Xvfb-21.1.24-1.2.aarch64.rpm"
RPM_HASH = "6f2d04b99b9c4f0e01330a9072fedfa90ccc93b30a7ecb532d501cf71a276b1549b38d354052427a43a352f0772bd3ec9f8b193730da9735438144abf558f784"

RPROVIDES:${PN} += "xorg-x11-Xvfb \
xorg-x11-server-/usr/bin/Xvfb \
xorg-x11-server-Xvfb"

RDEPENDS:${PN} += "Mesa \
ld-linux-aarch64.so.1 \
libGL.so.1 \
libXau.so.6 \
libXdmcp.so.6 \
libXfont2.so.2 \
libc.so.6 \
libcrypto.so.3 \
libm.so.6 \
libpixman-1.so.0 \
libsystemd.so.0 \
xkbcomp \
xkeyboard-config"

inherit rpm
