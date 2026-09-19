SUMMARY = "Qt 6 QuickTest library - Development files"
DESCRIPTION = "Development files for the Qt 6 QuickTest library."
LICENSE = "GPL-2.0-only | GPL-3.0-or-later | LGPL-3.0-only"

PV = "6.11.2"

RPM_NAME = "qt6-quicktest-devel-6.11.2-2.1.aarch64.rpm"
RPM_HASH = "9705abcf4568f987a9251f9d9188e4ae5bda9c6a9e74733a4b358be7abd23fbe50ca9a6c8c968d0e6d085a59a8d7d53afb82da53cdc5a3a394625ea03b8ab0c0"

RPROVIDES:${PN} += "cmake-Qt6QuickTest \
pkgconfig-Qt6QuickTest \
qt6-quicktest-devel"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
cmake-Qt6Gui \
cmake-Qt6Qml \
cmake-Qt6Quick \
cmake-Qt6Test \
libQt6QuickTest6 \
pkgconfig-Qt6Core \
pkgconfig-Qt6Test"

inherit rpm
