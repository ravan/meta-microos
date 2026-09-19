SUMMARY = "MATE Desktop UPower policy management"
DESCRIPTION = "MATE Power Manager is a MATE session daemon that acts as a policy \
agent on top of UPower, which requires fairly new versions of the \
kernel and udev. MATE Power Manager listens for system events and \
responds with user-configurable actions."
LICENSE = "GPL-2.0-only"

PV = "1.28.1"

RPM_NAME = "mate-power-manager-1.28.1-3.6.aarch64.rpm"
RPM_HASH = "be2317ee7f162e83b1fc7035cfeb72aa63340a08808a7e89cfea28a68a3f5dbed41514f66d833aa375bd81ae4d78eab0018c714a3b993d643fef52efc5305c18"

RPROVIDES:${PN} += "mate-power-manager"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libX11.so.6 \
libXext.so.6 \
libXrandr.so.2 \
libc.so.6 \
libcairo.so.2 \
libcanberra-gtk3.so.0 \
libcanberra.so.0 \
libdbus-1.so.3 \
libdbus-glib-1.so.2 \
libgdk-3.so.0 \
libgdk-pixbuf-2.0.so.0 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgnome-keyring.so.0 \
libgobject-2.0.so.0 \
libgtk-3.so.0 \
libm.so.6 \
libmate-desktop-2.so.17 \
libmate-panel-applet-4.so.1 \
libnotify.so.4 \
libpango-1.0.so.0 \
libpangocairo-1.0.so.0 \
libsecret-1.so.0 \
libupower-glib.so.3 \
upower"

inherit rpm
