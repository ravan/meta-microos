SUMMARY = "Qt 6 RemoteObjects library - Development files"
DESCRIPTION = "Development files for the Qt 6 RemoteObjects library."
LICENSE = "GPL-2.0-only | GPL-3.0-or-later | LGPL-3.0-only"

PV = "6.11.2"

RPM_NAME = "qt6-remoteobjects-devel-6.11.2-1.1.aarch64.rpm"
RPM_HASH = "5fd7b706d41283a6b1731d01a11f2f31fccbaf13bce67edbf85298ddf9ff182182fe6b0c9255349a21ac35ad0ee3d60efc93bd8193674d729e3652a6fd830426"

RPROVIDES:${PN} += "cmake-Qt6RemoteObjects \
cmake-Qt6RemoteObjectsTools \
cmake-Qt6RepParser \
pkgconfig-Qt6RemoteObjects \
pkgconfig-Qt6RepParser \
qt6-remoteobjects-devel"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
cmake-Qt6Gui \
cmake-Qt6Network \
cmake-Qt6Qml \
libQt6RemoteObjects6 \
pkgconfig-Qt6Core \
pkgconfig-Qt6Network \
qt6-remoteobjects-tools"

inherit rpm
