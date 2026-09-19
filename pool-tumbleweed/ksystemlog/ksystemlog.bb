SUMMARY = "System Log Viewer Tool"
DESCRIPTION = "This program is developed for use by beginner users, who do not know \
how to find information about their Linux system and how the log files \
are in their computer. But it is also designed for advanced users, who \
want to quickly see problems occurring on their server."
LICENSE = "GPL-2.0-only"

PV = "26.08.1"

RPM_NAME = "ksystemlog-26.08.1-1.1.aarch64.rpm"
RPM_HASH = "f805a00661d6ad2401d6204250749b0867e8c28d6b57ac037aa967c327865cc5d4eb4dd7425d669dcbcc3163bc39eb1c30d9049a91484b9dfb6fb8e12c501a3b"

RPROVIDES:${PN} += "ksystemlog \
ksystemlog5"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libKF6Archive.so.6 \
libKF6ColorScheme.so.6 \
libKF6Completion.so.6 \
libKF6ConfigCore.so.6 \
libKF6ConfigGui.so.6 \
libKF6ConfigWidgets.so.6 \
libKF6CoreAddons.so.6 \
libKF6Crash.so.6 \
libKF6I18n.so.6 \
libKF6ItemViews.so.6 \
libKF6KIOWidgets.so.6 \
libKF6TextWidgets.so.6 \
libKF6WidgetsAddons.so.6 \
libKF6XmlGui.so.6 \
libQt6Core.so.6 \
libQt6Gui.so.6 \
libQt6Network.so.6 \
libQt6PrintSupport.so.6 \
libQt6Widgets.so.6 \
libc.so.6 \
libstdc++.so.6 \
libsystemd.so.0"

inherit rpm
