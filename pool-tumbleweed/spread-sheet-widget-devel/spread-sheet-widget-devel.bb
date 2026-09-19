SUMMARY = "Header files for GNU Gtk+ Spread Sheet Widget library"
DESCRIPTION = "GNU Spread Sheet Widget is a library for Gtk+ which provides a widget \
for viewing and manipulating 2-dimensional tabular data in a manner \
similar to many popular spread sheet programs. \
 \
This subpackage contains the header files for the library."
LICENSE = "GPL-3.0-or-later"

PV = "0.10"

RPM_NAME = "spread-sheet-widget-devel-0.10-1.10.aarch64.rpm"
RPM_HASH = "f813c304b85a889023d21f0df02467da1aeb5fe3e109d85c6da120516fbfc3af327b6b4fe3ce26089bd2d03cbafaf84461e2ac46844ae5f9384d5b09682ec75f"

RPROVIDES:${PN} += "pkgconfig-spread-sheet-widget \
spread-sheet-widget-devel"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libspread-sheet-widget0 \
pkgconfig-glib-2.0 \
pkgconfig-gtk+-3.0"

inherit rpm
