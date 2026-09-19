SUMMARY = "Typelib for gplugin"
DESCRIPTION = "Typelib for gplugin."
LICENSE = "LGPL-2.0-or-later"

PV = "0.44.2"

RPM_NAME = "typelib-1_0-GPlugin-1_0-0.44.2-2.4.aarch64.rpm"
RPM_HASH = "f28c12fbaa8025e444d405752d0e3e6edbb0004757f6045643347dae7fce55c09919b20d1b4c698498552757b8db716bd5c36ddf50aec471a033677fcc6c2174"

RPROVIDES:${PN} += "typelib-1-0-GPlugin-1-0 \
typelib-GPlugin"

RDEPENDS:${PN} += "libgplugin.so.0 \
typelib-GLib \
typelib-GModule \
typelib-GObject \
typelib-Gio"

inherit rpm
