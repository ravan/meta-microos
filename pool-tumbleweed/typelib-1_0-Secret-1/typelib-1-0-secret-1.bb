SUMMARY = "Introspection bindings for the Secret Service API library"
DESCRIPTION = "libsecret is a library for storing and retrieving passwords and other \
secrets. It communicates with the 'Secret Service' using DBus. \
 \
This package provides the GObject Introspection bindings for libsecret."
LICENSE = "LGPL-2.1-or-later"

PV = "0.21.7"

RPM_NAME = "typelib-1_0-Secret-1-0.21.7-2.4.aarch64.rpm"
RPM_HASH = "02bd8f0cddf5693db3f99257bd2136ceb678ae03e8dd28113c4e5bf55eba8cb42dc1c54b06ab60f380aa93fea1ccb59f2b6f3616752555e6421bd25481b8b011"

RPROVIDES:${PN} += "typelib-1-0-Secret-1 \
typelib-Secret"

RDEPENDS:${PN} += "libsecret-1.so.0 \
typelib-GLib \
typelib-GModule \
typelib-GObject \
typelib-Gio"

inherit rpm
