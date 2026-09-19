SUMMARY = "A file manager for the GNOME desktop environment"
DESCRIPTION = "GNOME Commander is a 'two-pane' graphical file manager for the Linux \
desktop using GNOME libraries. In addition to basic file manager \
functions, the program is also an FTP client and can browse SMB \
networks."
LICENSE = "GPL-2.0-or-later"

PV = "2.0.3"

RPM_NAME = "gnome-commander-2.0.3-1.3.aarch64.rpm"
RPM_HASH = "4218b6703cea72e10fff90adc6cd22df9cea625f221c1fc02cfadb7760db23e60b0b04be7de296ba7969bba907606ab7bebf35989db391f5f55dd2df416acc04"

RPROVIDES:${PN} += "gnome-commander \
gnome-commander-doc \
libexiv2plugin.so \
libfilerollerplugin.so \
libgcmd.so \
libgsfplugin.so \
libpopplerplugin.so \
libtaglibplugin.so \
libtestplugin.so \
typelib-GnomeCmd"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libcairo.so.2 \
libexiv2.so.28 \
libgcc-s.so.1 \
libgdk-pixbuf-2.0.so.0 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgmodule-2.0.so.0 \
libgobject-2.0.so.0 \
libgraphene-1.0.so.0 \
libgsf-1.so.114 \
libgtk-4.so.1 \
libm.so.6 \
libpango-1.0.so.0 \
libpoppler-glib.so.8 \
libstdc++.so.6 \
libtag.so.2 \
libvte-2.91-gtk4.so.0 \
typelib-GLib \
typelib-GModule \
typelib-GObject \
typelib-Gdk \
typelib-GdkPixbuf \
typelib-Gio \
typelib-Graphene \
typelib-Gsk \
typelib-Gtk \
typelib-HarfBuzz \
typelib-Pango \
typelib-PangoCairo \
typelib-cairo \
typelib-freetype2"

inherit rpm
