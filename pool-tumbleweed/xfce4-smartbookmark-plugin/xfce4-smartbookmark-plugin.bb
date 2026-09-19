SUMMARY = "Smart Bookmark Plugin for the Xfce Panel"
DESCRIPTION = "The Smartbookmark plugin follows the smart bookmark concept and allows users to \
send requests to websites through default browser."
LICENSE = "GPL-2.0-or-later"

PV = "0.6.0"

RPM_NAME = "xfce4-smartbookmark-plugin-0.6.0-1.4.aarch64.rpm"
RPM_HASH = "3c1d9ead85e6b31ad18c1a017381fe1f91381a0915ff9cb39822218c5b8609cafbb3137038a50504259dfc9166e477266879686b3ea56f7ebc4067129a1f2540"

RPROVIDES:${PN} += "libsmartbookmark.so \
xfce4-panel-plugin-smartbookmark \
xfce4-smartbookmark-plugin"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgdk-3.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgtk-3.so.0 \
libxfce4panel-2.0.so.4 \
libxfce4ui-2.so.0 \
libxfce4util.so.7 \
xfce4-panel"

inherit rpm
