SUMMARY = "The GNU Image Manipulation Program - python3 goject introspection plugins"
DESCRIPTION = "The GIMP is an image composition and editing program. GIMP offers \
many tools and filters, and provides a large image manipulation \
toolbox and scripting."
LICENSE = "GPL-3.0-or-later"

PV = "3.2.6"

RPM_NAME = "gimp-plugin-python3-3.2.6-1.1.aarch64.rpm"
RPM_HASH = "57de83bde7d00e0cd6d03c624d119e23b34138b2dd61531987e30e2ab902ed6c1819058f8d761cd4c75f6417d708c90dcc1f1d08a76b3afefa18fca1e443a27d"

RPROVIDES:${PN} += "gimp-3.0-plugin-python3 \
gimp-plugin-python3 \
gimp-plugins-python3"

RDEPENDS:${PN} += "/usr/bin/env \
gimp \
python3 \
python3-gobject \
typelib-Babl \
typelib-GLib \
typelib-GObject \
typelib-Gdk \
typelib-Gegl \
typelib-Gimp \
typelib-GimpUi \
typelib-Gio \
typelib-Gtk \
typelib-Pango"

inherit rpm
