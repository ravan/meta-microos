SUMMARY = "lean table for ibus-table"
DESCRIPTION = "ibus-table-lean provides abbreviations to enter mathematical symbols. All abbreviations start with a backslash (\\)."
LICENSE = "GPL-3.0-or-later"

PV = "1.3.21"

RPM_NAME = "ibus-table-lean-1.3.21-1.5.noarch.rpm"
RPM_HASH = "3a7d741abe9008988ece205c9a4b37229ebbfae4ed388901d4eb54c80766f5202e12778ec4a20f7ef7976d39d05e2c5c83fca962c4fb7cf465ae453bd4b28308"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ibus-table-lean"

RDEPENDS:${PN} += "ibus-table"

inherit rpm
