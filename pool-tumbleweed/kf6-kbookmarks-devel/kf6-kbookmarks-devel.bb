SUMMARY = "Development files for kbookmarks, a XBEL format bookmark manipulation framework"
DESCRIPTION = "Development files for kbookmarks, a framework for accessing and \
manipulating bookmarks using the XBEL format"
LICENSE = "LGPL-2.1-or-later"

PV = "6.30.0"

RPM_NAME = "kf6-kbookmarks-devel-6.30.0-1.1.aarch64.rpm"
RPM_HASH = "4f8d1a7323cc6b5eb3983311acdcbd55fdbe5cc4be338c86ced5b9b7a8591c55dd9dbe0d69011a052bbbe23a5e94515406054f863e66c55f428ba48575778898"

RPROVIDES:${PN} += "cmake-KF6Bookmarks \
kf6-kbookmarks-devel"

RDEPENDS:${PN} += "cmake-KF6WidgetsAddons \
cmake-Qt6Widgets \
cmake-Qt6Xml \
libKF6Bookmarks6 \
libKF6BookmarksWidgets6"

inherit rpm
