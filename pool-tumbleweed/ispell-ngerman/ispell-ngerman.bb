SUMMARY = "New German ispell dictionary"
DESCRIPTION = "This package includes a ready German dictionary for ispell. A short \
usage description is given in /usr/share/doc/packages/ispell/README of \
the package ispell."
LICENSE = "BSD-3-Clause"

PV = "20161207"

RPM_NAME = "ispell-ngerman-20161207-6.1.aarch64.rpm"
RPM_HASH = "e8a81943814a9ce8066bdba9bd2ac55b25ba595eff424c57f096846febd581b71f6b739fda3b8ecc829ae1ef52547224c78d2247ad379e4f43ae864d6ded23c3"

RPROVIDES:${PN} += "ispell-dictionary \
ispell-ngerman \
locale-ispell-de;de-DE"

RDEPENDS:${PN} += "/usr/bin/perl"

inherit rpm
