SUMMARY = "Frontend for Cachegrind"
DESCRIPTION = "KCachegrind is a frontend for cachegrind."
LICENSE = "BSD-4-Clause & GPL-2.0-only & GFDL-1.2-only"

PV = "26.08.1"

RPM_NAME = "kcachegrind-26.08.1-1.1.aarch64.rpm"
RPM_HASH = "4b5675c63a717ac2afbe719730e9a74796fed43c741dd1f16e83ab62e8b52942798fba4c11950051f44cdab8a55a71cc100ad83c426df14614135ec398f3a50b"

RPROVIDES:${PN} += "kcachegrind"

RDEPENDS:${PN} += "/usr/bin/env \
/usr/bin/perl \
ld-linux-aarch64.so.1 \
libKF6Archive.so.6 \
libKF6ConfigCore.so.6 \
libKF6ConfigGui.so.6 \
libKF6ConfigWidgets.so.6 \
libKF6CoreAddons.so.6 \
libKF6DBusAddons.so.6 \
libKF6I18n.so.6 \
libKF6KIOCore.so.6 \
libKF6WidgetsAddons.so.6 \
libKF6XmlGui.so.6 \
libQt6Core.so.6 \
libQt6DBus.so.6 \
libQt6Gui.so.6 \
libQt6Widgets.so.6 \
libc.so.6 \
libm.so.6 \
libstdc++.so.6"

inherit rpm
