SUMMARY = "Qt6 QuickDialogs2Utils library - Development files"
DESCRIPTION = "The Qt 6 QuickDialogs2Utils library. \
This library does not have any ABI or API guarantees."
LICENSE = "GPL-2.0-only | GPL-3.0-or-later | LGPL-3.0-only"

PV = "6.11.2"

RPM_NAME = "qt6-quickdialogs2utils-private-devel-6.11.2-2.1.aarch64.rpm"
RPM_HASH = "fae41bc44c9a08789979f45ec3fc1d1b6a28c157e7cfa7500419b46d989800bb574a3a06ea285f47b41cf7bbdd3080cd6a2459b204884a229722da193bf016d9"

RPROVIDES:${PN} += "cmake-Qt6QuickDialogs2Utils \
cmake-Qt6QuickDialogs2UtilsPrivate \
pkgconfig-Qt6QuickDialogs2Utils \
qt6-quickdialogs2utils-devel \
qt6-quickdialogs2utils-private-devel"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
cmake-Qt6Gui \
cmake-Qt6QmlModelsPrivate \
libQt6QuickDialogs2Utils6 \
pkgconfig-Qt6Core"

inherit rpm
