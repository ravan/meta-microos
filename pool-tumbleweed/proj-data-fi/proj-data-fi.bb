SUMMARY = "Finland datum grids for Proj"
DESCRIPTION = "Finland datum grids for Proj."
LICENSE = "BSD-2-Clause & CC0-1.0 & CC-BY-4.0 & CC-BY-SA-4.0 & SUSE-Public-Domain"

PV = "9.8.1"

RPM_NAME = "proj-data-fi-9.8.1-2.3.noarch.rpm"
RPM_HASH = "1f071f3988bb637f6e3f66cf836dfbab4619761cd5702ec5ffea532af83ee328e3f635bf0498a24c6863542a4314fbb039dd10a7828c545fce40022452366199"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "proj-data-fi"

RDEPENDS:${PN} += ""

inherit rpm
