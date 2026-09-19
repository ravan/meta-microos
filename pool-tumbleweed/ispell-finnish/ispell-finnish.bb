SUMMARY = "Finnish ispell dictionary"
DESCRIPTION = "This package includes a ready Finnish dictionary for ispell. A short \
usage description is given in /usr/share/doc/packages/ispell/README of \
the package ispell. The sources for this dictionary are included in \
the package dicts."
LICENSE = "GPL-2.0-or-later"

PV = "1.5"

RPM_NAME = "ispell-finnish-1.5-426.1.aarch64.rpm"
RPM_HASH = "c803e2bef6caafaa64e2a220dd28d5532f3847eea2d41191e6eb17c961b50dc0ed0333d66034faea630b8a3c6f4934c9ac7df087b863b60b625d0fd6b5ce2569"

RPROVIDES:${PN} += "ispell-dictionary \
ispell-finnish \
locale-ispell-fi"

RDEPENDS:${PN} += ""

inherit rpm
