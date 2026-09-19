SUMMARY = "KDE Framework for providing different actions given a string query"
DESCRIPTION = "Files needed for developing custom runners or frontends."
LICENSE = "LGPL-2.1-or-later"

PV = "6.30.0"

RPM_NAME = "kf6-krunner-devel-6.30.0-1.1.aarch64.rpm"
RPM_HASH = "12383d9462667fc58761d02ed16956e166b60fee1423b7217070c99f7603b66e4d8b474964a4bbb81a42144727e6edaa5850b995eef09a76886f43a7758da5d3"

RPROVIDES:${PN} += "cmake-KF6Runner \
kf6-krunner-devel"

RDEPENDS:${PN} += "cmake-KF6CoreAddons \
cmake-Qt6Core \
cmake-Qt6Gui \
libKF6Runner6"

inherit rpm
