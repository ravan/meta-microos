SUMMARY = "On-screen Keyboard for GNOME -- GTK+ 3 Module"
DESCRIPTION = "Caribou is a text entry and UI navigation application being developed \
as an alternative to the Gnome On-screen Keyboard. The overarching goal \
for Caribou is to create a usable solution for people whose primary way \
of accessing a computer is a switch device."
LICENSE = "LGPL-2.1-or-later"

PV = "0.4.21"

RPM_NAME = "caribou-gtk3-module-0.4.21-10.7.aarch64.rpm"
RPM_HASH = "1238dcb7f107ab8a80d2facb599b36d9d36609499513547dfb47af257288e078841e7dee07157626e0155543ac31942e48f11c8bf48de6a168afeeeabbaa678e"

RPROVIDES:${PN} += "caribou-gtk3-module \
libcaribou-gtk-module.so"

RDEPENDS:${PN} += "caribou \
caribou-gtk-module-common \
libatk-1.0.so.0 \
libc.so.6 \
libgdk-3.so.0 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgtk-3.so.0"

inherit rpm
