SUMMARY = "Example code for using the library"
DESCRIPTION = "GtkDatabox is a widget for the Gtk+-3 library designed to display large \
amounts of numerical data fast and easy. \
This package contains some example code for developing using GTKDataBox."
LICENSE = "LGPL-2.1-or-later"

PV = "1.0.0"

RPM_NAME = "gtkdatabox-devel-examples-1.0.0-1.21.aarch64.rpm"
RPM_HASH = "e5781e4ff5462606cfe27b55a6d21fa19ba3a7640f58fe61e1f774996234e586a7164b712b14971d21a274c5995c0f451e151ebde376c05403007f70cde74c98"

RPROVIDES:${PN} += "gtkdatabox-devel-examples"

RDEPENDS:${PN} += "gtkdatabox-devel"

inherit rpm
