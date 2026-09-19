SUMMARY = "Extra Gtk# bindings"
DESCRIPTION = "Gtk# Beans aims to fill the gap between the current Gtk# packages state and all the blings and desktop integration stuffs anyone would want to use. \
 \
It builds on top of Gtk# and extend it by adding new classes and extension methods."
LICENSE = "LGPL-2.1-or-later"

PV = "2.14.1"

RPM_NAME = "gtk-sharp-beans-2.14.1-23.19.aarch64.rpm"
RPM_HASH = "f4d31b01ec19a060f4142411a56f0a56e2e821c17e740f61b041b24b7dfd99ec3ed45dae64547264379092c8bcffe2d1468efffc9f8519cdd25903a675798330"

RPROVIDES:${PN} += "gtk-sharp-beans \
mono-gtk-sharp-beans"

RDEPENDS:${PN} += "gio-sharp \
gtk-sharp2 \
mono-core \
mono-gdk-sharp \
mono-gio-sharp \
mono-glib-sharp \
mono-gtk-sharp \
mono-mscorlib"

inherit rpm
