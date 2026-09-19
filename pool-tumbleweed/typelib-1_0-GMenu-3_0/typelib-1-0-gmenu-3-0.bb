SUMMARY = "The GNOME Desktop Menu -- Introspection bindings"
DESCRIPTION = "The package contains an implementation of the draft 'Desktop Menu \
Specification' from freedesktop.org \
 \
This package provides the GObject Introspection bindings for the \
libgnome-menu library."
LICENSE = "LGPL-2.1-or-later"

PV = "3.38.1"

RPM_NAME = "typelib-1_0-GMenu-3_0-3.38.1-1.6.aarch64.rpm"
RPM_HASH = "3387718b587dc9af7c50f43413de633d273b349a077189456b73ae5256185553b8f3ffdf1025913b87c9228c6ddca6ce151d04bd3fc97a640f9be8359bb9ab8a"

RPROVIDES:${PN} += "typelib-1-0-GMenu-3-0 \
typelib-GMenu"

RDEPENDS:${PN} += "libgnome-menu-3.so.0 \
typelib-GLib \
typelib-GModule \
typelib-GObject \
typelib-Gio \
typelib-GioUnix"

inherit rpm
