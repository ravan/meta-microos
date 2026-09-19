SUMMARY = "Sound Visualization library"
DESCRIPTION = "Libvisual is a library that acts as a middle layer between applications \
that need audio visualization and audio visualization plug-ins."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "0.4.0"

RPM_NAME = "libvisual-0_4-0-0.4.0-207.10.aarch64.rpm"
RPM_HASH = "35b89d10021bb3e2172a77fc6f634d380662a14c8f0ed8532cb02aaec47f04b14c13e0f9b6c27792b8303e0add03c17eca8fc93798776eb2861c9639ad2c234b"

RPROVIDES:${PN} += "libvisual-0-4-0 \
libvisual-0.4.so.0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libm.so.6"

inherit rpm
