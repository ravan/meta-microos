SUMMARY = "Qt 6 Configuration Tool"
DESCRIPTION = "This program allows users to configure Qt6 settings (theme, font, icons, \
etc.) under DE/WM without Qt integration."
LICENSE = "BSD-2-Clause"

PV = "0.11"

RPM_NAME = "qt6ct-0.11-1.11.aarch64.rpm"
RPM_HASH = "c16b26458ac5a121bdc804c1dcdf45f5a2bcf52af79947877ef64e5322034e22ce4b4236e8c621c4ca53f5b960450df4fd5b0a3b2a274b9c90872d940ea856f7"

RPROVIDES:${PN} += "libqt6ct-common.so.0.11 \
libqt6ct-style.so \
libqt6ct.so \
qt6ct"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libQt6Core.so.6 \
libQt6Gui.so.6 \
libQt6Svg6 \
libQt6Widgets.so.6 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6"

inherit rpm
