SUMMARY = "Introspection bindings for the HarfBuzz/GObject library"
DESCRIPTION = "HarfBuzz is an OpenType text shaping engine. \
This package provides the GObject Introspection bindings for HarfBuzz."
LICENSE = "MIT"

PV = "14.4.0"

RPM_NAME = "typelib-1_0-HarfBuzz-0_0-14.4.0-1.1.aarch64.rpm"
RPM_HASH = "9b1aaa1ef69a8bd5d6437f1bf6663c4f231c102872f6bff6cf24caa2d7dc8aa671fe690e31e3c00063efc3e919a899872a7755092cd88adea24008147ecfb70a"

RPROVIDES:${PN} += "typelib-1-0-HarfBuzz-0-0 \
typelib-HarfBuzz"

RDEPENDS:${PN} += "libharfbuzz-gobject.so.0 \
libharfbuzz.so.0 \
typelib-GLib \
typelib-GObject \
typelib-freetype2"

inherit rpm
