SUMMARY = "Static library for libdwarf"
DESCRIPTION = "Contains the static library of libdwarf. \
 \
libdwarf is a library of functions to provide read/write DWARF \
debugging records."
LICENSE = "LGPL-2.1-or-later"

PV = "2.3.2"

RPM_NAME = "libdwarf-devel-static-2.3.2-1.2.aarch64.rpm"
RPM_HASH = "79e2069b25e7f19959902c215b3275312cc0f25a0c6960cba7d40f277b43b8b22d87890e24b6605f987975c11bad052c429949e00c6282d6d41e5fd54d42f1ab"

RPROVIDES:${PN} += "libdwarf-devel-/usr/lib64/libdwarf.a \
libdwarf-devel-static"

RDEPENDS:${PN} += "libdwarf-devel"

inherit rpm
