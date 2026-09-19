SUMMARY = "Development files for the Qt 5 QuickRenderer 3D library"
DESCRIPTION = "Development files for the Qt 5 QuickRenderer 3D library."
LICENSE = "LGPL-3.0-only | (GPL-2.0-only | GPL-3.0-or-later)"

PV = "5.15.19+kde0"

RPM_NAME = "libQt53DQuickRender-devel-5.15.19+kde0-1.2.aarch64.rpm"
RPM_HASH = "d876a980f67362b774acb77055b97db9faaf827f0d175325e4457573f7d410c88e0b0e454da04c8fce9ca938178268b265a1342ea80faad948711c27a41bffc9"

RPROVIDES:${PN} += "cmake-Qt53DQuickRender \
libQt53DQuickRender-devel \
libQt53DQuickRenderer-devel \
pkgconfig-Qt53DQuickRender"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libQt53DQuickRender5 \
pkgconfig-Qt53DCore \
pkgconfig-Qt53DQuick \
pkgconfig-Qt53DRender \
pkgconfig-Qt5Core \
pkgconfig-Qt5Gui \
pkgconfig-Qt5Qml"

inherit rpm
