SUMMARY = "Documentation for GTKDataBox"
DESCRIPTION = "GtkDatabox is a widget for the Gtk+-3 library designed to display large \
amounts of numerical data fast and easy."
LICENSE = "LGPL-2.1-or-later"

PV = "1.0.0"

RPM_NAME = "gtkdatabox-gtk-doc-1.0.0-1.21.aarch64.rpm"
RPM_HASH = "ae6e0bf57d98e71eba3ad700ba92bf0c5730d0c410df8a846d4f26c5e5808fe8828fc097abaf7a4fa19daeaebf719c38fe7592af9df861bbdc19e93c62436225"

RPROVIDES:${PN} += "gtkdatabox-gtk-doc"

RDEPENDS:${PN} += ""

inherit rpm
