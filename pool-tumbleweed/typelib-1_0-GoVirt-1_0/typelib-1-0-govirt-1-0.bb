SUMMARY = "Introspection bindings for the GObject-based oVirt bindings"
DESCRIPTION = "GoVirt is a GObject wrapper for the oVirt REST API [1]. It will \
only provide very basic functionality as the goal is to \
autogenerate a full wrapper as it is already done for the python \
bindings."
LICENSE = "LGPL-2.1-or-later"

PV = "0.3.11"

RPM_NAME = "typelib-1_0-GoVirt-1_0-0.3.11-1.3.aarch64.rpm"
RPM_HASH = "092688d77d80b3b9f6957b9774fc30a51e1411048c31ff06392057917035fa64d8607ec75c80e9b96a613488a477e813d7c0b094a796b3f982e2398a505d87db"

RPROVIDES:${PN} += "typelib-1-0-GoVirt-1-0 \
typelib-GoVirt"

RDEPENDS:${PN} += "libgovirt.so.2 \
typelib-GLib \
typelib-GModule \
typelib-GObject \
typelib-Gio \
typelib-Rest \
typelib-Soup"

inherit rpm
