SUMMARY = "Build environment for kcmutils, a set of classes to work with KCModules"
DESCRIPTION = "KCMUtils provides various classes to work with KCModules. KCModules can be \
created with the KConfigWidgets framework. Development files."
LICENSE = "LGPL-2.1-or-later"

PV = "6.30.0"

RPM_NAME = "kf6-kcmutils-devel-6.30.0-1.1.aarch64.rpm"
RPM_HASH = "78cfa57d3f97b53da5626669293cd6b9a4d7b7026cd7cb76787e198685713348f5f085b7b455813d343578bfd1f72e336088f99e5bb850c53014a87aa3cd7afd"

RPROVIDES:${PN} += "cmake-KF6KCMUtils \
kf6-kcmutils-devel"

RDEPENDS:${PN} += "cmake-KF6ConfigWidgets \
cmake-KF6CoreAddons \
cmake-Qt6Qml \
libKF6KCMUtils6 \
libKF6KCMUtilsCore6 \
libKF6KCMUtilsQuick6"

inherit rpm
