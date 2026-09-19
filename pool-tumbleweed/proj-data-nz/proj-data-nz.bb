SUMMARY = "New Zealand datum grids for Proj"
DESCRIPTION = "New Zealand datum grids for Proj."
LICENSE = "BSD-2-Clause & CC0-1.0 & CC-BY-4.0 & CC-BY-SA-4.0 & SUSE-Public-Domain"

PV = "9.8.1"

RPM_NAME = "proj-data-nz-9.8.1-2.3.noarch.rpm"
RPM_HASH = "81bff9485dabf357b7fcca34fdfb11ec3d26f97aa3a53e0dc486ba05158e88f3ca1facdab1afe7f46b266490ec987b3309310b2f4b3717779bd2736dc6d55632"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "proj-data-nz"

RDEPENDS:${PN} += ""

inherit rpm
