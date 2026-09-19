SUMMARY = "Plugins for Totem Movie Player"
DESCRIPTION = "Totem is a movie player for the GNOME desktop based on GStreamer. \
 \
This package includes plugins for Totem, to add advanced features."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "43.2+git402.b8d8108e0"

RPM_NAME = "totem-plugins-43.2+git402.b8d8108e0-2.3.aarch64.rpm"
RPM_HASH = "130e7c6156fd76d6f2b262a4e21284c1b584cb0a14397702e4625df746345c12100be7dcfd1ce4c28334dd01cd4126949a2ca0429ab3e68dfd126102e78cdeb7"

RPROVIDES:${PN} += "libautoload-subtitles.so \
libmovie-properties.so \
libmpris.so \
libopen-directory.so \
librecent.so \
librotation.so \
libsave-file.so \
libscreensaver.so \
libscreenshot.so \
libtotem-im-status.so \
libvariable-rate.so \
totem-plugins"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgdk-pixbuf-2.0.so.0 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgtk-3.so.0 \
libhandy-1.so.0 \
libpeas-2.so.0 \
libportal-gtk3.so.1 \
libportal.so.1 \
libtotem.so.0 \
totem \
typelib-GLib \
typelib-GObject \
typelib-Gdk \
typelib-Gio \
typelib-Gtk \
typelib-Pango \
typelib-Totem"

inherit rpm
