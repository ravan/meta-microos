SUMMARY = "Qt 6 QmlWorkerScript library - Development files"
DESCRIPTION = "Development files for the Qt 6 QmlWorkerScript library. \
This library does not have any ABI or API guarantees."
LICENSE = "GPL-2.0-only | GPL-3.0-or-later | LGPL-3.0-only"

PV = "6.11.2"

RPM_NAME = "qt6-qmlworkerscript-private-devel-6.11.2-2.1.aarch64.rpm"
RPM_HASH = "4c7ec7d182cea70fb17e95c3f63110cbaa071adf7175911a6b71d2ab69fb8b4b531eae2fd731032a55ab61a6fd82c498b55049aeccb953c3115903eb8c00f27a"

RPROVIDES:${PN} += "cmake-Qt6QmlWorkerScript \
cmake-Qt6QmlWorkerScriptPrivate \
pkgconfig-Qt6QmlWorkerScript \
qt6-qmlworkerscript-devel \
qt6-qmlworkerscript-private-devel"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
cmake-Qt6Core \
cmake-Qt6CorePrivate \
cmake-Qt6Qml \
cmake-Qt6QmlPrivate \
libQt6QmlWorkerScript6 \
pkgconfig-Qt6Core \
pkgconfig-Qt6Qml"

inherit rpm
