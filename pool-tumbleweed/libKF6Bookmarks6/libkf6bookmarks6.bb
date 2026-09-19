SUMMARY = "Framework for manipulating bookmarks in XBEL format"
DESCRIPTION = "This is a framework for accessing and manipulating bookmarks using \
the XBEL format."
LICENSE = "LGPL-2.1-or-later"

PV = "6.30.0"

RPM_NAME = "libKF6Bookmarks6-6.30.0-1.1.aarch64.rpm"
RPM_HASH = "e821d0829fbf53dc55f0ea76e64d293a8204bea872019bea680bef56e6100ca4a236e57bb509edfbfa034d5074230ccfd14492156537b3345d8571bb52f52db7"

RPROVIDES:${PN} += "libKF6Bookmarks.so.6 \
libKF6Bookmarks6"

RDEPENDS:${PN} += "/sbin/ldconfig \
kf6-kbookmarks \
ld-linux-aarch64.so.1 \
libKF6ConfigCore.so.6 \
libKF6CoreAddons.so.6 \
libQt6Core.so.6 \
libQt6Gui.so.6 \
libQt6Xml.so.6 \
libc.so.6 \
libstdc++.so.6"

inherit rpm
