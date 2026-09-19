SUMMARY = "Rusle table for ibus-table"
DESCRIPTION = "ibus-table-rusle provides the Rusle table for ibus-table."
LICENSE = "GPL-3.0-or-later"

PV = "1.3.21"

RPM_NAME = "ibus-table-rusle-1.3.21-1.5.noarch.rpm"
RPM_HASH = "18427cf175e396146ab386ba98003779412f7a019049098cb09972c9dfa5663a48964280bf79b7caa16e3500198bed7b636d90a9b0e1b774e35722de660f3ef4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ibus-table-rusle"

RDEPENDS:${PN} += "ibus-table"

inherit rpm
