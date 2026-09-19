SUMMARY = "lean table for ibus-table"
DESCRIPTION = "ibus-table-hu_Hung_HU_traditional provides old Hungarian script for ibus-table."
LICENSE = "GPL-3.0-or-later"

PV = "1.3.21"

RPM_NAME = "ibus-table-hu_Hung_HU_traditional-1.3.21-1.5.noarch.rpm"
RPM_HASH = "b0e37a02a9a0354ea9733d623a58dc6810b5b5b4fea6b84b7913321cd26b6486ab891704437d6f22b4f31672c2ce4d49c63851cec0288aaf4d2ab5d85aa464be"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ibus-table-hu-Hung-HU-traditional"

RDEPENDS:${PN} += "ibus-table"

inherit rpm
