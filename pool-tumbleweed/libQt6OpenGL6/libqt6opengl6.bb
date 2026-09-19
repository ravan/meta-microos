SUMMARY = "Qt 6 OpenGL library"
DESCRIPTION = "The Qt OpenGL module provides an OpenGL widget class that can be used \
like any other Qt widget, except that it opens an OpenGL display \
buffer where the OpenGL API can be used to render the contents."
LICENSE = "LGPL-2.1-with-Qt-Company-Qt-exception-1.1 | LGPL-3.0-only"

PV = "6.11.2"

RPM_NAME = "libQt6OpenGL6-6.11.2-2.1.aarch64.rpm"
RPM_HASH = "429011d1ddab327b69af4e02d9d7a0a4f6282a6f94bf02f5c560aea8f2ec8d39b9837810bfd2362dd87cf3e0245012593a78c559f0586953d1a05bd19a7c70bb"

RPROVIDES:${PN} += "libQt6OpenGL.so.6 \
libQt6OpenGL6"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libGLESv2.so.2 \
libQt6Core.so.6 \
libQt6Gui.so.6 \
libQt6Widgets6 \
libc.so.6 \
libm.so.6 \
libstdc++.so.6"

inherit rpm
