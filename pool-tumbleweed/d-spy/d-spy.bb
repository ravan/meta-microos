SUMMARY = "A D-Bus explorer for GNOME"
DESCRIPTION = "D-Spy is a simple tool to explore D-Bus connections."
LICENSE = "GPL-3.0-or-later & LGPL-3.0-or-later"

PV = "50.0"

RPM_NAME = "d-spy-50.0-1.3.aarch64.rpm"
RPM_HASH = "c063c7e7b9cce64e2ca2378338fc6d5c959c6ff7485db0f6377ec0f28863d954794573b7b9b0b2b9de1827c76e8d09bf61b73bd447ecd576ec8bbbf5a37cb40c"

RPROVIDES:${PN} += "d-spy"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libadwaita-1.so.0 \
libc.so.6 \
libdex-1.so.1 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgtk-4.so.1"

inherit rpm
