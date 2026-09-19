SUMMARY = "Graphical Git Client"
DESCRIPTION = "Graphical Git Client"
LICENSE = "GPL-3.0-only"

PV = "1.7.1"

RPM_NAME = "kommit-1.7.1-1.4.aarch64.rpm"
RPM_HASH = "8e7ba60f27c627dcfd92e39129e3a3abbcf3a249f6409a6697abd7eaa2114699b5b1aabc7760699e56712a7e2795c9d266c2584aab1a19365b20320cfcb59748"

RPROVIDES:${PN} += "kommit \
libkommit.so.0 \
libkommitdiff.so.0 \
libkommitgui.so.0 \
libkommitwidgets.so.0"

RDEPENDS:${PN} += "/sbin/ldconfig \
/usr/bin/sh \
ld-linux-aarch64.so.1 \
libKF6ConfigCore.so.6 \
libKF6ConfigGui.so.6 \
libKF6ConfigWidgets.so.6 \
libKF6CoreAddons.so.6 \
libKF6Crash.so.6 \
libKF6DBusAddons.so.6 \
libKF6I18n.so.6 \
libKF6KIOCore.so.6 \
libKF6KIOGui.so.6 \
libKF6KIOWidgets.so.6 \
libKF6Parts.so.6 \
libKF6SyntaxHighlighting.so.6 \
libKF6WidgetsAddons.so.6 \
libKF6XmlGui.so.6 \
libQt6Charts.so.6 \
libQt6Core.so.6 \
libQt6Gui.so.6 \
libQt6Network.so.6 \
libQt6Widgets.so.6 \
libc.so.6 \
libcrypto.so.3 \
libdolphinvcs.so.6 \
libgit2.so.1.9 \
libm.so.6 \
libstdc++.so.6"

inherit rpm
