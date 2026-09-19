SUMMARY = "Development files for the Qt 5 QuickInput 3D library"
DESCRIPTION = "Development files for the Qt 5 Quick Input 3D library."
LICENSE = "LGPL-3.0-only | (GPL-2.0-only | GPL-3.0-or-later)"

PV = "5.15.19+kde0"

RPM_NAME = "libQt53DQuickInput-devel-5.15.19+kde0-1.2.aarch64.rpm"
RPM_HASH = "521125c62a702076caedf6ea47f2b2b7c38bb91986c1658489bbe382f55b9fe0f2dcfedbc80123212a5131a716fb2d556477eacc6a7187c6a4c4128a9fc50c6d"

RPROVIDES:${PN} += "cmake-Qt53DQuickInput \
libQt53DQuickInput-devel \
pkgconfig-Qt53DQuickInput"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libQt53DQuickInput5 \
pkgconfig-Qt53DCore \
pkgconfig-Qt53DInput \
pkgconfig-Qt53DQuick \
pkgconfig-Qt5Core \
pkgconfig-Qt5Gui \
pkgconfig-Qt5Qml"

inherit rpm
