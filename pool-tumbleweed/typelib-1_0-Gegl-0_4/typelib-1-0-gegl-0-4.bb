SUMMARY = "Introspection bindings for the GEGL 'Generic Graphics Library'"
DESCRIPTION = "GEGL provides infrastructure to do demand based cached non destructive \
image editing on larger than RAM buffers. Through babl, it provides \
support for a wide range of color models and pixel storage formats for \
input and output. \
 \
This package provides the GObject Introspection bindings for the \
libgegl library."
LICENSE = "GPL-3.0-or-later & LGPL-3.0-or-later"

PV = "0.4.72"

RPM_NAME = "typelib-1_0-Gegl-0_4-0.4.72-1.1.aarch64.rpm"
RPM_HASH = "bc6f8f0c60c4e7210f94d986f07d2d88da42033712a5c23646ae63608c8885d74119c66daa454ff2a232e6c071d5f71f246211d8d21584690cf957196229d98f"

RPROVIDES:${PN} += "typelib-1-0-Gegl-0-4 \
typelib-Gegl"

RDEPENDS:${PN} += "libgegl-0.4.so.0 \
typelib-Babl \
typelib-GLib \
typelib-GObject"

inherit rpm
