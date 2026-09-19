SUMMARY = "Qt 6 OpenGLWidgets library"
DESCRIPTION = "The Qt OpenGL Widgets module provides an OpenGLWidgets class that can be used \
like any other Qt widget, except that it opens an OpenGL display \
buffer where the OpenGL API can be used to render the contents."
LICENSE = "LGPL-2.1-with-Qt-Company-Qt-exception-1.1 | LGPL-3.0-only"

PV = "6.11.2"

RPM_NAME = "libQt6OpenGLWidgets6-6.11.2-2.1.aarch64.rpm"
RPM_HASH = "aae75b577c5d82c72831114b1b5705ece73dfe3eee1d864eec2c45b2bfd5db971b6ee01b68a573c3f16e0de0aeb1b5941aeaee050c9a71ab3fb87a133cece542"

RPROVIDES:${PN} += "libQt6OpenGLWidgets.so.6 \
libQt6OpenGLWidgets6"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libQt6Core.so.6 \
libQt6Gui.so.6 \
libQt6OpenGL.so.6 \
libQt6Widgets.so.6 \
libQt6Widgets6 \
libc.so.6 \
libstdc++.so.6"

inherit rpm
