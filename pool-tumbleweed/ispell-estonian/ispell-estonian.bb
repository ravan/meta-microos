SUMMARY = "Estonian ispell dictionary"
DESCRIPTION = "This package includes a ready Estonian dictionary for ispell. A short \
usage description is given in /usr/share/doc/packages/ispell/README of \
the package ispell. The sources for this dictionary are included in \
the package dicts."
LICENSE = "LGPL-2.1-or-later"

PV = "1.5"

RPM_NAME = "ispell-estonian-1.5-426.1.aarch64.rpm"
RPM_HASH = "681c0f673efeb70911ccc0228b342ea62d8206cb563584086c6a24b5b857129e505d450a3bf28d8f514f16d2667a154685243f9200006e24712ac5f6188c3bbc"

RPROVIDES:${PN} += "ispell-dictionary \
ispell-estonian \
locale-ispell-et"

RDEPENDS:${PN} += ""

inherit rpm
