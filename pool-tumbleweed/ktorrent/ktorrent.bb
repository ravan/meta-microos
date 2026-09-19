SUMMARY = "KDE BitTorrent Client"
DESCRIPTION = "KTorrent is a BitTorrent application by KDE which allows you to download files \
using the BitTorrent protocol. It enables you to run multiple torrents at the \
same time and comes with extended features to make it a full-featured client \
for BitTorrent."
LICENSE = "GPL-2.0-or-later"

PV = "26.08.1"

RPM_NAME = "ktorrent-26.08.1-1.1.aarch64.rpm"
RPM_HASH = "eed74aafc27be78f784b389e3cc337287f836fc88a1be3dcaf3384f9a8cf359f48f40b410ec3e204a2e7164e98cc606839f39acf58d13fed4e72d5b9f2586602"

RPROVIDES:${PN} += "ktorrent \
libktcore.so.16"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libKF6Archive.so.6 \
libKF6Completion.so.6 \
libKF6ConfigCore.so.6 \
libKF6ConfigGui.so.6 \
libKF6ConfigWidgets.so.6 \
libKF6CoreAddons.so.6 \
libKF6Crash.so.6 \
libKF6DBusAddons.so.6 \
libKF6DNSSD.so.6 \
libKF6GlobalAccel.so.6 \
libKF6GuiAddons.so.6 \
libKF6I18n.so.6 \
libKF6IconThemes.so.6 \
libKF6KCMUtils.so.6 \
libKF6KIOCore.so.6 \
libKF6KIOFileWidgets.so.6 \
libKF6KIOGui.so.6 \
libKF6KIOWidgets.so.6 \
libKF6Notifications.so.6 \
libKF6NotifyConfig.so.6 \
libKF6Parts.so.6 \
libKF6Plotting.so.6 \
libKF6StatusNotifierItem.so.6 \
libKF6Syndication.so.6 \
libKF6TextWidgets.so.6 \
libKF6WidgetsAddons.so.6 \
libKF6WindowSystem.so.6 \
libKF6XmlGui.so.6 \
libKTorrent6.so.6 \
libQt6Core.so.6 \
libQt6Core5Compat.so.6 \
libQt6DBus.so.6 \
libQt6Gui.so.6 \
libQt6Multimedia.so.6 \
libQt6MultimediaWidgets.so.6 \
libQt6Network.so.6 \
libQt6WebEngineCore.so.6 \
libQt6WebEngineWidgets.so.6 \
libQt6Widgets.so.6 \
libQt6Xml.so.6 \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libmaxminddb.so.0 \
libstdc++.so.6 \
libtag.so.2"

inherit rpm
