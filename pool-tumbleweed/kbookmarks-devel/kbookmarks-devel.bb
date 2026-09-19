SUMMARY = "Development files for kbookmarks, a XBEL format bookmark manipulation framework"
DESCRIPTION = "Development files for kbookmarks, a framework for accessing and \
manipulating bookmarks using the XBEL format"
LICENSE = "LGPL-2.1-or-later"

PV = "5.116.0"

RPM_NAME = "kbookmarks-devel-5.116.0-1.8.aarch64.rpm"
RPM_HASH = "ba4870be2276a3278ad81895e83b47c485ece624787a172dc19abb1386c255ddd02fec6f3081f6dd1f6146476ff86aafc93aa06c7d7cea316ffbf5c538766d0a"

RPROVIDES:${PN} += "cmake-KF5Bookmarks \
kbookmarks-devel"

RDEPENDS:${PN} += "cmake-KF5WidgetsAddons \
cmake-Qt5Widgets \
cmake-Qt5Xml \
libKF5Bookmarks5"

inherit rpm
