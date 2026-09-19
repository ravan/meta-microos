SUMMARY = "Qt 5 OpenGL Library"
DESCRIPTION = "The Qt OpenGL module provides an OpenGL widget class that can be used \
like any other Qt widget, except that it opens an OpenGL display \
buffer where the OpenGL API can be used to render the contents."
LICENSE = "LGPL-3.0-only | GPL-3.0-with-Qt-Company-Qt-exception-1.1"

PV = "5.15.19+kde96"

RPM_NAME = "libQt5OpenGL5-5.15.19+kde96-1.3.aarch64.rpm"
RPM_HASH = "8abed4f4ac7ffd1657b36def65c3ed3e00c763be7714f03d141cd7680f6a35b76407bda5de7840ed19ba2f64d53864ad4353261f19cc02d740802f39f0e61a32"

RPROVIDES:${PN} += "libQt5OpenGL.so.5 \
libQt5OpenGL5"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libQt5Core.so.5 \
libQt5Gui.so.5 \
libQt5Widgets.so.5 \
libQt5Widgets5 \
libc.so.6 \
libstdc++.so.6"

inherit rpm
