SUMMARY = "MATE panel applet for software update notifications"
DESCRIPTION = "This is a MATE panel applet to notify when software updates are \
available. \
 \
The notification is displayed in two ways: \
  1) by changing the icon of the applet. \
  2) by sending a notification to the notification-daemon. \
 \
The information is obtained from PackageKit."
LICENSE = "GPL-2.0-or-later"

PV = "0.4.8"

RPM_NAME = "mate-applet-softupd-0.4.8-1.20.aarch64.rpm"
RPM_HASH = "aba1a5ca5ad9eb93e023380c0546f64d0cd2e8ba64a089970c1cb9233c365a299017ff2cf73b453b2483fc7b6508763eecd81dc0339eb8cbad18716b1635a158"

RPROVIDES:${PN} += "mate-applet-softupd"

RDEPENDS:${PN} += "PackageKit \
gnome-packagekit \
ld-linux-aarch64.so.1 \
libc.so.6 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgtk-3.so.0 \
libmate-panel-applet-4.so.1 \
libnotify.so.4 \
libpackagekit-glib2.so.18"

inherit rpm
