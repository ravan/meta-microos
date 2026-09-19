SUMMARY = "KDE Character Selector"
DESCRIPTION = "KCharSelect is the KDE character selector tool."
LICENSE = "GPL-2.0-or-later"

PV = "26.08.1"

RPM_NAME = "kcharselect-26.08.1-1.1.aarch64.rpm"
RPM_HASH = "ff3ceab8cde97b062addbe2ecce4bcfc3786a123de2e06d4bed9352da0d276324e9ed3e6b08d69aaf061256450540be6ef5c329c0e37260b256d81a22f58ceb8"

RPROVIDES:${PN} += "kcharselect \
kcharselect5"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libKF6Bookmarks.so.6 \
libKF6BookmarksWidgets.so.6 \
libKF6ColorScheme.so.6 \
libKF6ConfigCore.so.6 \
libKF6ConfigGui.so.6 \
libKF6ConfigWidgets.so.6 \
libKF6CoreAddons.so.6 \
libKF6Crash.so.6 \
libKF6I18n.so.6 \
libKF6IconThemes.so.6 \
libKF6WidgetsAddons.so.6 \
libKF6XmlGui.so.6 \
libQt6Core.so.6 \
libQt6Gui.so.6 \
libQt6Widgets.so.6 \
libc.so.6 \
libstdc++.so.6"

inherit rpm
