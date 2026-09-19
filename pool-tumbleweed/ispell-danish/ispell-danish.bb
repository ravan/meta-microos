SUMMARY = "Danish ispell dictionary"
DESCRIPTION = "This package includes a ready Danish dictionary for ispell. A short \
usage description for ispell is given in \
/usr/share/doc/packages/ispell/README of the package ispell. The \
sources for this dictionary are included in the package dicts."
LICENSE = "GPL-2.0-or-later"

PV = "1.5"

RPM_NAME = "ispell-danish-1.5-426.1.aarch64.rpm"
RPM_HASH = "389dad71062fdb09a85cdc3fe707064b982450e72afa0b27d419eb0b0c39487214a8cd9771d92c797930517f9086a7c9edf497669db604ae6e23189a9333bcb6"

RPROVIDES:${PN} += "idanish \
ispell-danish \
ispell-dictionary \
locale-ispell-da"

RDEPENDS:${PN} += ""

inherit rpm
