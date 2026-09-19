SUMMARY = "Introspection bindings for the Clutter library"
DESCRIPTION = "Clutter is a library for creating fast, visually rich and animated \
graphical user interfaces. It uses OpenGL (or GLES) for rendering. \
 \
This package provides the GObject Introspection bindings for Clutter."
LICENSE = "LGPL-2.1-or-later"

PV = "1.26.4"

RPM_NAME = "typelib-1_0-Clutter-1_0-1.26.4-4.23.aarch64.rpm"
RPM_HASH = "83b8e1783d518cd9a6ebb37f44cb77f24c7e684bfa00a5de5d0d174b7175a491d9241083e1f6b329909f66bb207c9092c379fc82f0d646354ec85340c04cec27"

RPROVIDES:${PN} += "typelib-1-0-Clutter-1-0 \
typelib-Cally \
typelib-Clutter \
typelib-ClutterGdk \
typelib-ClutterX11"

RDEPENDS:${PN} += "libclutter-1.0.so.0 \
typelib-Atk \
typelib-Cogl \
typelib-CoglPango \
typelib-GL \
typelib-GLib \
typelib-GModule \
typelib-GObject \
typelib-Gdk \
typelib-GdkPixbuf \
typelib-Gio \
typelib-HarfBuzz \
typelib-Json \
typelib-Pango \
typelib-PangoCairo \
typelib-cairo \
typelib-freetype2 \
typelib-xlib"

inherit rpm
