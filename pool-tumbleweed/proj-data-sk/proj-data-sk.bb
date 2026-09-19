SUMMARY = "Slovakia datum grids for Proj"
DESCRIPTION = "Slovakia datum grids for Proj."
LICENSE = "BSD-2-Clause & CC0-1.0 & CC-BY-4.0 & CC-BY-SA-4.0 & SUSE-Public-Domain"

PV = "9.8.1"

RPM_NAME = "proj-data-sk-9.8.1-2.3.noarch.rpm"
RPM_HASH = "9def38535aa8d5438cc41ace10d5443b4a108634899da5eebf4535fe7da4a71488d68284533c1954f5b7c3aae3350581a5bf9201c3f0bfcaf0a4b965156e71a8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "proj-data-sk"

RDEPENDS:${PN} += ""

inherit rpm
