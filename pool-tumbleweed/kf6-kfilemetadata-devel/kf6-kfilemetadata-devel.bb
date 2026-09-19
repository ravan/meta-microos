SUMMARY = "Development package for kfilemetadata"
DESCRIPTION = "A library for extracting file metadata. Development files"
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later & LGPL-3.0-only"

PV = "6.30.0"

RPM_NAME = "kf6-kfilemetadata-devel-6.30.0-1.1.aarch64.rpm"
RPM_HASH = "e1db044eaeab672e1ce0d7c1b0e77dede9e487eef36cbe4fdb212fbd0abcfe0ce5aba50162a5faed67ced3d66014f6a34513681c73e2a930b2aefaa8abd7350d"

RPROVIDES:${PN} += "cmake-KF6FileMetaData \
kf6-kfilemetadata-devel"

RDEPENDS:${PN} += "cmake-Qt6Core \
libKF6FileMetaData3"

inherit rpm
