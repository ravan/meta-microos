SUMMARY = "KDE Find File Utility"
DESCRIPTION = "KFind allows you to search for directories and files."
LICENSE = "GPL-2.0-or-later"

PV = "26.08.1"

RPM_NAME = "kfind-26.08.1-1.1.aarch64.rpm"
RPM_HASH = "8d2612ed0a36f053334457b138d1da64509a75d98a52848fadadaf6349a7cc5d3ae713bd3c5a454d7bdcf90b9e1816a969ba9ecc91fc62fe1bf76871438ab34d"

RPROVIDES:${PN} += "kfind"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libKF6Archive.so.6 \
libKF6Completion.so.6 \
libKF6ConfigCore.so.6 \
libKF6ConfigWidgets.so.6 \
libKF6CoreAddons.so.6 \
libKF6Crash.so.6 \
libKF6FileMetaData.so.3 \
libKF6I18n.so.6 \
libKF6KIOCore.so.6 \
libKF6KIOGui.so.6 \
libKF6KIOWidgets.so.6 \
libKF6WidgetsAddons.so.6 \
libKF6XmlGui.so.6 \
libQt6Core.so.6 \
libQt6Core5Compat.so.6 \
libQt6Gui.so.6 \
libQt6Widgets.so.6 \
libc.so.6 \
libstdc++.so.6"

inherit rpm
