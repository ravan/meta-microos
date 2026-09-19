SUMMARY = "Personal task manager for GNOME"
DESCRIPTION = "A intuitive and powerful application to manage your personal tasks. \
It uses GNOME technologies and has complete integration with the \
GNOME desktop environment."
LICENSE = "GPL-3.0-or-later"

PV = "43.0.git.170"

RPM_NAME = "endeavour-43.0.git.170-1.3.aarch64.rpm"
RPM_HASH = "b6b8c2e6cddc6d1f8f18a7e2707f6fe2d0b60dd99f68f62f9006babd1bf19db5c3770feecca4071df8939f6f783e8d017ae9fbb43b1672104457218141a6af9a"

RPROVIDES:${PN} += "endeavour \
gnome-todo"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libadwaita-1.so.0 \
libc.so.6 \
libecal-2.0.so.3 \
libedataserver-1.2.so.27 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgoa-1.0.so.0 \
libgobject-2.0.so.0 \
libgtk-4.so.1 \
libical-glib.so.3"

inherit rpm
