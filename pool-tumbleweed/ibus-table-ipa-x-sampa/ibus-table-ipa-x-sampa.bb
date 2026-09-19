SUMMARY = "The ipa-x-sampa table for ibus-table"
DESCRIPTION = "ibus-table-ipa-x-sampa provides the ipa-x-sampa table for ibus-table."
LICENSE = "GPL-3.0-or-later"

PV = "1.3.21"

RPM_NAME = "ibus-table-ipa-x-sampa-1.3.21-1.5.noarch.rpm"
RPM_HASH = "092baf19255b0c5e43b7bf957e14254efb7a3d029111aa8c43bd7b07574d915269139dc82c47c3cc1d8c898fcef214646d95662774b8589614fb40ed86d1d3c6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ibus-table-ipa-x-sampa"

RDEPENDS:${PN} += "ibus-table"

inherit rpm
