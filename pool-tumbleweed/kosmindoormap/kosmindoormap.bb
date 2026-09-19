SUMMARY = "OSM multi-floor indoor map renderer"
DESCRIPTION = "OSM multi-floor indoor map renderer."
LICENSE = "CC0-1.0 & LGPL-2.0-or-later"

PV = "26.08.1"

RPM_NAME = "kosmindoormap-26.08.1-1.1.aarch64.rpm"
RPM_HASH = "ab075256bacdc0b1692d26f8d1119f9a83f44cbc36d1e8c9054f2f92f46ee0bf3fe79452bb9e118e96f091c76e32a35d564464e0251b56960d4323eb97b3e793"

RPROVIDES:${PN} += "kosmindoormap"

RDEPENDS:${PN} += ""

inherit rpm
