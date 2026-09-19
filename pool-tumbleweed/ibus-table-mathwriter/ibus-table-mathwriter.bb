SUMMARY = "Mathematics symbols table for ibus-table"
DESCRIPTION = "The package contains table for writing Unicode mathematics symbols."
LICENSE = "GPL-3.0-or-later"

PV = "1.3.21"

RPM_NAME = "ibus-table-mathwriter-1.3.21-1.5.noarch.rpm"
RPM_HASH = "b41cde80b2d79453ae8bc6e72fcd066e9e1cf5bf65695b380eec93fcb21a4a818da52d1941fce4b014f872d7b36d414ee429119fc169a2eeb43cde222a8e3b90"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ibus-table-mathwriter"

RDEPENDS:${PN} += "ibus-table"

inherit rpm
