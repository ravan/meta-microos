SUMMARY = "Introspection bindings for pango, a library for text layout and rendering"
DESCRIPTION = "Pango is a library for layout and rendering of text, with an emphasis \
on internationalization. It can be used anywhere that text layout \
is needed. \
 \
Pango forms the core of text and font handling for GTK+. \
 \
This package provides the GObject Introspection bindings for Pango."
LICENSE = "LGPL-2.1-or-later"

PV = "1.58.2"

RPM_NAME = "typelib-1_0-Pango-1_0-1.58.2-1.1.aarch64.rpm"
RPM_HASH = "686e70b1018079cdab95558d502f7d32e55df0636faaf62bebfb1b3f1dd0df6ed4ee66d91a8b4c051ea703cca9ca9bc49c6094c7821be69fdbfe17d6d96c9107"

RPROVIDES:${PN} += "typelib-1-0-Pango-1-0 \
typelib-Pango \
typelib-PangoCairo \
typelib-PangoFT2 \
typelib-PangoFc \
typelib-PangoOT \
typelib-PangoXft"

RDEPENDS:${PN} += "libpango-1.0.so.0 \
libpangocairo-1.0.so.0 \
libpangoft2-1.0.so.0 \
libpangoxft-1.0.so.0 \
typelib-GLib \
typelib-GModule \
typelib-GObject \
typelib-Gio \
typelib-HarfBuzz \
typelib-cairo \
typelib-fontconfig \
typelib-freetype2 \
typelib-xft \
typelib-xlib"

inherit rpm
