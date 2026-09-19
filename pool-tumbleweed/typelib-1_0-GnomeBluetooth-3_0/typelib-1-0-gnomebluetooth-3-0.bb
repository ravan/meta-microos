SUMMARY = "Introspection bindings for the GNOME Bluetooth libraries"
DESCRIPTION = "A set of graphical utilities to setup, monitor and use Bluetooth devices. \
 \
This package provides the GObject Introspection bindings for the GNOME Bluetooth's \
libraries."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "47.2"

RPM_NAME = "typelib-1_0-GnomeBluetooth-3_0-47.2-1.3.aarch64.rpm"
RPM_HASH = "d775a8cb78bfef477c73f6c8675574bf986d2e90ec0ecd93df0943a844fe21c8ebc6acc7743e912ed928b08e5807d84a30806c5ac0be1b45173c2f46d3ac0325"

RPROVIDES:${PN} += "typelib-1-0-GnomeBluetooth-3-0 \
typelib-GnomeBluetooth"

RDEPENDS:${PN} += "libgnome-bluetooth-3.0.so.13 \
typelib-GLib \
typelib-GModule \
typelib-GObject \
typelib-Gio"

inherit rpm
