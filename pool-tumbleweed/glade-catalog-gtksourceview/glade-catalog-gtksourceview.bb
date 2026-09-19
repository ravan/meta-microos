SUMMARY = "Glade catalog for the GTK+ source editing widget"
DESCRIPTION = "GtkSourceView is a text widget that extends GtkTextView, the standard \
GTK+ text widget. \
 \
It improves GtkTextView by implementing syntax highlighting and other \
features typical of a source editor. \
 \
This package provides a catalog for Glade, to allow the use the \
GtkSourceView widget in Glade."
LICENSE = "LGPL-2.1-or-later"

PV = "3.24.11"

RPM_NAME = "glade-catalog-gtksourceview-3.24.11-6.8.aarch64.rpm"
RPM_HASH = "f8142b40c5988bdb5d8505f761b39bac0f499d67dddf784980cb8898dceddf022222e1ad07c9440f6e521b7f086b562f936d15d78af017dce0982273ff4df738"

RPROVIDES:${PN} += "glade-catalog-gtksourceview"

RDEPENDS:${PN} += "glade \
libgtksourceview-3-0-1"

inherit rpm
