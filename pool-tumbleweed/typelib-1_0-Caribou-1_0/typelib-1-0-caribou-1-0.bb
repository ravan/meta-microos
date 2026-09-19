SUMMARY = "On-screen Keyboard for GNOME -- Introspection bindings"
DESCRIPTION = "Caribou is a text entry and UI navigation application being developed \
as an alternative to the Gnome On-screen Keyboard. The overarching goal \
for Caribou is to create a usable solution for people whose primary way \
of accessing a computer is a switch device. \
 \
This package provides the GObject Introspection bindings for the caribou \
library."
LICENSE = "LGPL-2.1-or-later"

PV = "0.4.21"

RPM_NAME = "typelib-1_0-Caribou-1_0-0.4.21-10.7.aarch64.rpm"
RPM_HASH = "678989d11e16c247bd85eceeb88e37df8e73e25e4e90fb6962ec935c387420b08cc1385ad689dfcf48135da8c22e40f33ca2defc96a4ceed800a9f4de3862545"

RPROVIDES:${PN} += "typelib-1-0-Caribou-1-0 \
typelib-Caribou"

RDEPENDS:${PN} += "libcaribou.so.0 \
typelib-GLib \
typelib-GModule \
typelib-GObject \
typelib-Gdk \
typelib-GdkPixbuf \
typelib-Gio \
typelib-HarfBuzz \
typelib-Pango \
typelib-cairo \
typelib-freetype2"

inherit rpm
