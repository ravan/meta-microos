SUMMARY = "Norway datum grids for Proj"
DESCRIPTION = "Norway datum grids for Proj."
LICENSE = "BSD-2-Clause & CC0-1.0 & CC-BY-4.0 & CC-BY-SA-4.0 & SUSE-Public-Domain"

PV = "9.8.1"

RPM_NAME = "proj-data-no-9.8.1-2.3.noarch.rpm"
RPM_HASH = "af3cb5bdb542faf56b4af53c22484bdea6800b8194b27a5e807fc8983568ad582121fa5e2d4955644fef6296a61c1a32645b517bacea6d67963da97b21eff38b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "proj-data-no"

RDEPENDS:${PN} += ""

inherit rpm
