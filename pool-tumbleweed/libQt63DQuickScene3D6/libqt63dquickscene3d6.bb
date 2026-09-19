SUMMARY = "Qt 6 3DQuickScene3D library"
DESCRIPTION = "The Qt 6 3DQuickScene3D library."
LICENSE = "GPL-2.0-only | LGPL-3.0-only | GPL-3.0-only"

PV = "6.11.2"

RPM_NAME = "libQt63DQuickScene3D6-6.11.2-1.1.aarch64.rpm"
RPM_HASH = "48b2c71482c4f2ba914dbe9962c8e3e985c2f2646a802e7cbad17e269b287c5c071791bcb1e80052083de51750c63007341931421734ac1214f6b8f86eee6321"

RPROVIDES:${PN} += "libQt63DQuickScene3D.so.6 \
libQt63DQuickScene3D6"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libQt63DAnimation.so.6 \
libQt63DCore.so.6 \
libQt63DInput.so.6 \
libQt63DLogic.so.6 \
libQt63DRender.so.6 \
libQt6Core.so.6 \
libQt6Gui.so.6 \
libQt6OpenGL.so.6 \
libQt6Qml.so.6 \
libQt6Quick.so.6 \
libc.so.6 \
libstdc++.so.6"

inherit rpm
