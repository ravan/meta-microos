SUMMARY = "Qt 6 Charts library"
DESCRIPTION = "The Qt 6 Charts library."
LICENSE = "GPL-3.0-only"

PV = "6.11.2"

RPM_NAME = "libQt6Charts6-6.11.2-1.1.aarch64.rpm"
RPM_HASH = "a730e7c4a67882da828cc342026709113c694b5342c23c00d08823de253e3a186da133c1fb5e00c532c0f76ff86ccdec9c65f123cb70ed7ef5726336b12d4e63"

RPROVIDES:${PN} += "libQt6Charts.so.6 \
libQt6Charts6"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libQt6Core.so.6 \
libQt6Gui.so.6 \
libQt6OpenGL.so.6 \
libQt6OpenGLWidgets.so.6 \
libQt6Widgets.so.6 \
libc.so.6 \
libm.so.6 \
libstdc++.so.6"

inherit rpm
