SUMMARY = "CDDB library for KDE Applications"
DESCRIPTION = "The KDE Compact Disc DataBase library provides an API for applications to fetch \
and submit audio CD information over the Internet."
LICENSE = "GPL-2.0-or-later"

PV = "25.04.3"

RPM_NAME = "libkcddb-25.04.3-15.1.aarch64.rpm"
RPM_HASH = "86baa0abbef17fa951ccd77bed3ec13ebaf3a6217208dc71ce356e055c1a317100bd4efade73caac0f24207a15580b0620ce9b458a2c97df6932527696048ea9"

RPROVIDES:${PN} += "libkcddb \
libkcddb16 \
libkcddb5"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libKF5Cddb.so.5 \
libKF5ConfigCore.so.5 \
libKF5ConfigGui.so.5 \
libKF5ConfigWidgets.so.5 \
libKF5CoreAddons.so.5 \
libKF5I18n.so.5 \
libKF5KIOWidgets.so.5 \
libKF5WidgetsAddons.so.5 \
libQt5Core.so.5 \
libQt5Gui.so.5 \
libQt5Widgets.so.5 \
libc.so.6 \
libstdc++.so.6"

inherit rpm
