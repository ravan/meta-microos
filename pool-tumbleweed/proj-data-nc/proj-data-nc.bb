SUMMARY = "New Caledonia datum grids for Proj"
DESCRIPTION = "New Caledonia datum grids for Proj."
LICENSE = "BSD-2-Clause & CC0-1.0 & CC-BY-4.0 & CC-BY-SA-4.0 & SUSE-Public-Domain"

PV = "9.8.1"

RPM_NAME = "proj-data-nc-9.8.1-2.3.noarch.rpm"
RPM_HASH = "dcd185660630b9b0471ce121d9ffef632b6540422c045fd5bcfa61f9a6191dd2423874f9e4dd286673c83b53f9b9e52e35344d813a87aa1b8fb03698d169cf64"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "proj-data-nc"

RDEPENDS:${PN} += ""

inherit rpm
