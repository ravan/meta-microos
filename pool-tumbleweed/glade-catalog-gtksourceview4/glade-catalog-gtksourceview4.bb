SUMMARY = "GTK+ Source Editing Widget -- Catalog for Glade"
DESCRIPTION = "GtkSourceView is a text widget that extends GtkTextView, the standard \
GTK+ text widget. \
 \
It improves GtkTextView by implementing syntax highlighting and other \
features typical of a source editor. \
 \
This package provides a catalog for Glade, to allow the use the \
GtkSourceView widget in Glade."
LICENSE = "LGPL-2.1-or-later"

PV = "4.8.4"

RPM_NAME = "glade-catalog-gtksourceview4-4.8.4-3.1.aarch64.rpm"
RPM_HASH = "5707981e31440b0edcc9e0e0d603090b81fa56eb6d3df8863c0e952e4f7d02a538c11dbd400bb232c5aca0155e68e76a2f0794f6ee3030ce13feb5ef04d103ee"

RPROVIDES:${PN} += "glade-catalog-gtksourceview \
glade-catalog-gtksourceview4"

RDEPENDS:${PN} += "glade \
libgtksourceview-4-0"

inherit rpm
