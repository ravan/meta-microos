SUMMARY = "GTK+ and GNOME bindings for Mono (virtual package)"
DESCRIPTION = "Gtk# is a library that allows you to build fully native graphical GNOME \
applications using Mono. Gtk# is a binding to GTK+, the cross platform \
user interface toolkit used in GNOME. It includes bindings for Gtk, \
Atk, Pango, Gdk, libgnome, libgnomeui and libgnomecanvas.  (Virtual \
package which depends on all gtk-sharp2 subpackages)"
LICENSE = "LGPL-2.1-only"

PV = "2.12.45"

RPM_NAME = "gtk-sharp2-complete-2.12.45-6.3.aarch64.rpm"
RPM_HASH = "d9655b1fc069227bcd0e0ac434cb3483d53f440f2ba5fdd88decb78a6f1eb466a7bcd78b52b106283d3f9cc89fb5629cfc562eeed61c2bfbb144f42d1097e118"

RPROVIDES:${PN} += "gtk-sharp2-complete"

RDEPENDS:${PN} += "glade-sharp2 \
glib-sharp2 \
gtk-sharp2 \
gtk-sharp2-doc \
gtk-sharp2-gapi"

inherit rpm
