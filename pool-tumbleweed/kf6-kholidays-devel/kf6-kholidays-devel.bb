SUMMARY = "Development files for the KDE PIM Holiday API"
DESCRIPTION = "This package contains necessary include files and libraries needed \
to develop applications depending on the kholidays library"
LICENSE = "LGPL-2.1-or-later"

PV = "6.30.0"

RPM_NAME = "kf6-kholidays-devel-6.30.0-1.1.aarch64.rpm"
RPM_HASH = "0330b2d1bab072e5309fcc815c47ae39071be052d2c2f3a257ab72584fee80918749aea90fb1d3b48348223631203bd5d871e5f446be9a4a45632e66426140c2"

RPROVIDES:${PN} += "cmake-KF6Holidays \
kf6-kholidays-devel"

RDEPENDS:${PN} += "cmake-Qt6Core \
libKF6Holidays6"

inherit rpm
