SUMMARY = "CDDB library for KDE Applications"
DESCRIPTION = "The KDE Compact Disc DataBase library provides an API for applications to fetch \
and submit audio CD information over the Internet."
LICENSE = "GPL-2.0-or-later"

PV = "26.08.1"

RPM_NAME = "libkcddb-qt6-26.08.1-15.1.aarch64.rpm"
RPM_HASH = "8d82338cb8f51f60aa6492d83f325ff9f80cc0018936bf2be4bc0d3b532cac31ca365a20d1109ead658a9759af0b675f82f8162a6bbe2f5c58b6018e27dd52ba"

RPROVIDES:${PN} += "libkcddb-qt6"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libKCddb6.so.5 \
libKF6ConfigCore.so.6 \
libKF6ConfigGui.so.6 \
libKF6CoreAddons.so.6 \
libKF6I18n.so.6 \
libKF6KCMUtils.so.6 \
libKF6KCMUtilsCore.so.6 \
libKF6KIOWidgets.so.6 \
libKF6Solid.so.6 \
libKF6WidgetsAddons.so.6 \
libQt6Core.so.6 \
libQt6Gui.so.6 \
libQt6Widgets.so.6 \
libc.so.6 \
libstdc++.so.6"

inherit rpm
