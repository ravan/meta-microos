SUMMARY = "Spain datum grids for Proj"
DESCRIPTION = "Spain datum grids for Proj."
LICENSE = "BSD-2-Clause & CC0-1.0 & CC-BY-4.0 & CC-BY-SA-4.0 & SUSE-Public-Domain"

PV = "9.8.1"

RPM_NAME = "proj-data-es-9.8.1-2.3.noarch.rpm"
RPM_HASH = "2880b3e33d839f8860ca0a7161d96f3d84304f420c4b9bac423ed907f5052efb5b916b64751dbba09ef6478f1d9c54739839e284fdc563ace9f495d480e1112c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "proj-data-es"

RDEPENDS:${PN} += ""

inherit rpm
