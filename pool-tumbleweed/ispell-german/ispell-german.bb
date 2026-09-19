SUMMARY = "German ispell dictionary"
DESCRIPTION = "This package includes a ready German dictionary for ispell. A short \
usage description is given in /usr/share/doc/packages/ispell/README of \
the package ispell. The sources for this dictionary are included in \
the package dicts."
LICENSE = "BSD-3-Clause"

PV = "1.5"

RPM_NAME = "ispell-german-1.5-426.1.aarch64.rpm"
RPM_HASH = "5ec88d149fbde1a78d1bb8caae23533d1c9fef80d79326ef086ed986432d277b61caa3a0a2dd9fefc3998b7c5053c495ffb010a83664a7b20415c4ec308f66a3"

RPROVIDES:${PN} += "igerman \
ispell-dictionary \
ispell-german \
locale-ispell-de;de-DE"

RDEPENDS:${PN} += ""

inherit rpm
