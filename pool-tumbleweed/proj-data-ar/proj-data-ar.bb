SUMMARY = "Argentina datum grids for Proj"
DESCRIPTION = "Argentina datum grids for Proj."
LICENSE = "BSD-2-Clause & CC0-1.0 & CC-BY-4.0 & CC-BY-SA-4.0 & SUSE-Public-Domain"

PV = "9.8.1"

RPM_NAME = "proj-data-ar-9.8.1-2.3.noarch.rpm"
RPM_HASH = "599cef13539ee50e04ca4fecba34f055d18de568e88d5341a2773abd13d573bf9d5f6edf3045db807dfbcc117a03fa3630f66d8bbdc55740b3e4f69e4ae6abe7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "proj-data-ar"

RDEPENDS:${PN} += ""

inherit rpm
