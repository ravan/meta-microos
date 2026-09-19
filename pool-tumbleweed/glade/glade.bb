SUMMARY = "User Interface Builder for GTK+ 3"
DESCRIPTION = "Glade is a RAD tool to develop user interfaces for the Gtk+ 3 toolkit \
and the GNOME desktop environment."
LICENSE = "GPL-2.0-or-later"

PV = "3.40.0"

RPM_NAME = "glade-3.40.0-4.11.aarch64.rpm"
RPM_HASH = "a6b8f3e234480c595b52d903d5d7a784ec064515e2f5801ad89dba27cab5a422e43285608c5a9fd775eb9f574ddb5a49c994be0547e713c079cb193e57baf828"

RPROVIDES:${PN} += "glade \
libgladegjs.so \
libgladegtk.so \
libgladepython.so"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libcairo.so.2 \
libgdk-3.so.0 \
libgdk-pixbuf-2.0.so.0 \
libgio-2.0.so.0 \
libgjs.so.0 \
libgladeui-2.so.13 \
libglib-2.0.so.0 \
libgmodule-2.0.so.0 \
libgobject-2.0.so.0 \
libgtk-3.so.0 \
libpango-1.0.so.0 \
libpython3.13.so.1.0"

inherit rpm
