SUMMARY = "Introspection bindings for the GNOME Developer Help program"
DESCRIPTION = "Devhelp is an API documentation browser for GTK+ and GNOME. \
 \
This package contains the gobject introspection based typelib library."
LICENSE = "GPL-3.0-or-later"

PV = "43.0"

RPM_NAME = "typelib-1_0-Devhelp-3_0-43.0-3.7.aarch64.rpm"
RPM_HASH = "e38b8c487a06f11b5786edf9ccd790a78c34ac511a1abfc9bce2fa1e48d73279e177863a119d62affdf04960c4689b6e0eae3d4f0a9d150f883717153fe7106b"

RPROVIDES:${PN} += "typelib-1-0-Devhelp-3-0 \
typelib-Devhelp"

RDEPENDS:${PN} += "libdevhelp-3.so.6 \
typelib-Atk \
typelib-GLib \
typelib-GModule \
typelib-GObject \
typelib-Gdk \
typelib-GdkPixbuf \
typelib-Gio \
typelib-Gtk \
typelib-HarfBuzz \
typelib-JavaScriptCore \
typelib-Pango \
typelib-Soup \
typelib-WebKit2 \
typelib-cairo \
typelib-freetype2 \
typelib-xlib"

inherit rpm
