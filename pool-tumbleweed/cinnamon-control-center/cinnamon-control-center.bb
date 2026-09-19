SUMMARY = "Utilities to configure the Cinnamon desktop"
DESCRIPTION = "This package contains configuration applets for the Cinnamon \
desktop, allowing to set accessibility configuration, desktop \
fonts, keyboard and mouse properties, sound setup, desktop theme \
and background, user interface properties, screen resolution, and \
other Cinnamon parameters."
LICENSE = "GPL-2.0-only & GPL-3.0-or-later & MIT"

PV = "6.6.0"

RPM_NAME = "cinnamon-control-center-6.6.0-1.3.aarch64.rpm"
RPM_HASH = "d1466e6cb0c07565c3fdfbe55f5de76c6f65c8f933c68d6263e69b9c5ca11309f7e8f5886e75cbfe8274f043dd8f4d208574835bb35d7411ea82247c1e62cbdc"

RPROVIDES:${PN} += "cinnamon-control-center"

RDEPENDS:${PN} += "accountsservice \
adwaita-icon-theme \
cinnamon-control-center-common \
cinnamon-settings-daemon \
desktop-data \
gnome-online-accounts \
ld-linux-aarch64.so.1 \
libX11.so.6 \
libc.so.6 \
libcinnamon-control-center.so.1 \
libcinnamon-menu-3.so.0 \
libgdk-3.so.0 \
libgdk-pixbuf-2.0.so.0 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgtk-3.so.0 \
libnotify.so.4 \
libpango-1.0.so.0 \
polkit-gnome"

inherit rpm
