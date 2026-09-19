SUMMARY = "Development files for kcalutils"
DESCRIPTION = "This package contains necessary include files and libraries needed \
to develop applications wanting to use kcalutils."
LICENSE = "LGPL-2.1-or-later"

PV = "26.08.1"

RPM_NAME = "kcalutils-devel-26.08.1-1.1.aarch64.rpm"
RPM_HASH = "92e4f46d0d4c79753e845d601d1c92e24139ca77ae3d0522dc82389ceaea9154142dfe6a3820b3d3b41f9d369f8370739b7852b2a66bab3c9ac61ed96e2259bf"

RPROVIDES:${PN} += "cmake-KPim6CalendarUtils \
kcalutils-devel \
kcalutils5-devel"

RDEPENDS:${PN} += "cmake-KF6CalendarCore \
cmake-KF6Config \
cmake-KF6CoreAddons \
cmake-Qt6Widgets \
libKPim6CalendarUtils6"

inherit rpm
