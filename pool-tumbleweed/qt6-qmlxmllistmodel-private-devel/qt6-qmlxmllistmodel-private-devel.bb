SUMMARY = "Qt 6 QmlXmlListModel library - Development files"
DESCRIPTION = "Development files for the Qt 6 QmlXmlListModel library. \
This library does not have any ABI or API guarantees."
LICENSE = "GPL-2.0-only | GPL-3.0-or-later | LGPL-3.0-only"

PV = "6.11.2"

RPM_NAME = "qt6-qmlxmllistmodel-private-devel-6.11.2-2.1.aarch64.rpm"
RPM_HASH = "f39596e754d396b71b94fe9b6a9e0146e2f17532e7aed0604f5e8ddd83068d1181af2318ae5666bcf30ba30c6ee38de384701c21af8253eb9289bbb6da747d3a"

RPROVIDES:${PN} += "cmake-Qt6QmlXmlListModel \
cmake-Qt6QmlXmlListModelPrivate \
pkgconfig-Qt6QmlXmlListModel \
qt6-qmlxmllistmodel-devel \
qt6-qmlxmllistmodel-private-devel"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
cmake-Qt6CorePrivate \
cmake-Qt6Qml \
cmake-Qt6QmlModels \
libQt6QmlXmlListModel6 \
pkgconfig-Qt6Core \
pkgconfig-Qt6Qml"

inherit rpm
