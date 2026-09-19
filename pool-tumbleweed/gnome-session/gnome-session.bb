SUMMARY = "Session Tools for the GNOME Desktop"
DESCRIPTION = "This package provides the basic session tools, like session management \
functionality, for the GNOME Desktop."
LICENSE = "GPL-2.0-or-later"

PV = "50.1"

RPM_NAME = "gnome-session-50.1-1.2.aarch64.rpm"
RPM_HASH = "b1cd6676e9b37f9be13748d14229a16e58032985b9814d6a90dd0da8edd9bbbda222a5d7fa134b1f59630817f23decc0d7b30a23279159c5045406a3e3ee0ec6"

RPROVIDES:${PN} += "gnome-session \
gnome-session-core \
gnome-session-default-session \
gnome-session-wayland"

RDEPENDS:${PN} += "dbus-service \
gnome-settings-daemon \
gsettings-desktop-schemas \
hicolor-icon-theme \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgnome-desktop-4.so.2 \
libgobject-2.0.so.0 \
libsystemd.so.0 \
xorg-x11-server-wayland"

inherit rpm
