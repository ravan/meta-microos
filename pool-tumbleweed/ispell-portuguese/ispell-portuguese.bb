SUMMARY = "Portuguese ispell dictionary"
DESCRIPTION = "This package includes a ready Portuguese dictionary for ispell. A \
short usage description for ispell is given in \
/usr/share/doc/packages/ispell/README of the package ispell. The \
sources for this dictionary are included in the package dicts."
LICENSE = "GPL-2.0-or-later"

PV = "1.5"

RPM_NAME = "ispell-portuguese-1.5-426.1.aarch64.rpm"
RPM_HASH = "3c90966272c7a40fb45b9c514a6d407bee2cee2fd8da1405358012fbd104ea391df8b2ba1512617335d84a6806147249cc5d8826a5ef2ab9493e7307d3eb56af"

RPROVIDES:${PN} += "iportug \
ispell-dictionary \
ispell-portuguese \
locale-ispell-pt;pt-PT"

RDEPENDS:${PN} += ""

inherit rpm
