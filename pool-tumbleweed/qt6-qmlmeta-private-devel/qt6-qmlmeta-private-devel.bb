SUMMARY = "Qt 6 QmlMeta library - Development files"
DESCRIPTION = "Development files for the Qt 6 QmlMeta library. \
This library does not have any ABI or API guarantees."
LICENSE = "GPL-2.0-only | GPL-3.0-or-later | LGPL-3.0-only"

PV = "6.11.2"

RPM_NAME = "qt6-qmlmeta-private-devel-6.11.2-2.1.aarch64.rpm"
RPM_HASH = "cab2cae1c3ce7ee7bac811702a516abf3ba8365edc8b1ce83264b624be794c500abd1735061e8ca4cefe72f58f06b30802faee4d2ebd498bd55c6829a453bcd7"

RPROVIDES:${PN} += "cmake-Qt6QmlMeta \
cmake-Qt6QmlMetaPrivate \
pkgconfig-Qt6QmlMeta \
qt6-qmlmeta-private-devel"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
cmake-Qt6Qml \
cmake-Qt6QmlModels \
cmake-Qt6QmlWorkerScript \
libQt6QmlMeta6 \
pkgconfig-Qt6Qml \
pkgconfig-Qt6QmlModels \
pkgconfig-Qt6QmlWorkerScript"

inherit rpm
