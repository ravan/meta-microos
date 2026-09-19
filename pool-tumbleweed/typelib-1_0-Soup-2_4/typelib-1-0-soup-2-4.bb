SUMMARY = "HTTP client/server library for GNOME -- Introspection bindings"
DESCRIPTION = "Libsoup is an HTTP client/server library for GNOME. It uses GObjects \
and the glib main loop, to integrate well with GNOME applications. \
 \
This package provides the GObject Introspection bindings for libsoup."
LICENSE = "LGPL-2.1-or-later"

PV = "2.74.3"

RPM_NAME = "typelib-1_0-Soup-2_4-2.74.3-22.1.aarch64.rpm"
RPM_HASH = "0df67edf3a88a5692c4083db71bbe6cf651dc3f4543f968429c8055d7a25df2fb9c15abff28b3507e0d9d4928b57dd0de667cf0c8ee8d19c326e536b9b105c5c"

RPROVIDES:${PN} += "typelib-1-0-Soup-2-4 \
typelib-Soup \
typelib-SoupGNOME"

RDEPENDS:${PN} += "libsoup-2.4.so.1 \
libsoup-gnome-2.4.so.1 \
typelib-GLib \
typelib-GModule \
typelib-GObject \
typelib-Gio"

inherit rpm
