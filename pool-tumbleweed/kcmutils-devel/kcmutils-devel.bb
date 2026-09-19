SUMMARY = "Build environment for kcmutils, a set of classes to work with KCModules"
DESCRIPTION = "KCMUtils provides various classes to work with KCModules. KCModules can be \
created with the KConfigWidgets framework. Development files."
LICENSE = "LGPL-2.1-or-later"

PV = "5.116.0"

RPM_NAME = "kcmutils-devel-5.116.0-1.8.aarch64.rpm"
RPM_HASH = "3648462c2e9a758f4fc72dfd70a49a3bdb625ccd1eb75982f4ef630b1a54db13c59b22e4144a3a61fe3d0f52aaacf3c03c0128301d5d8aba8e81363991e10206"

RPROVIDES:${PN} += "cmake-KF5KCMUtils \
kcmutils-devel"

RDEPENDS:${PN} += "cmake-KF5ConfigWidgets \
cmake-KF5Service \
libKF5KCMUtils5 \
libKF5KCMUtilsCore5"

inherit rpm
