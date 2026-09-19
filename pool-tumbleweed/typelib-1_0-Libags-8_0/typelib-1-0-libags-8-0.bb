SUMMARY = "Introspection bindings for GSequencer's core libraries"
DESCRIPTION = "Advanced Gtk+ Sequencer is an audio sequencer application. \
This package provides the GObject Introspection bindings for Libags."
LICENSE = "AGPL-3.0-or-later & GPL-3.0-or-later & GFDL-1.3-only"

PV = "8.4.2"

RPM_NAME = "typelib-1_0-Libags-8_0-8.4.2-1.2.aarch64.rpm"
RPM_HASH = "d35d13db59edb43c4d33b2e6da90ae4f58e5babe5cb41396134b01cbb325d4bf2d64e0359da4a964fd5840fa97d575bbbc7c4c3444d90a0e521768aadd25deaf"

RPROVIDES:${PN} += "typelib-1-0-Libags-8-0 \
typelib-Ags \
typelib-AgsAudio \
typelib-AgsGui"

RDEPENDS:${PN} += "libags-audio.so.8 \
libags-gui.so.8 \
libags-server.so.8 \
libags-thread.so.8 \
libags.so.8 \
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
typelib-Gtk \
typelib-HarfBuzz \
typelib-Pango \
typelib-PangoCairo \
typelib-Soup \
typelib-cairo \
typelib-freetype2 \
typelib-libxml2"

inherit rpm
