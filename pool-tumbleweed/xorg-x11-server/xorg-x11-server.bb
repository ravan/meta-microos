SUMMARY = "X"
DESCRIPTION = "This package contains the X.Org Server."
LICENSE = "MIT"

PV = "21.1.24"

RPM_NAME = "xorg-x11-server-21.1.24-1.2.aarch64.rpm"
RPM_HASH = "b976762854e6dc7e06b39b6aa0c0f2ee2396cd200f943b509fd9391aa12577f3297d0ebc442bfac9ee8bb47eb2d0fbdc04856f490a42f2e68bf948f3867aa1b5"

RPROVIDES:${PN} += "X11-ABI-ANSIC \
X11-ABI-EXTENSION \
X11-ABI-HAS-DPMS-GET-CAPABILITIES \
X11-ABI-VIDEODRV \
X11-ABI-XINPUT \
glamor \
glamor-egl \
libexa.so \
libfbdevhw.so \
libglamoregl.so \
libglx.so \
libint10.so \
libshadow.so \
libshadowfb.so \
libvgahw.so \
libwfb.so \
xf86-video-ast \
xf86-video-cirrus \
xf86-video-modesetting \
xorg-x11-driver-input \
xorg-x11-driver-video \
xorg-x11-server \
xorg-x11-server-glx"

RDEPENDS:${PN} += "/usr/bin/mkdir \
/usr/bin/perl \
/usr/bin/sh \
/usr/bin/touch \
Mesa \
fillup \
ld-linux-aarch64.so.1 \
libGL.so.1 \
libXau.so.6 \
libXdmcp.so.6 \
libXfont2.so.2 \
libc.so.6 \
libcrypto.so.3 \
libdbus-1.so.3 \
libdrm.so.2 \
libepoxy.so.0 \
libgbm.so.1 \
libm.so.6 \
libpciaccess.so.0 \
libpixman-1-0 \
libpixman-1.so.0 \
libsystemd.so.0 \
libudev.so.1 \
libxcvt.so.0 \
libxshmfence.so.1 \
pkgconfig \
update-alternatives \
xkbcomp \
xkeyboard-config \
xorg-x11-server-Xvfb"

inherit rpm
