SUMMARY = "Graphics application for digital painters"
DESCRIPTION = "MyPaint is a graphics application for digital painters. It supports \
graphics tablets made by Wacom, and many similar devices. The \
standard brushes can emulate traditional media like charcoal, \
pencils, ink, or paint."
LICENSE = "GPL-2.0-or-later"

PV = "2.0.1"

RPM_NAME = "mypaint-2.0.1-6.5.aarch64.rpm"
RPM_HASH = "4827f7f1a3188cdffa214e314f84e80a346222d8dfcd69438b41257d3a2ff6b25af594761cb280f46b5e9f992af921d9c7919600df42a68aa68ed3c7abc4ee9f"

RPROVIDES:${PN} += "mypaint"

RDEPENDS:${PN} += "/usr/bin/python3.13 \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libgdk-pixbuf-2.0.so.0 \
libgomp.so.1 \
liblcms2.so.2 \
libm.so.6 \
libmypaint.so.0 \
libpng16.so.16 \
libstdc++.so.6 \
mypaint-brushes \
python3-gobject-Gdk \
python3-numpy \
python3-pycairo \
typelib-GLib \
typelib-GObject \
typelib-Gdk \
typelib-GdkPixbuf \
typelib-Gio \
typelib-Gtk \
typelib-Pango \
typelib-PangoCairo"

inherit rpm
