SUMMARY = "Qt 6 3DQuickScene2D library"
DESCRIPTION = "The Qt 6 3DQuickScene2D library."
LICENSE = "GPL-2.0-only | LGPL-3.0-only | GPL-3.0-only"

PV = "6.11.2"

RPM_NAME = "libQt63DQuickScene2D6-6.11.2-1.1.aarch64.rpm"
RPM_HASH = "a0f7750c0e6507a221317fc9eb7215467c172ced108a3cac6a8fd9de1ab0c96c78016fca6401800f24f929b02ae76986cf6f39042e3256cee57aa65909c98666"

RPROVIDES:${PN} += "libQt63DQuickScene2D.so.6 \
libQt63DQuickScene2D6 \
libscene2d.so"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libQt63DCore.so.6 \
libQt63DRender.so.6 \
libQt6Core.so.6 \
libQt6Gui.so.6 \
libQt6OpenGL.so.6 \
libQt6Qml.so.6 \
libQt6Quick.so.6 \
libc.so.6 \
libstdc++.so.6"

inherit rpm
