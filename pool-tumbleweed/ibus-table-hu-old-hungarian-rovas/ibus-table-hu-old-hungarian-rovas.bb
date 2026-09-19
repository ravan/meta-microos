SUMMARY = "Hu old hungarian rovas table for ibus-table"
DESCRIPTION = "ibus-table-rusle provides the Hu old hungarian rovas table for ibus-table."
LICENSE = "GPL-3.0-or-later"

PV = "1.3.21"

RPM_NAME = "ibus-table-hu-old-hungarian-rovas-1.3.21-1.5.noarch.rpm"
RPM_HASH = "046a2bdf2d5cf4d2e2b80e5db725bf00d814e1455ebc3c482eecf99d0551df9b18625e3686722290010d8eee9e846013d4781f16649c6e919c9da69ec3f28f1e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ibus-table-hu-old-hungarian-rovas"

RDEPENDS:${PN} += "ibus-table"

inherit rpm
