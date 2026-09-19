SUMMARY = "Shared library for Qt6 Widgets for Technical Applications"
DESCRIPTION = "This package contains the shared library to run Technical Applications \
developed with/for Qwt(Qt5)."
LICENSE = "SUSE-QWT-1.0"

PV = "6.3.0"

RPM_NAME = "libqwt6-qt6-6_3-6.3.0-1.10.aarch64.rpm"
RPM_HASH = "ed33d48881adebc3a15bf8a774c74648c73c420dbbbc851b43ed5d63c7db1bd1e078d86dcfddacdf62e019286825469f51fe4ec8f7fdb4ce1f35f87686676e92"

RPROVIDES:${PN} += "libqwt-qt6.so.6.3 \
libqwt6-qt6-6-3"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libQt6Core.so.6 \
libQt6Gui.so.6 \
libQt6OpenGL.so.6 \
libQt6OpenGLWidgets.so.6 \
libQt6Svg.so.6 \
libQt6Widgets.so.6 \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libstdc++.so.6"

inherit rpm
