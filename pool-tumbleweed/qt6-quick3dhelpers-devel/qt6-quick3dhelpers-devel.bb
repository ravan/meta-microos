SUMMARY = "Qt6 Quick3DHelpers library - Development files"
DESCRIPTION = "Development files for the Qt 6 Quick3DHelpers library."
LICENSE = "GPL-3.0-only"

PV = "6.11.2"

RPM_NAME = "qt6-quick3dhelpers-devel-6.11.2-1.1.aarch64.rpm"
RPM_HASH = "28e13e99ee85b4a18b86c7a8aff8a52bfa24d99cbe43565aec9ddf6ecc679e8ed0b5342e53543fe48f6bd451932452b4380256c746fb2816d0c52589ce6c09f9"

RPROVIDES:${PN} += "cmake-Qt6Quick3DHelpers \
pkgconfig-Qt6Quick3DHelpers \
qt6-quick3dhelpers-devel"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
cmake-Qt6Qml \
cmake-Qt6Quick \
cmake-Qt6Quick3DPrivate \
libQt6Quick3DHelpers6 \
pkgconfig-Qt6Qml \
pkgconfig-Qt6Quick"

inherit rpm
