SUMMARY = "Telex table for ibus-table"
DESCRIPTION = "ibus-table-telex provides the Vietnamese telex table for ibus-table."
LICENSE = "GPL-3.0-or-later"

PV = "1.3.21"

RPM_NAME = "ibus-table-telex-1.3.21-1.5.noarch.rpm"
RPM_HASH = "281545334928014756c62763a6429ae3a0a210219e8b56b3a738c19590af95c36db7f767f5b8bc9a2b11436c166f27ed74ca169ea32d87aecf78f3ddbdc77e62"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ibus-table-telex"

RDEPENDS:${PN} += "ibus-table"

inherit rpm
