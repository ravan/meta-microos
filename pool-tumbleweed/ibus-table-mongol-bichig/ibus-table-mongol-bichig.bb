SUMMARY = "Mongol Bichig table for ibus-table"
DESCRIPTION = "ibus-table-mongol-bichig provides the Mongol Bichig table for ibus-table."
LICENSE = "GPL-3.0-or-later"

PV = "1.3.21"

RPM_NAME = "ibus-table-mongol-bichig-1.3.21-1.5.noarch.rpm"
RPM_HASH = "2c02dbd15422c1421970bcaa8e3edbdc17fc5013d4ead9409d66ed9b68a1f4989a1855de3acc297a1168b49f3966c4629f2e839fe3b4cc85293bea7484f996b1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ibus-table-mongol-bichig"

RDEPENDS:${PN} += "ibus-table"

inherit rpm
