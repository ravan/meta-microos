SUMMARY = "The Compose table for ibus-table"
DESCRIPTION = "ibus-table-compose provides the Compose table for ibus-table."
LICENSE = "GPL-3.0-or-later"

PV = "1.3.21"

RPM_NAME = "ibus-table-compose-1.3.21-1.5.noarch.rpm"
RPM_HASH = "4c575788c35a0e3357ba3dc306b79c8d3b87caf82780ed50c2f96e88ae5c11270dfecfd68f053386b94445a608cd423e1d2106624c985c32ecea1b6e987b4120"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ibus-table-compose"

RDEPENDS:${PN} += "ibus-table"

inherit rpm
