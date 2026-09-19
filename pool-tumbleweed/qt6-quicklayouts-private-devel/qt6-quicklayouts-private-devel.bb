SUMMARY = "Non-ABI stable API for the Qt 6 QuickLayouts library"
DESCRIPTION = "Development files for the Qt 6 QuickLayouts library. \
This library does not have any ABI or API guarantees."
LICENSE = "GPL-2.0-only | GPL-3.0-or-later | LGPL-3.0-only"

PV = "6.11.2"

RPM_NAME = "qt6-quicklayouts-private-devel-6.11.2-2.1.aarch64.rpm"
RPM_HASH = "ced482213845a1dbe97a0a99ed9bc0147f5fb95ec302b03f756585b36576081b68613a9d8a1b1b180315c69b1891546e3b98d8db678602a6c2b990984ff2bc76"

RPROVIDES:${PN} += "cmake-Qt6QuickLayouts \
cmake-Qt6QuickLayoutsPrivate \
pkgconfig-Qt6QuickLayouts \
qt6-quicklayouts-devel \
qt6-quicklayouts-private-devel"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
cmake-Qt6Gui \
cmake-Qt6GuiPrivate \
cmake-Qt6Qml \
cmake-Qt6QuickPrivate \
libQt6QuickLayouts6 \
pkgconfig-Qt6Core \
pkgconfig-Qt6Qml"

inherit rpm
