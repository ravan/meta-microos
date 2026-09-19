SUMMARY = "GObject-introspection bindings for libfwupd"
DESCRIPTION = "fwupd is a daemon to allows session software to update device firmware on \
the local machine."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "2.1.7"

RPM_NAME = "typelib-1_0-Fwupd-2_0-2.1.7-2.1.aarch64.rpm"
RPM_HASH = "f860b432a186bb4c22e5423b22a3f4977384992ba1c5090202a20f6f7e9322f0bdae62abfbb207766f7b01e14b0d3c1bc73ae44a09f266763b0c697134da9435"

RPROVIDES:${PN} += "typelib-1-0-Fwupd-2-0 \
typelib-Fwupd"

RDEPENDS:${PN} += "libfwupd.so.3 \
typelib-GLib \
typelib-GModule \
typelib-GObject \
typelib-Gio"

inherit rpm
