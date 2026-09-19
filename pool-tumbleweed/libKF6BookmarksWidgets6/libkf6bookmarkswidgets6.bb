SUMMARY = "Framework for manipulating bookmarks in XBEL format"
DESCRIPTION = "This is a framework for accessing and manipulating bookmarks using \
the XBEL format."
LICENSE = "LGPL-2.1-or-later"

PV = "6.30.0"

RPM_NAME = "libKF6BookmarksWidgets6-6.30.0-1.1.aarch64.rpm"
RPM_HASH = "124a8a4fe8d5a3a8f3bb056d416ad0e42d2bd979aa4609253bb1f1b6a6436d6066b5ccafefa105fa4ebb1a209084a5c82aade86246a6ad97863ad9e96c34779c"

RPROVIDES:${PN} += "libKF6BookmarksWidgets.so.6 \
libKF6BookmarksWidgets6"

RDEPENDS:${PN} += "/sbin/ldconfig \
kf6-kbookmarks \
ld-linux-aarch64.so.1 \
libKF6Bookmarks.so.6 \
libKF6ConfigCore.so.6 \
libKF6ConfigGui.so.6 \
libKF6WidgetsAddons.so.6 \
libQt6Core.so.6 \
libQt6Gui.so.6 \
libQt6Widgets.so.6 \
libQt6Xml.so.6 \
libc.so.6 \
libstdc++.so.6"

inherit rpm
