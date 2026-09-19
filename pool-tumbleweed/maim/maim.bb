SUMMARY = "Flexible screenshotting utility"
DESCRIPTION = "maim (Make Image) is a utility that takes screenshots of the desktop \
using EGL. It is meant to overcome shortcomings of the 'scrot' \
utility and performs better in several ways."
LICENSE = "GPL-3.0-or-later"

PV = "5.8.0"

RPM_NAME = "maim-5.8.0-3.9.aarch64.rpm"
RPM_HASH = "71c6c4678eb2a8c614d60c882c1a62db74d8418a0914380838adbf444dec85b6b874dacde73beb5f8720d49a75c3272e0cf14531bdf85b5b4ab1e5192ea6990d"

RPROVIDES:${PN} += "maim"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libGL.so.1 \
libX11.so.6 \
libXcomposite.so.1 \
libXext.so.6 \
libXfixes.so.3 \
libXrandr.so.2 \
libXrender.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libicuuc.so.78 \
libjpeg.so.8 \
libpng16.so.16 \
libslopy.so.7.7 \
libstdc++.so.6 \
libwebp.so.7"

inherit rpm
