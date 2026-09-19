SUMMARY = "KDE File Manager"
DESCRIPTION = "This package contains the libraries used by Dolphin and Konqueror."
LICENSE = "GPL-2.0-or-later"

PV = "26.08.1"

RPM_NAME = "dolphin-part-26.08.1-1.1.aarch64.rpm"
RPM_HASH = "b45e22e4587bd2e99e3fa0d6f0037ed7b740e54316b868ac52630b42f0b2980809a7ed32917b8e7d65a00a15158138fabd334080436538a9e804f03b4bd9eab3"

RPROVIDES:${PN} += "dolphin-part \
libdolphinprivate.so.6"

RDEPENDS:${PN} += "/sbin/ldconfig \
kf6-kio \
ld-linux-aarch64.so.1 \
libKF6Baloo.so.6 \
libKF6BalooWidgets.so.6 \
libKF6Codecs.so.6 \
libKF6ColorScheme.so.6 \
libKF6ConfigCore.so.6 \
libKF6ConfigGui.so.6 \
libKF6ConfigWidgets.so.6 \
libKF6CoreAddons.so.6 \
libKF6FileMetaData.so.3 \
libKF6GuiAddons.so.6 \
libKF6I18n.so.6 \
libKF6IconThemes.so.6 \
libKF6JobWidgets.so.6 \
libKF6KCMUtils.so.6 \
libKF6KCMUtilsCore.so.6 \
libKF6KIOCore.so.6 \
libKF6KIOFileWidgets.so.6 \
libKF6KIOGui.so.6 \
libKF6KIOWidgets.so.6 \
libKF6Parts.so.6 \
libKF6TextWidgets.so.6 \
libKF6WidgetsAddons.so.6 \
libKF6XmlGui.so.6 \
libQt6Core.so.6 \
libQt6DBus.so.6 \
libQt6Gui.so.6 \
libQt6Widgets.so.6 \
libc.so.6 \
libdolphinvcs.so.6 \
libm.so.6 \
libstdc++.so.6"

inherit rpm
