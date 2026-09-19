SUMMARY = "South Africa datum grids for Proj"
DESCRIPTION = "South Africa datum grids for Proj."
LICENSE = "BSD-2-Clause & CC0-1.0 & CC-BY-4.0 & CC-BY-SA-4.0 & SUSE-Public-Domain"

PV = "9.8.1"

RPM_NAME = "proj-data-za-9.8.1-2.3.noarch.rpm"
RPM_HASH = "f960bae20ea4032a905096eafadd28f6d6b0299b9bc5ffebbebd58fe8e6e3c9d64df3635476417bbe3c1b03bf57807053b0cd3fa61ad2cc0791feb530f659f65"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "proj-data-za"

RDEPENDS:${PN} += ""

inherit rpm
