SUMMARY = "Pango Integration, Introspection bindings for cogl"
DESCRIPTION = "Cogl is a library for using 3D graphics hardware to draw \
pretty pictures. \
 \
This package provides the GObject Introspection bindings for the Pango \
integration in Cogl."
LICENSE = "MIT"

PV = "1.22.8"

RPM_NAME = "typelib-1_0-CoglPango-2_0-1.22.8-3.7.aarch64.rpm"
RPM_HASH = "1b13b8d3de08d6fa701ff3ac14da5fb9d8bebe946b567dbf5bdd5b0085b26728e14f42521fc35e5a25eb1f4725b0674d286ba2384a5bd59770534f08c3378374"

RPROVIDES:${PN} += "typelib-1-0-CoglPango-2-0 \
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
