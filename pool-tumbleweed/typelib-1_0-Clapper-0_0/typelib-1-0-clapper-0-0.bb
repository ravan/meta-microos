SUMMARY = "Introspection bindings for libclapper-0_0-0"
DESCRIPTION = "A modern media player powered by GStreamer and built for the GNOME desktop environment. \
This subpackage provides the GObject Introspection bindings for \
libclapper-0_0-0."
LICENSE = "LGPL-2.1-or-later"

PV = "0.10.0"

RPM_NAME = "typelib-1_0-Clapper-0_0-0.10.0-1.4.aarch64.rpm"
RPM_HASH = "c8badae81f898ceb547627131826a43ed6bc0ed75ece71d8834c32cfabccef22fac71fd058e006a17d4737313726dae883384490a15950b72c551091c092a298"

RPROVIDES:${PN} += "typelib-1-0-Clapper-0-0 \
typelib-Clapper"

RDEPENDS:${PN} += "libclapper-0-0-0 \
libclapper-0.0.so.0 \
typelib-GLib \
typelib-GModule \
typelib-GObject \
typelib-Gio \
typelib-Gst \
typelib-GstAudio \
typelib-GstBase \
typelib-GstPbutils \
typelib-GstTag \
typelib-GstVideo"

inherit rpm
