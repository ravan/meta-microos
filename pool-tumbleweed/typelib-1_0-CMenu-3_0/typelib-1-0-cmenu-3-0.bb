SUMMARY = "Libcinnamon-menu API -- Introspection bindings"
DESCRIPTION = "cinnamon-menus is an implementation of the draft 'Desktop Menu \
Specification' from freedesktop.org. This package also contains \
the Cinnamon menu layout configuration files, .directory files and \
assorted menu related utility programs, Python bindings, and a \
simple menu editor. \
 \
This package provides the GObject Introspection bindings for \
cinnamon-menus."
LICENSE = "LGPL-2.1-or-later"

PV = "6.6.0"

RPM_NAME = "typelib-1_0-CMenu-3_0-6.6.0-1.4.aarch64.rpm"
RPM_HASH = "2d3f3e4d6d2f973bfe8217d2b782e6d5f84977f3ab544464e357c907b4e4ee0ca9d44ebf626097dd0c459b2d554f20b0152b318cc788de5681913cab4503ae4a"

RPROVIDES:${PN} += "typelib-1-0-CMenu-3-0 \
typelib-1-0-CinnamonMenu-3-0 \
typelib-CMenu"

RDEPENDS:${PN} += "libcinnamon-menu-3.so.0 \
typelib-GLib \
typelib-GModule \
typelib-GObject \
typelib-Gio"

inherit rpm
