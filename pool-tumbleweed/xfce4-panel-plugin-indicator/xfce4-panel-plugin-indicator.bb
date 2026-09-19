SUMMARY = "Plugin to display information from applications in the Xfce panel"
DESCRIPTION = "A small plugin to display information from various applications \
consistently in the Xfce panel as described in \
Ubuntu's MessagingMenu design specification."
LICENSE = "GPL-2.0-or-later"

PV = "2.4.1"

RPM_NAME = "xfce4-panel-plugin-indicator-2.4.1-1.17.aarch64.rpm"
RPM_HASH = "7af07bfc9c78ebe0aab0ad2f1062858637cd3dbd49b8de5cbcb3e8e27b7cdd91615be33722fba178a4199aa8a5e0bbbefde3d4ae2dfc93ec21ff929818dbf6aa"

RPROVIDES:${PN} += "ayatana-indicator-renderer \
libindicator-plugin.so \
xfce4-panel-plugin-indicator"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libayatana-ido3-0.4.so.0 \
libayatana-indicator3.so.7 \
libc.so.6 \
libgdk-3.so.0 \
libgdk-pixbuf-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgtk-3.so.0 \
libxfce4panel-2.0.so.4 \
libxfce4ui-2.so.0 \
libxfce4util.so.7 \
libxfconf-0.so.3 \
xfce4-panel"

inherit rpm
