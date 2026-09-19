SUMMARY = "Notification Server"
DESCRIPTION = "A Gtk notification server for Pantheon desktop."
LICENSE = "GPL-3.0-or-later"

PV = "8.1.2"

RPM_NAME = "pantheon-notifications-8.1.2-1.5.aarch64.rpm"
RPM_HASH = "3c12d14b14b35abaff5c244461edda1ee6c32a0ab085c31c17ca707e13e6c372334b69f3b41bc12b4a8e8d73bfa0c1ba554f43a13a1d24bb1d2f5a5f392705b0"

RPROVIDES:${PN} += "elementary-notifications \
pantheon-notifications"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libX11.so.6 \
libadwaita-1.so.0 \
libc.so.6 \
libcanberra.so.0 \
libgdk-pixbuf-2.0.so.0 \
libgee-0.8.so.2 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgranite-7.so.7 \
libgtk-4.so.1 \
libwayland-client.so.0"

inherit rpm
