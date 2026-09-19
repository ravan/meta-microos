SUMMARY = "PolicyKit Authorization Framework -- Introspection bindings"
DESCRIPTION = "PolicyKit is a toolkit for defining and handling authorizations. \
It is used for allowing unprivileged processes to speak to privileged \
processes. \
 \
This package provides the GObject Introspection bindings for PolicyKit."
LICENSE = "LGPL-2.1-or-later"

PV = "127"

RPM_NAME = "typelib-1_0-Polkit-1_0-127-7.2.aarch64.rpm"
RPM_HASH = "215b0f34bcbd6ffbb70436300cd65c0f513f58167f33a2c1d4ab739fe382b155088c1ab3ed68768b06d458582028fc17a7a3319c66f492cbcbb1790e2d48e40d"

RPROVIDES:${PN} += "typelib-1-0-Polkit-1-0 \
typelib-Polkit \
typelib-PolkitAgent"

RDEPENDS:${PN} += "libpolkit-agent-1.so.0 \
libpolkit-gobject-1.so.0 \
typelib-GLib \
typelib-GModule \
typelib-GObject \
typelib-Gio"

inherit rpm
