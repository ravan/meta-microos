SUMMARY = "Qt 6 ChartsQml library"
DESCRIPTION = "The Qt 6 ChartsQml library."
LICENSE = "GPL-3.0-only"

PV = "6.11.2"

RPM_NAME = "libQt6ChartsQml6-6.11.2-1.1.aarch64.rpm"
RPM_HASH = "a7235eb60a7b4c523a8c8b440454be14eb0fb8c6e749cbd8c20795895ad56a05f5f8c3380c3a280e983d8c66fa106f551c1e43d93f4942a8b573dc276924ae6c"

RPROVIDES:${PN} += "libQt6ChartsQml.so.6 \
libQt6ChartsQml6"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libQt6Charts.so.6 \
libQt6Core.so.6 \
libQt6Gui.so.6 \
libQt6OpenGL.so.6 \
libQt6Qml.so.6 \
libQt6Quick.so.6 \
libQt6Widgets.so.6 \
libc.so.6 \
libstdc++.so.6"

inherit rpm
