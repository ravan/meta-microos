SUMMARY = "Netherlands datum grids for Proj"
DESCRIPTION = "Netherlands datum grids for Proj."
LICENSE = "BSD-2-Clause & CC0-1.0 & CC-BY-4.0 & CC-BY-SA-4.0 & SUSE-Public-Domain"

PV = "9.8.1"

RPM_NAME = "proj-data-nl-9.8.1-2.3.noarch.rpm"
RPM_HASH = "8516ddf4058086563f648785ac065e511139ab0c4ac6aa7ad56abe941fb2fa8815778961b89d3c9e963674cc8326acf07c316501d0e46b9cc8505e9a7093e308"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "proj-data-nl"

RDEPENDS:${PN} += ""

inherit rpm
