SUMMARY = "Qt 6 Quick3DSpatialAudio library"
DESCRIPTION = "The Qt 6 Quick3DSpatialAudio library. \
This library does not have any ABI or API guarantees."
LICENSE = "GPL-3.0-only"

PV = "6.11.2"

RPM_NAME = "libQt6Quick3DSpatialAudio6-6.11.2-1.1.aarch64.rpm"
RPM_HASH = "d52ba3a3641e3e0b506dfbdd8c3932deb21fa1e9f32923f48996edbee69017e27a412fce44113cab1a06aa1c2952ec8f59befb6691d2fa26f20d52821af7451a"

RPROVIDES:${PN} += "libQt6Quick3DSpatialAudio.so.6 \
libQt6Quick3DSpatialAudio6"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libQt6Core.so.6 \
libQt6Gui.so.6 \
libQt6Multimedia.so.6 \
libQt6Qml.so.6 \
libQt6Quick3D.so.6 \
libQt6SpatialAudio.so.6 \
libc.so.6 \
libstdc++.so.6"

inherit rpm
