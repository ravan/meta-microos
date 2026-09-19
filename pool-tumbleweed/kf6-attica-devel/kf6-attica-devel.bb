SUMMARY = "Open Collaboration Service client library - development files"
DESCRIPTION = "Development files for attica, a library to access Open Collaboration Service servers."
LICENSE = "LGPL-2.1-or-later"

PV = "6.30.0"

RPM_NAME = "kf6-attica-devel-6.30.0-1.1.aarch64.rpm"
RPM_HASH = "e9204c7785f9b369691c611e4be1cf8fc2a1d61d8ab924fcd023d914a55e039806aec669b7749ed75098327e9072b5965df411b94318ffda017dbb40d97d6d47"

RPROVIDES:${PN} += "cmake-KF6Attica \
kf6-attica-devel \
pkgconfig-KF6Attica"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
cmake-Qt6Core \
cmake-Qt6Network \
libKF6Attica6 \
pkgconfig-Qt6Core \
pkgconfig-Qt6Network"

inherit rpm
