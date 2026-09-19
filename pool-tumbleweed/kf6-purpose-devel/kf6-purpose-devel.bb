SUMMARY = "Framework to integrate services and actions - Build Environment"
DESCRIPTION = "This package contains development files needed to build applications which rely on the purpose framework."
LICENSE = "LGPL-2.1-or-later"

PV = "6.30.0"

RPM_NAME = "kf6-purpose-devel-6.30.0-1.1.aarch64.rpm"
RPM_HASH = "7c0ab94ababed95cde38e43c1a37b7861573b0479febb1e581b330b0ef5b9ecb8411e746fab15542632a749fd7518ee099e38842b4befbcd0e54f2c3091722f6"

RPROVIDES:${PN} += "cmake-KF6Purpose \
kf6-purpose-devel"

RDEPENDS:${PN} += "cmake-KF6CoreAddons \
cmake-Qt6Gui \
cmake-Qt6Widgets \
libKF6Purpose6 \
libKF6PurposeWidgets6"

inherit rpm
