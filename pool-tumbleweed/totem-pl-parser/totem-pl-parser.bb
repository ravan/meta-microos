SUMMARY = "A GObject-based library to parse playlist formats"
DESCRIPTION = "totem-pl-parser is a GObject-based library to parse a host of \
playlist formats, to save them too."
LICENSE = "GPL-2.0-or-later & LGPL-2.0-or-later"

PV = "3.26.7"

RPM_NAME = "totem-pl-parser-3.26.7-1.4.aarch64.rpm"
RPM_HASH = "43e351c24b492a6f46c7d1e177c6766841d541373b2d64bb0dc74eca9260c8f3de411063bfe806e37a2b379dda029ee1ae26d2a6bc52eb3c7f64a9c05ce5ffca"

RPROVIDES:${PN} += "totem-pl-parser"

RDEPENDS:${PN} += ""

inherit rpm
