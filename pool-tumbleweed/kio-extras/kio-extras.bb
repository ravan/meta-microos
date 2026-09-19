SUMMARY = "Additional KIO slaves for KDE applications"
DESCRIPTION = "Additional KIO-slaves for KDE applications."
LICENSE = "GPL-2.0-or-later"

PV = "26.08.1"

RPM_NAME = "kio-extras-26.08.1-1.1.aarch64.rpm"
RPM_HASH = "0db4daf887f984f4d4b57e441626e1fee27dc1564a9eeefcb36c077ace4c18949de4debb51426de7689be607ea6138802f4796f53b3e9585607c1ff67d1181e5"

RPROVIDES:${PN} += "kde-odf-thumbnail \
kfileaudiopreview \
kio-extras"

RDEPENDS:${PN} += "/sbin/ldconfig \
/usr/bin/perl \
/usr/bin/sh \
ld-linux-aarch64.so.1 \
libKDSoapWSDiscoveryClient.so.0 \
libKExiv2Qt6.so.0 \
libKF6Archive.so.6 \
libKF6ConfigCore.so.6 \
libKF6ConfigGui.so.6 \
libKF6CoreAddons.so.6 \
libKF6DBusAddons.so.6 \
libKF6DNSSD.so.6 \
libKF6I18n.so.6 \
libKF6KCMUtils.so.6 \
libKF6KCMUtilsCore.so.6 \
libKF6KIOCore.so.6 \
libKF6KIOGui.so.6 \
libKF6KIOWidgets.so.6 \
libKF6Notifications.so.6 \
libKF6Service.so.6 \
libKF6Solid.so.6 \
libKF6SyntaxHighlighting.so.6 \
libKF6WidgetsAddons.so.6 \
libOpenEXR-3-4.so.33 \
libPlasmaActivities.so.7 \
libPlasmaActivitiesStats.so.1 \
libQt6Core.so.6 \
libQt6DBus.so.6 \
libQt6Gui.so.6 \
libQt6Network.so.6 \
libQt6Sql.so.6 \
libQt6Svg.so.6 \
libQt6Widgets.so.6 \
libc.so.6 \
libgcc-s.so.1 \
libimobiledevice-1.0.so.6 \
libkdsoap-qt6.so.2 \
libkioarchive6.so.6 \
libmtp.so.9 \
libplist-2.0.so.4 \
libproxy.so.1 \
libsmbclient.so.0 \
libssh.so.4 \
libstdc++.so.6 \
libtag.so.2 \
libtirpc.so.3 \
qt6-sql-sqlite \
trash-kcm"

inherit rpm
