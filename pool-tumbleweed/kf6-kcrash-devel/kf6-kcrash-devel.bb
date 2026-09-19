SUMMARY = "Build environment for the KCrash application crash handler"
DESCRIPTION = "KCrash provides support for intercepting and handling application crashes. \
Development files."
LICENSE = "LGPL-2.1-or-later"

PV = "6.30.0"

RPM_NAME = "kf6-kcrash-devel-6.30.0-1.1.aarch64.rpm"
RPM_HASH = "dd816a890ade05250d26dc781aac7c0bdf5830e1b93d2cc376c67dc88fad48a213fe2a654f70d7f5b9b044c5362d633afa66ac9505ecbcbae49ffa32d885f537"

RPROVIDES:${PN} += "cmake-KF6Crash \
kf6-kcrash-devel"

RDEPENDS:${PN} += "cmake-Qt6Core \
libKF6Crash6"

inherit rpm
