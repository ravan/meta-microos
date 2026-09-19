SUMMARY = "Widgets for showing progress of asynchronous jobs"
DESCRIPTION = "KJobWIdgets provides widgets for showing progress of asynchronous jobs. \
Development files."
LICENSE = "LGPL-2.1-or-later"

PV = "5.116.0"

RPM_NAME = "kjobwidgets-devel-5.116.0-1.8.aarch64.rpm"
RPM_HASH = "bd04d442702ea0304ad5f5baa529bb4e8f0fb2e7e251abbcfe3a6596e18cc4eba5f926267bd28da96986c0de41cbc194d14efe4d54ab39b8040582e1d8c7688e"

RPROVIDES:${PN} += "cmake-KF5JobWidgets \
kjobwidgets-devel"

RDEPENDS:${PN} += "cmake-KF5CoreAddons \
cmake-Qt5Widgets \
libKF5JobWidgets5"

inherit rpm
