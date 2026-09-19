SUMMARY = "Wallet Management Tool"
DESCRIPTION = "This application allows you to manage your KDE password wallet."
LICENSE = "GPL-2.0-or-later"

PV = "26.08.1"

RPM_NAME = "kwalletmanager-26.08.1-1.1.aarch64.rpm"
RPM_HASH = "658f780eb8ad8785374c98d4a050f5a6a14e6e9dfb58513253e0ad7d2b7d68aaafb1980e3ce8038891770174c6330f75abdbb2633ee2b4653ce25a495f01abdf"

RPROVIDES:${PN} += "kwalletmanager \
kwalletmanager5"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libKF6Archive.so.6 \
libKF6Codecs.so.6 \
libKF6ConfigCore.so.6 \
libKF6ConfigWidgets.so.6 \
libKF6CoreAddons.so.6 \
libKF6Crash.so.6 \
libKF6DBusAddons.so.6 \
libKF6I18n.so.6 \
libKF6ItemViews.so.6 \
libKF6KCMUtils.so.6 \
libKF6KCMUtilsCore.so.6 \
libKF6KIOCore.so.6 \
libKF6KIOGui.so.6 \
libKF6Service.so.6 \
libKF6StatusNotifierItem.so.6 \
libKF6Wallet.so.6 \
libKF6WidgetsAddons.so.6 \
libKF6WindowSystem.so.6 \
libKF6XmlGui.so.6 \
libQt6Core.so.6 \
libQt6DBus.so.6 \
libQt6Gui.so.6 \
libQt6Widgets.so.6 \
libQt6Xml.so.6 \
libc.so.6 \
libstdc++.so.6"

inherit rpm
