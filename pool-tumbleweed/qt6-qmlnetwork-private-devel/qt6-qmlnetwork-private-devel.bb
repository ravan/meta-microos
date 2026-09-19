SUMMARY = "Qt 6 QmlNetwork library - Development files"
DESCRIPTION = "Development files for the Qt 6 QmlNetwork library. \
This library does not have any ABI or API guarantees."
LICENSE = "GPL-2.0-only | GPL-3.0-or-later | LGPL-3.0-only"

PV = "6.11.2"

RPM_NAME = "qt6-qmlnetwork-private-devel-6.11.2-2.1.aarch64.rpm"
RPM_HASH = "461b9e11dbb3772c0d2b64aa46c690687ffc49edd39cbf6440def22230615602b719c61969c0ecfcc24b056aeff42136309c5f008b0e815751429eafb89ea1dc"

RPROVIDES:${PN} += "cmake-Qt6QmlNetwork \
cmake-Qt6QmlNetworkPrivate \
pkgconfig-Qt6QmlNetwork \
qt6-qmlnetwork-private-devel"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libQt6QmlNetwork6 \
pkgconfig-Qt6Core \
pkgconfig-Qt6Network \
pkgconfig-Qt6Qml \
qt6-network-devel \
qt6-qml-devel"

inherit rpm
