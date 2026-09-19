SUMMARY = "Non-ABI stable API for the Qt 6 QmlModels library"
DESCRIPTION = "This package provides private headers of libQt6QmlModels that do not have any \
ABI or API guarantees."
LICENSE = "GPL-2.0-only | GPL-3.0-or-later | LGPL-3.0-only"

PV = "6.11.2"

RPM_NAME = "qt6-qmlmodels-private-devel-6.11.2-2.1.aarch64.rpm"
RPM_HASH = "53efc7162ca20d834eb31e539b42994e8788a2087634975fb4f626ba256604c1bd4e1833f5aa79c37099079221612c6623eb356d119e29522f6643bb6b94e7d3"

RPROVIDES:${PN} += "cmake-Qt6QmlModels \
cmake-Qt6QmlModelsPrivate \
pkgconfig-Qt6QmlModels \
qt6-qmlmodels-devel \
qt6-qmlmodels-private-devel"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
cmake-Qt6Core \
cmake-Qt6CorePrivate \
cmake-Qt6Qml \
cmake-Qt6QmlPrivate \
libQt6QmlModels6 \
pkgconfig-Qt6Core \
pkgconfig-Qt6Qml"

inherit rpm
