SUMMARY = "Perf GUI for performance analysis"
DESCRIPTION = "Hotspot is a standalone GUI for performance data with an UI like KCachegrind \
around Linux perf."
LICENSE = "GPL-2.0-or-later"

PV = "1.6.0"

RPM_NAME = "hotspot-1.6.0-2.2.aarch64.rpm"
RPM_HASH = "41a4d6f3b7abf208750bb4e815e2ce4a61bd52cac925c1cfb7dc6a97b1ab399e17e3feea5d2354a0b5ea3edc77e8861447175dd422bc28cd37955b9dbc5f4bd0"

RPROVIDES:${PN} += "bundled-hotspot-PrefixTickLabels \
bundled-hotspot-perfparser \
hotspot"

RDEPENDS:${PN} += "binutils \
ld-linux-aarch64.so.1 \
libKF6Archive.so.6 \
libKF6ColorScheme.so.6 \
libKF6Completion.so.6 \
libKF6ConfigCore.so.6 \
libKF6ConfigWidgets.so.6 \
libKF6CoreAddons.so.6 \
libKF6I18n.so.6 \
libKF6KIOCore.so.6 \
libKF6KIOGui.so.6 \
libKF6KIOWidgets.so.6 \
libKF6Notifications.so.6 \
libKF6Parts.so.6 \
libKF6Solid.so.6 \
libKF6SyntaxHighlighting.so.6 \
libKF6ThreadWeaver.so.6 \
libKF6WidgetsAddons.so.6 \
libKF6XmlGui.so.6 \
libQt6Core.so.6 \
libQt6Gui.so.6 \
libQt6Network.so.6 \
libQt6Svg.so.6 \
libQt6Widgets.so.6 \
libc.so.6 \
libdebuginfod.so.1 \
libdw.so.1 \
libelf.so.1 \
libgcc-s.so.1 \
libkddockwidgets-qt6.so.3 \
libm.so.6 \
libqcustomplot-qt6.so.2 \
libstdc++.so.6 \
libzstd.so.1 \
perf \
pkexec"

inherit rpm
