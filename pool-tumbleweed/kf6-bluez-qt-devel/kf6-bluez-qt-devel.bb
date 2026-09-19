SUMMARY = "Async Bluez wrapper library - development files"
DESCRIPTION = "Development files for QBluez Async Bluez wrapper library."
LICENSE = "LGPL-2.1-or-later"

PV = "6.30.0"

RPM_NAME = "kf6-bluez-qt-devel-6.30.0-1.1.aarch64.rpm"
RPM_HASH = "039d1e3bb320a09c6690a06cf784996d38dde7e69a398fbceeb815fb3d48f9e32ebf583746869525f9abec349f84cf028232e75754874f969440b188f3f5fb43"

RPROVIDES:${PN} += "cmake-KF6BluezQt \
kf6-bluez-qt-devel \
pkgconfig-KF6BluezQt"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
cmake-Qt6Core \
cmake-Qt6DBus \
libKF6BluezQt6 \
pkgconfig-Qt6Core \
pkgconfig-Qt6DBus \
pkgconfig-Qt6Network"

inherit rpm
