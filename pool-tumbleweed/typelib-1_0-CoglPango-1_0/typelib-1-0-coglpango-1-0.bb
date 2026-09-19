SUMMARY = "Pango Integration, Introspection bindings for cogl"
DESCRIPTION = "Cogl is a library for using 3D graphics hardware to draw \
pretty pictures. \
 \
This package provides the GObject Introspection bindings for the Pango \
integration in Cogl."
LICENSE = "MIT"

PV = "1.22.8"

RPM_NAME = "typelib-1_0-CoglPango-1_0-1.22.8-3.7.aarch64.rpm"
RPM_HASH = "6877848b3efe095a41a59aa9b9c110d49a2cbce2cd0a6fdc02b1d26f99a9fbe6ac18a210fc4ac72d4fbf04345794e3fda1d331a1a1966c12d58fe71de5c84188"

RPROVIDES:${PN} += "typelib-1-0-CoglPango-1-0 \
typelib-CoglPango"

RDEPENDS:${PN} += "libcogl-pango.so.20 \
libcogl.so.20 \
typelib-Cogl \
typelib-GL \
typelib-GLib \
typelib-GModule \
typelib-GObject \
typelib-Gio \
typelib-HarfBuzz \
typelib-Pango \
typelib-PangoCairo \
typelib-cairo \
typelib-freetype2"

inherit rpm
