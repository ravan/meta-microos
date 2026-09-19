SUMMARY = "Qt 6 VirtualKeyboard library - Development files"
DESCRIPTION = "Development files for the Qt 6 VirtualKeyboard library."
LICENSE = "GPL-3.0-only"

PV = "6.11.2"

RPM_NAME = "qt6-virtualkeyboard-devel-6.11.2-1.1.aarch64.rpm"
RPM_HASH = "d4a126c754a6479f0ae608b4e24925472eeeef1f7f1f16698388e7c34d7209ca6707541251cf28e5967f3ebf210e19d4802a38d4e56418170c0cd7e7a0b99c00"

RPROVIDES:${PN} += "cmake-Qt6VirtualKeyboard \
pkgconfig-Qt6HunspellInputMethod \
pkgconfig-Qt6VirtualKeyboard \
qt6-virtualkeyboard-devel"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
cmake-Qt6Gui \
cmake-Qt6Qml \
cmake-Qt6Quick \
libQt6VirtualKeyboard6 \
pkgconfig-Qt6Core \
pkgconfig-Qt6Gui \
pkgconfig-Qt6Qml \
pkgconfig-Qt6Quick \
pkgconfig-Qt6VirtualKeyboard"

inherit rpm
