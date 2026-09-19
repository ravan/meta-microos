SUMMARY = "Canada datum grids for Proj"
DESCRIPTION = "Canada datum grids for Proj."
LICENSE = "BSD-2-Clause & CC0-1.0 & CC-BY-4.0 & CC-BY-SA-4.0 & SUSE-Public-Domain"

PV = "9.8.1"

RPM_NAME = "proj-data-ca-9.8.1-2.3.noarch.rpm"
RPM_HASH = "d89cc0bc6588683cd43f0108401dcc39d271ca8b3c6de7ad48ddcda82b1d2796f9370aafe64b5f9089db69d5d2b290266e0acec7fa6ca76fb75694eb7e3b324d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "proj-data-ca"

RDEPENDS:${PN} += ""

inherit rpm
