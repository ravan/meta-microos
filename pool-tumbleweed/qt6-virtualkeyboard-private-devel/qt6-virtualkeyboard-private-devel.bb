SUMMARY = "Non-ABI stable API for the Qt 6 VirtualKeyboard library"
DESCRIPTION = "This package provides private headers of libQt6VirtualKeyboard that do not have \
any ABI or API guarantees."
LICENSE = "GPL-3.0-only"

PV = "6.11.2"

RPM_NAME = "qt6-virtualkeyboard-private-devel-6.11.2-1.1.aarch64.rpm"
RPM_HASH = "0dcca2be6f362d395a921176e0f0e05447f9dde440fb64a4d3897261c2d9cff531ac4e69a2f9a6ddb9e69b6a74ac2912443d27d377e287755032a02db1ce103b"

RPROVIDES:${PN} += "cmake-Qt6VirtualKeyboardPrivate \
cmake-Qt6VirtualKeyboardSettings \
cmake-Qt6VirtualKeyboardSettingsPrivate \
pkgconfig-Qt6VirtualKeyboardSettings \
qt6-virtualkeyboard-private-devel"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
cmake-Qt6CorePrivate \
cmake-Qt6GuiPrivate \
cmake-Qt6VirtualKeyboard"

inherit rpm
