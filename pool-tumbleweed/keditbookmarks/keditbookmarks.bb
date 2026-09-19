SUMMARY = "KDE Bookmark Editor"
DESCRIPTION = "This is an editor to edit your KDE-wide bookmark set."
LICENSE = "GPL-2.0-only"

PV = "26.08.1"

RPM_NAME = "keditbookmarks-26.08.1-1.1.aarch64.rpm"
RPM_HASH = "c9f14c92b1a0798a062917701ddf5a93053c6bb96772cad93e21eceb2244b9af122cead9c772afb98a0bc28026335aab2fb467e54e58af0a75682e2df7a11ae3"

RPROVIDES:${PN} += "keditbookmarks \
libkbookmarkmodel-private.so.6"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libKF6Bookmarks.so.6 \
libKF6Codecs.so.6 \
libKF6Completion.so.6 \
libKF6ConfigCore.so.6 \
libKF6ConfigGui.so.6 \
libKF6ConfigWidgets.so.6 \
libKF6CoreAddons.so.6 \
libKF6Crash.so.6 \
libKF6I18n.so.6 \
libKF6IconWidgets.so.6 \
libKF6KIOCore.so.6 \
libKF6KIOGui.so.6 \
libKF6Parts.so.6 \
libKF6WidgetsAddons.so.6 \
libKF6WindowSystem.so.6 \
libKF6XmlGui.so.6 \
libQt6Core.so.6 \
libQt6DBus.so.6 \
libQt6Gui.so.6 \
libQt6Network.so.6 \
libQt6Widgets.so.6 \
libQt6Xml.so.6 \
libc.so.6 \
libstdc++.so.6"

inherit rpm
