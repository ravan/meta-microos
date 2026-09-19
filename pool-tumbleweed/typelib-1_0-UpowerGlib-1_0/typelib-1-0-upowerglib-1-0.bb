SUMMARY = "Power Device Enumeration Framework - Introspection bindings"
DESCRIPTION = "UPower is an abstraction for enumerating power devices, listening to \
device events and querying history and statistics. Any application or \
service on the system can access the org.freedesktop.UPower service \
via the system message bus. Some operations (such as suspending the \
system) are restricted using PolicyKit. \
 \
This package provides the GObject Introspection bindings for \
libupower-glib."
LICENSE = "GPL-2.0-or-later"

PV = "1.91.3"

RPM_NAME = "typelib-1_0-UpowerGlib-1_0-1.91.3-1.2.aarch64.rpm"
RPM_HASH = "9793f480bb679633621a2fe27bdb7c473b898a2bc83da2d30b808f233ac1d32ebb7277d4992f896653d433c70e294f82a8879f480cbdb39c909167f84e064999"

RPROVIDES:${PN} += "typelib-1-0-UpowerGlib-1-0 \
typelib-UPowerGlib"

RDEPENDS:${PN} += "libupower-glib.so.3 \
typelib-GLib \
typelib-GModule \
typelib-GObject \
typelib-Gio"

inherit rpm
