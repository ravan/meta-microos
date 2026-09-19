SUMMARY = "Qt 6 QuickEffects library - Development files"
DESCRIPTION = "Development files for the Qt 6 QuickEffects library. \
This library does not have any ABI or API guarantees."
LICENSE = "GPL-2.0-only | GPL-3.0-or-later | LGPL-3.0-only"

PV = "6.11.2"

RPM_NAME = "qt6-quickeffects-private-devel-6.11.2-2.1.aarch64.rpm"
RPM_HASH = "573722febbe731b0ceb3315cbc6e147cc6ebeaec1e5c3b6944a0468d6f790b8286322e9dad5eded94c05860174b567bd9d67803b7daedfe20b39bc0d89467f31"

RPROVIDES:${PN} += "cmake-Qt6QuickEffects \
cmake-Qt6QuickEffectsPrivate \
pkgconfig-Qt6QuickEffects \
qt6-quickeffects-private-devel"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
cmake-Qt6CorePrivate \
cmake-Qt6GuiPrivate \
cmake-Qt6QmlPrivate \
cmake-Qt6QuickPrivate \
libQt6QuickEffects6 \
pkgconfig-Qt6Core \
pkgconfig-Qt6Gui \
pkgconfig-Qt6Qml \
pkgconfig-Qt6Quick"

inherit rpm
