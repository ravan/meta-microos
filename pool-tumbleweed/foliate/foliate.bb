SUMMARY = "A GTK eBook reader"
DESCRIPTION = "A GTK eBook viewer, built with GJS and Epub.js."
LICENSE = "GPL-3.0-only"

PV = "3.3.0"

RPM_NAME = "foliate-3.3.0-3.2.noarch.rpm"
RPM_HASH = "4c88033b7871e9fc71dea8d95fd743c54a6ed6d9497b726e78303d5f7b76e5ee860d204469c3168e6d755a1d8ed4d2b2636a87c800901cbdf95239676f03f4ed"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "foliate"

RDEPENDS:${PN} += "gjs \
typelib-Adw \
typelib-GLib \
typelib-GObject \
typelib-Gdk \
typelib-GdkPixbuf \
typelib-Gio \
typelib-Gtk \
typelib-Pango \
typelib-Tracker \
typelib-WebKit \
typelib-cairo"

inherit rpm
