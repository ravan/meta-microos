SUMMARY = "Development files for the GTK+ toolkit library v2"
DESCRIPTION = "GTK+ is a multi-platform toolkit for creating graphical user interfaces. \
Offering a complete set of widgets, GTK+ is suitable for projects \
ranging from small one-off projects to complete application suites. \
 \
This package contains the development files for GTK+ 2.x."
LICENSE = "LGPL-2.1-or-later"

PV = "2.24.33"

RPM_NAME = "gtk2-devel-2.24.33-18.7.aarch64.rpm"
RPM_HASH = "8d14ec93cba0f76a9a2eb6d5edcb7ae72478a23152aacc9593abd06cfc14b61e938fa16eb80530de7db68e5b9871501193450f6081d9af9183af868af48eee57"

RPROVIDES:${PN} += "gail-devel \
gtk2-devel \
gtk2-doc \
libferret.so \
pkgconfig-gail \
pkgconfig-gdk-2.0 \
pkgconfig-gdk-x11-2.0 \
pkgconfig-gtk+-2.0 \
pkgconfig-gtk+-unix-print-2.0 \
pkgconfig-gtk+-x11-2.0 \
rpm-macro-gtk2-immodule-post \
rpm-macro-gtk2-immodule-postun \
rpm-macro-gtk2-immodule-requires"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
/usr/bin/python3.13 \
ld-linux-aarch64.so.1 \
libatk-1.0.so.0 \
libc.so.6 \
libcairo.so.2 \
libgdk-pixbuf-2.0.so.0 \
libgdk-x11-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgtk-2-0-0 \
libgtk-x11-2.0.so.0 \
libm.so.6 \
libpango-1.0.so.0 \
libpangocairo-1.0.so.0 \
pkgconfig-atk \
pkgconfig-cairo \
pkgconfig-gdk-pixbuf-2.0 \
pkgconfig-gdk-x11-2.0 \
pkgconfig-gio-2.0 \
pkgconfig-gtk+-2.0 \
pkgconfig-gtk+-x11-2.0 \
pkgconfig-pango \
pkgconfig-pangocairo \
pkgconfig-pangoft2 \
python3-xml \
typelib-1-0-Gtk-2-0"

inherit rpm
