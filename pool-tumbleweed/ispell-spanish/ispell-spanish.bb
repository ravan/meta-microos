SUMMARY = "Spanish ispell dictionary"
DESCRIPTION = "This package includes a ready Spanish dictionary for ispell. A short \
usage description for ispell is given in \
/usr/share/doc/packages/ispell/README of the package ispell. The \
sources for this dictionary are included in the package dicts."
LICENSE = "GPL-2.0-or-later"

PV = "1.5"

RPM_NAME = "ispell-spanish-1.5-426.1.aarch64.rpm"
RPM_HASH = "11a7d9e71e940fc194c9bea3cebe15bbd871bc64f81fa22da59cc13cd1c65161b7c27724720f3a602e1379cf0ff1f7ae1e473b4346d35e48c56b2ab3fb9120b1"

RPROVIDES:${PN} += "ispanish \
ispell-dictionary \
ispell-spanish \
locale-ispell-es;an-ES"

RDEPENDS:${PN} += ""

inherit rpm
