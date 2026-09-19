SUMMARY = "GNOME service to access online accounts -- Introspection bindings"
DESCRIPTION = "gnome-online-accounts provides interfaces so applications and \
libraries in GNOME can access the user's online accounts. \
 \
This package provides the GObject Introspection bindings for the libgoa \
client library."
LICENSE = "LGPL-2.0-or-later"

PV = "3.58.1"

RPM_NAME = "typelib-1_0-Goa-1_0-3.58.1-1.3.aarch64.rpm"
RPM_HASH = "b2464075ff93abeb5fd334f5bf64bfec5c611ca3a155b9ca90cf91e386acd4866c084d560531486b66f03df022f328b1052bd16921b1a23a102c48c84b1ddceb"

RPROVIDES:${PN} += "typelib-1-0-Goa-1-0 \
typelib-Goa"

RDEPENDS:${PN} += "libgoa-1.0.so.0 \
typelib-GLib \
typelib-GModule \
typelib-GObject \
typelib-Gio"

inherit rpm
