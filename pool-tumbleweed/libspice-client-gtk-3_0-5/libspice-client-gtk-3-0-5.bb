SUMMARY = "Gtk client and libraries for SPICE remote desktop servers"
DESCRIPTION = "A Gtk client and libraries for SPICE remote desktop servers, (Linux and Windows)"
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "0.43"

RPM_NAME = "libspice-client-gtk-3_0-5-0.43-1.1.aarch64.rpm"
RPM_HASH = "198073247b24554aa2f7a5d548ea88e5ace8bf5b3ae057fdecd48455dbc2b6b0ba4c9eae744c354b9473094d2c96893930b7698d0ea6f06e5d916edb7f6efebe"

RPROVIDES:${PN} += "libspice-client-gtk-3-0-5 \
libspice-client-gtk-3.0.so.5"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libX11.so.6 \
libc.so.6 \
libcairo.so.2 \
libepoxy.so.0 \
libgdk-3.so.0 \
libgdk-pixbuf-2.0.so.0 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgstreamer-1.0.so.0 \
libgstvideo-1.0.so.0 \
libgtk-3.so.0 \
libphodav-3.0.so.0 \
libspice-client-glib-2.0.so.8 \
libwayland-client.so.0 \
libwayland-server.so.0"

inherit rpm
