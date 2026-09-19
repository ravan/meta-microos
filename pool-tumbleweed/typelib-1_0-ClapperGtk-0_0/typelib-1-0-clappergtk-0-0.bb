SUMMARY = "Introspection bindings for libclapper-gtk-0_0-0"
DESCRIPTION = "A modern media player powered by GStreamer and built for the GNOME desktop environment. \
This subpackage provides the GObject Introspection bindings for \
libclapper-gtk-0_0-0."
LICENSE = "LGPL-2.1-or-later"

PV = "0.10.0"

RPM_NAME = "typelib-1_0-ClapperGtk-0_0-0.10.0-1.4.aarch64.rpm"
RPM_HASH = "b38ab78422b828abbe823f2ba116cf16e89884354d478ceecd98096f5e3c9ab2523113ee590019fd1a44fbf1d9f40de37cf6e02b4cdf613cf393c723167819a8"

RPROVIDES:${PN} += "typelib-1-0-ClapperGtk-0-0 \
typelib-ClapperGtk"

RDEPENDS:${PN} += "libclapper-gtk-0-0-0 \
libclapper-gtk-0.0.so.0 \
typelib-Clapper \
typelib-GLib \
typelib-GModule \
typelib-GObject \
typelib-Gdk \
typelib-GdkPixbuf \
typelib-Gio \
typelib-Graphene \
typelib-Gsk \
typelib-Gst \
typelib-GstAudio \
typelib-GstBase \
typelib-GstPbutils \
typelib-GstTag \
typelib-GstVideo \
typelib-Gtk \
typelib-HarfBuzz \
typelib-Pango \
typelib-PangoCairo \
typelib-cairo \
typelib-freetype2"

inherit rpm
