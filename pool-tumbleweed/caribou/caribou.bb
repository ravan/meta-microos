SUMMARY = "On-screen Keyboard for GNOME"
DESCRIPTION = "Caribou is a text entry and UI navigation application being developed \
as an alternative to the Gnome On-screen Keyboard. The overarching goal \
for Caribou is to create a usable solution for people whose primary way \
of accessing a computer is a switch device."
LICENSE = "LGPL-2.1-or-later"

PV = "0.4.21"

RPM_NAME = "caribou-0.4.21-10.7.aarch64.rpm"
RPM_HASH = "bf2ad3780612011ee74a63063e564311bb24b69acaf90c3eaa367e2615b273a0d936623d7696019585e7e916b9a0546e4c81d482b2b8590785a4916a4932ead8"

RPROVIDES:${PN} += "caribou"

RDEPENDS:${PN} += "/usr/bin/sh \
libatspi.so.0 \
libc.so.6 \
libgdk-3.so.0 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
python-abi \
python3-atspi \
python3-xml \
typelib-Caribou \
typelib-Clutter \
typelib-GLib \
typelib-GObject \
typelib-Gdk \
typelib-Gio \
typelib-Gtk"

inherit rpm
