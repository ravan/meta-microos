SUMMARY = "KDE Documentation Application"
DESCRIPTION = "Application to show KDE Applications' documentation."
LICENSE = "GPL-2.0-or-later"

PV = "26.08.1"

RPM_NAME = "khelpcenter-26.08.1-1.1.aarch64.rpm"
RPM_HASH = "20c6e67b08deb189b14bfcd4a05757dfa39ef9b18f08e7ad4ae2ef1497ef7bce876af22ef9fb261e0c263c623b54ac171c164056f06e1f288eb6bc9217b07182"

RPROVIDES:${PN} += "khelpcenter \
khelpcenter5 \
suse-help-viewer"

RDEPENDS:${PN} += "/sbin/ldconfig \
/usr/bin/python3 \
kf6-kdoctools \
ld-linux-aarch64.so.1 \
libKF6Archive.so.6 \
libKF6Bookmarks.so.6 \
libKF6BookmarksWidgets.so.6 \
libKF6Completion.so.6 \
libKF6ConfigCore.so.6 \
libKF6ConfigGui.so.6 \
libKF6ConfigWidgets.so.6 \
libKF6CoreAddons.so.6 \
libKF6DBusAddons.so.6 \
libKF6DocTools.so.6 \
libKF6I18n.so.6 \
libKF6KIOCore.so.6 \
libKF6KIOGui.so.6 \
libKF6Service.so.6 \
libKF6TextTemplate.so.6 \
libKF6WidgetsAddons.so.6 \
libKF6WindowSystem.so.6 \
libKF6XmlGui.so.6 \
libQt6Core.so.6 \
libQt6DBus.so.6 \
libQt6Gui.so.6 \
libQt6PrintSupport.so.6 \
libQt6WebEngineCore.so.6 \
libQt6WebEngineWidgets.so.6 \
libQt6Widgets.so.6 \
libQt6Xml.so.6 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6 \
libxapian.so.30 \
libxml2.so.16"

inherit rpm
