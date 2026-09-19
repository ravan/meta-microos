SUMMARY = "GStreamer integration for Clutter -- Introspection bindings"
DESCRIPTION = "Clutter is an open source software library for creating fast, visually \
rich and animated graphical user interfaces. \
 \
Clutter GStreamer enables the use of GStreamer with Clutter. \
 \
This package provides the GObject Introspection bindings for Clutter \
GStreamer."
LICENSE = "LGPL-2.1-or-later"

PV = "3.0.27"

RPM_NAME = "typelib-1_0-ClutterGst-3_0-3.0.27-2.16.aarch64.rpm"
RPM_HASH = "1f4f6b4a2ebf9225f81a123e311000bfa0ed22330d925fd3873c6d073d1780d81c01398200c912ff5b96c9252d6e190aa92f3f0aff860382dcbcb6549ffa4abb"

RPROVIDES:${PN} += "typelib-1-0-ClutterGst-3-0 \
typelib-ClutterGst"

RDEPENDS:${PN} += "libclutter-gst-3.0.so.0 \
typelib-Atk \
typelib-Clutter \
typelib-Cogl \
typelib-CoglPango \
typelib-GL \
typelib-GLib \
typelib-GModule \
typelib-GObject \
typelib-GdkPixbuf \
typelib-Gio \
typelib-Gst \
typelib-GstAudio \
typelib-GstBase \
typelib-GstPbutils \
typelib-GstVideo \
typelib-HarfBuzz \
typelib-Json \
typelib-Pango \
typelib-PangoCairo \
typelib-cairo \
typelib-freetype2"

inherit rpm
