SUMMARY = "Non-ABI stable API for the Qt 6 QmlLocalStorage library"
DESCRIPTION = "Development files for the Qt 6 QmlLocalStorage library. \
This library does not have any ABI or API guarantees."
LICENSE = "GPL-2.0-only | GPL-3.0-or-later | LGPL-3.0-only"

PV = "6.11.2"

RPM_NAME = "qt6-qmllocalstorage-private-devel-6.11.2-2.1.aarch64.rpm"
RPM_HASH = "de4a15450bc5df8b499f56a22d0d1d951654bc982f01aa98c43921ee291ef544a3dc4e2f9a38942fdcda620338c56f8f140f5bc6af39ec3e18e1ed1f15fccf63"

RPROVIDES:${PN} += "cmake-Qt6QmlLocalStorage \
cmake-Qt6QmlLocalStoragePrivate \
pkgconfig-Qt6QmlLocalStorage \
qt6-qmllocalstorage-devel \
qt6-qmllocalstorage-private-devel"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
cmake-Qt6CorePrivate \
cmake-Qt6QmlPrivate \
cmake-Qt6Sql \
libQt6QmlLocalStorage6 \
pkgconfig-Qt6Sql"

inherit rpm
