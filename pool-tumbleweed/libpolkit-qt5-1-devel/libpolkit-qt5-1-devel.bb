SUMMARY = "PolicyKit Library Qt Bindings"
DESCRIPTION = "Polkit-qt aims to make it easy for Qt developers to take advantage of \
PolicyKit API. It is a convenience wrapper around QAction and \
QAbstractButton that lets you integrate those two components easily \
with PolicyKit."
LICENSE = "LGPL-2.1-or-later"

PV = "0.201.1"

RPM_NAME = "libpolkit-qt5-1-devel-0.201.1-1.3.aarch64.rpm"
RPM_HASH = "c538724a76df7f3dfcad659bcea3d8738ba6cb9fcf2096a9d454f8a8fad4f13bc75817b39e3c9ff48e75e7564d96b84d10ede42fe0b7fff59688ef5b11e3f05a"

RPROVIDES:${PN} += "cmake-PolkitQt5-1 \
libpolkit-qt5-1-devel \
pkgconfig-polkit-qt5-1 \
pkgconfig-polkit-qt5-agent-1 \
pkgconfig-polkit-qt5-core-1 \
pkgconfig-polkit-qt5-gui-1"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libpolkit-qt5-1-1 \
pkgconfig-Qt5Core \
pkgconfig-Qt5Gui \
pkgconfig-polkit-qt5-agent-1 \
pkgconfig-polkit-qt5-core-1 \
pkgconfig-polkit-qt5-gui-1 \
polkit-devel"

inherit rpm
