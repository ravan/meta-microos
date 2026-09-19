SUMMARY = "Perl binding for GooCanvas2 widget using Glib::Object::Introspection"
DESCRIPTION = "GooCanvas2 is a new canvas widget for use with Gtk3 that uses the Cairo 2d \
library for drawing. This is a simple and basic implementation of this \
wonderful Canvas widget. \
 \
For more informations see \
https://wiki.gnome.org/action/show/Projects/GooCanvas \
 \
For instructions, how to use GooCanvas2, please study the API reference at \
https://developer.gnome.org/goocanvas/unstable/ for now. A perl-specific \
documentation will perhaps come in later versions. But applying the C \
documentation should be no problem."
LICENSE = "GPL-1.0+ | Artistic-1.0"

PV = "0.06"

RPM_NAME = "perl-GooCanvas2-0.06-1.30.noarch.rpm"
RPM_HASH = "6d30c4c5f349088bafc374b5cffb3c8b54831912509420077dcc5fcc7629bfbbdc77ea82be323926f88cfa0b8cf0e8f5471af9f9b24b2ac2d5ee06ef07270779"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-GooCanvas2"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.44.0 \
perl-Gtk3"

inherit rpm
