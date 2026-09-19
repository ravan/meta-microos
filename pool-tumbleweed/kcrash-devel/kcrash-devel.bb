SUMMARY = "Build environment for the KCrash application crash handler"
DESCRIPTION = "KCrash provides support for intercepting and handling application crashes. \
Development files."
LICENSE = "LGPL-2.1-or-later"

PV = "5.116.0"

RPM_NAME = "kcrash-devel-5.116.0-1.7.aarch64.rpm"
RPM_HASH = "91f32336aadc85ae8550ce322869d5e8e2fcc59e3d89e14a2ca30a689ee8dbc07e30cc7a4cc7a2fb27949bbb49b2e0d9652055cc03380fed4867fa905ae33500"

RPROVIDES:${PN} += "cmake-KF5Crash \
kcrash-devel"

RDEPENDS:${PN} += "cmake-Qt5Core \
libKF5Crash5"

inherit rpm
