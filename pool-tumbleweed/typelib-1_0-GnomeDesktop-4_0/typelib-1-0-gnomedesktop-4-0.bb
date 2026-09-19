SUMMARY = "Introspection bindings for the GNOME Desktop API library"
DESCRIPTION = "The libgnome-desktop library provides API shared by several applications \
on the desktop, but that cannot live in the platform for various \
reasons. \
 \
This package provides the GObject Introspection bindings for \
libgnome-desktop."
LICENSE = "LGPL-2.1-or-later"

PV = "44.5"

RPM_NAME = "typelib-1_0-GnomeDesktop-4_0-44.5-1.5.aarch64.rpm"
RPM_HASH = "cb2e8dc08d97916469e650658c6e92a1968e7a89d93d327f6a3e77d2984f46d20866569dfea97dddbf383fd55a9f4d2f67d9d0e3a75ec0aafe4e4f6d9b4e0a8f"

RPROVIDES:${PN} += "typelib-1-0-GnomeDesktop-4-0 \
typelib-GnomeDesktop"

RDEPENDS:${PN} += "libgnome-desktop-4.so.2 \
typelib-GDesktopEnums \
typelib-GLib \
typelib-GModule \
typelib-GObject \
typelib-GdkPixbuf \
typelib-Gio"

inherit rpm
