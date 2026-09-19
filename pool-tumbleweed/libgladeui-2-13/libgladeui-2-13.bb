SUMMARY = "Core library of the GLADE User Interface Builder"
DESCRIPTION = "Glade is a RAD tool to develop user interfaces for the Gtk+ 3 toolkit \
and the GNOME desktop environment."
LICENSE = "GPL-2.0-or-later"

PV = "3.40.0"

RPM_NAME = "libgladeui-2-13-3.40.0-4.11.aarch64.rpm"
RPM_HASH = "eb72b93fa985e0c0e5bf24a4dcd306dff772606a690bb41d15aba4e2298975e37c66a7c0a483b063f3d0eda5140b47a445b66c392251efb33feb796f3f910357"

RPROVIDES:${PN} += "libgladeui-2-13 \
libgladeui-2.so.13"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libcairo.so.2 \
libgdk-3.so.0 \
libgdk-pixbuf-2.0.so.0 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgmodule-2.0.so.0 \
libgobject-2.0.so.0 \
libgtk-3.so.0 \
libm.so.6 \
libpango-1.0.so.0 \
libpangocairo-1.0.so.0 \
libxml2.so.16"

inherit rpm
