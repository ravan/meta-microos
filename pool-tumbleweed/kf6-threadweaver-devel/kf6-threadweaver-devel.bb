SUMMARY = "KDE Helper for multithreaded programming"
DESCRIPTION = "Development files for the KF6 ThreadWeaver library."
LICENSE = "LGPL-2.1-or-later"

PV = "6.30.0"

RPM_NAME = "kf6-threadweaver-devel-6.30.0-1.1.aarch64.rpm"
RPM_HASH = "594008e48137996a4d314090db6da00084724e3b5fc51e234bfec1fa060d4e52021facc073c6d5876605d77c85dece1a2d8a7e22a5cd10c99151ed20ac11b30c"

RPROVIDES:${PN} += "cmake-KF6ThreadWeaver \
kf6-threadweaver-devel"

RDEPENDS:${PN} += "cmake-Qt6Core \
libKF6ThreadWeaver6"

inherit rpm
