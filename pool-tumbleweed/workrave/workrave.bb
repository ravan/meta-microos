SUMMARY = "Recovery and prevention of Repetitive Strain Injury program"
DESCRIPTION = "Workrave is a program that assists in the recovery and prevention of Repetitive Strain Injury (RSI). The program frequently alerts you to take micro-pauses, rest breaks and restricts you to your daily limit."
LICENSE = "GPL-3.0-only"

PV = "1.10.54"

RPM_NAME = "workrave-1.10.54-1.10.aarch64.rpm"
RPM_HASH = "04063d1fa305b86cb2d0c5c4c50d3d7a937f6647c3662dcb8a2b91acfd18be45a9111185ccdf9e8c374f66e5ef81d9723cc30bf5a3f08d5bb03618bd9407fa68"

RPROVIDES:${PN} += "libworkrave-gtk4-private-1.0.so.0 \
libworkrave-private-1.0.so.0 \
typelib-Workrave \
workrave"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libX11.so.6 \
libXss.so.1 \
libXtst.so.6 \
libatkmm-1.6.so.1 \
libc.so.6 \
libcairo.so.2 \
libcairomm-1.0.so.1 \
libgcc-s.so.1 \
libgdk-3.so.0 \
libgdk-pixbuf-2.0.so.0 \
libgdkmm-3.0.so.1 \
libgio-2.0.so.0 \
libgiomm-2.4.so.1 \
libglib-2.0.so.0 \
libglibmm-2.4.so.1 \
libgobject-2.0.so.0 \
libgstreamer-1.0.so.0 \
libgtk-3.so.0 \
libgtk-4.so.1 \
libgtkmm-3.0.so.1 \
libpango-1.0.so.0 \
libpangocairo-1.0.so.0 \
libpangomm-1.4.so.1 \
libsigc-2.0.so.0 \
libstdc++.so.6 \
typelib-Atk \
typelib-Clutter \
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
typelib-St \
typelib-cairo \
typelib-freetype2 \
typelib-xlib"

inherit rpm
