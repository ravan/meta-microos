SUMMARY = "Slovenian ispell dictionary"
DESCRIPTION = "This package includes a ready Slovenian dictionary for ispell. A short \
usage description is given in /usr/share/doc/packages/ispell/README of \
the package ispell. The sources for this dictionary are included in \
the package dicts."
LICENSE = "BSD-3-Clause & GPL-2.0-or-later"

PV = "1.5"

RPM_NAME = "ispell-slovene-1.5-426.1.aarch64.rpm"
RPM_HASH = "5d6871efdd6eee3b07bfbb730eb574d275a873b2d578691f76738473570b241cf280de7296c1af16306836c770e3f48fd24382a33b80f4916ca192f42a14845c"

RPROVIDES:${PN} += "islovene \
ispell-dictionary \
ispell-slovene \
locale-ispell-sl"

RDEPENDS:${PN} += ""

inherit rpm
