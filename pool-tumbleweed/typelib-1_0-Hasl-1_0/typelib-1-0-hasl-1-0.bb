SUMMARY = "Typelib for hasl"
DESCRIPTION = "Typelib for hasl."
LICENSE = "LGPL-2.1-or-later"

PV = "0.5.0"

RPM_NAME = "typelib-1_0-Hasl-1_0-0.5.0-1.4.aarch64.rpm"
RPM_HASH = "6314c4d1fe3917db57205823f538f450c4cacd8de5fa47345cddea231cd549c14510461ba17c9bbd53cc0627bc55f5ba9d4bc8aa9ec8fa3326ac2cf5a3d6ff33"

RPROVIDES:${PN} += "typelib-1-0-Hasl-1-0 \
typelib-Hasl"

RDEPENDS:${PN} += "libhasl.so.0 \
typelib-GLib \
typelib-GObject"

inherit rpm
