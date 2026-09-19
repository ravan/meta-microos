SUMMARY = "Development files for the Qt 6 VirtualKeyboardQml library"
DESCRIPTION = "Development files for the Qt 6 VirtualKeyboardQml library. \
This library does not have any ABI or API guarantees."
LICENSE = "GPL-3.0-only"

PV = "6.11.2"

RPM_NAME = "qt6-virtualkeyboardqml-private-devel-6.11.2-1.1.aarch64.rpm"
RPM_HASH = "a34a4f3c4f221c734438f67cfece18a06ac02ed405730490a6db5f198ed0ab14366b8014eaf563924178a2c6acab1f562755a1ea5a3c1b2e6a473dd54e6f3a84"

RPROVIDES:${PN} += "cmake-Qt6VirtualKeyboardQml \
cmake-Qt6VirtualKeyboardQmlPrivate \
pkgconfig-Qt6VirtualKeyboardQml \
qt6-virtualkeyboardqml-private-devel"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
cmake-Qt6Gui \
cmake-Qt6VirtualKeyboard \
libQt6VirtualKeyboardQml6 \
pkgconfig-Qt6Core \
pkgconfig-Qt6Gui \
pkgconfig-Qt6Qml \
pkgconfig-Qt6Quick \
pkgconfig-Qt6VirtualKeyboard"

inherit rpm
