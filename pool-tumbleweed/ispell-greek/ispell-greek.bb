SUMMARY = "Greek ispell dictionary"
DESCRIPTION = "This package includes a ready Greek dictionary for ispell. A short \
usage description is given in /usr/share/doc/packages/ispell/README of \
the package ispell. The sources for this dictionary are included in \
the package dicts."
LICENSE = "BSD-3-Clause & GPL-2.0-or-later"

PV = "1.5"

RPM_NAME = "ispell-greek-1.5-426.1.aarch64.rpm"
RPM_HASH = "df0a699d5ed12de36bfab8048af64ad3cf39084367320c2909bb4748d8d9fe1a260b423c1e6d70e849322c7145213d6d276f9eed932a24b7924233166aeb8115"

RPROVIDES:${PN} += "igreek \
ispell-dictionary \
ispell-greek \
locale-ispell-el"

RDEPENDS:${PN} += ""

inherit rpm
