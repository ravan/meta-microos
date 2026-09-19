SUMMARY = "Switzerland datum grids for Proj"
DESCRIPTION = "Switzerland datum grids for Proj."
LICENSE = "BSD-2-Clause & CC0-1.0 & CC-BY-4.0 & CC-BY-SA-4.0 & SUSE-Public-Domain"

PV = "9.8.1"

RPM_NAME = "proj-data-ch-9.8.1-2.3.noarch.rpm"
RPM_HASH = "ce6c0f6ddf1519384f3449acb9928c73e1c4b784074e29567018be77e10e895db139069965595ffdafffe7a67f268e3454289739faf183b45e9187636912bef4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "proj-data-ch"

RDEPENDS:${PN} += ""

inherit rpm
