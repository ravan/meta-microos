SUMMARY = "A graphical IRC client by KDE"
DESCRIPTION = "Konversation is an Internet Relay Chat (IRC) client built on the \
KDE Platform. \
 \
Features: \
* SSL server support \
* Bookmarking support \
* Multiple servers and channels in one single window \
* DCC file transfer \
* Multiple identities for different servers \
* Text decorations and colors \
* OnScreen Display for notifications \
* Automatic UTF-8 detection \
* Per channel encoding support \
* Theme support for nick icons"
LICENSE = "GPL-2.0-or-later"

PV = "26.08.1"

RPM_NAME = "konversation-26.08.1-1.1.aarch64.rpm"
RPM_HASH = "b063325d3cce820cff3511b7e6abad45cdc4d59454e2a5f69bfdccce58aca7fc59fba644142deb6ec4bd704f8ce176ac5eae7b94ff375827da2b056a4ecacc92"

RPROVIDES:${PN} += "konversation"

RDEPENDS:${PN} += "/usr/bin/env \
ld-linux-aarch64.so.1 \
libKF6Archive.so.6 \
libKF6Bookmarks.so.6 \
libKF6BookmarksWidgets.so.6 \
libKF6Codecs.so.6 \
libKF6ColorScheme.so.6 \
libKF6Completion.so.6 \
libKF6ConfigCore.so.6 \
libKF6ConfigGui.so.6 \
libKF6ConfigWidgets.so.6 \
libKF6CoreAddons.so.6 \
libKF6Crash.so.6 \
libKF6DBusAddons.so.6 \
libKF6GlobalAccel.so.6 \
libKF6I18n.so.6 \
libKF6IdleTime.so.6 \
libKF6ItemViews.so.6 \
libKF6KIOCore.so.6 \
libKF6KIOFileWidgets.so.6 \
libKF6KIOGui.so.6 \
libKF6KIOWidgets.so.6 \
libKF6NewStuffWidgets.so.6 \
libKF6Notifications.so.6 \
libKF6NotifyConfig.so.6 \
libKF6Parts.so.6 \
libKF6StatusNotifierItem.so.6 \
libKF6TextWidgets.so.6 \
libKF6Wallet.so.6 \
libKF6WidgetsAddons.so.6 \
libKF6WindowSystem.so.6 \
libKF6XmlGui.so.6 \
libQt6Core.so.6 \
libQt6Core5Compat.so.6 \
libQt6DBus.so.6 \
libQt6Gui.so.6 \
libQt6Multimedia.so.6 \
libQt6Network.so.6 \
libQt6Widgets.so.6 \
libQt6Xml.so.6 \
libc.so.6 \
libm.so.6 \
libqca-qt6.so.2 \
libstdc++.so.6"

inherit rpm
