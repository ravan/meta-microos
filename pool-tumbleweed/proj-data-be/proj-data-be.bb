SUMMARY = "Belgium datum grids for Proj"
DESCRIPTION = "Belgium datum grids for Proj."
LICENSE = "BSD-2-Clause & CC0-1.0 & CC-BY-4.0 & CC-BY-SA-4.0 & SUSE-Public-Domain"

PV = "9.8.1"

RPM_NAME = "proj-data-be-9.8.1-2.3.noarch.rpm"
RPM_HASH = "08222b3fd6a7c2829fa4c9419f529c3d45e6190414b241b1d2329e59a1f7b53a5433391efd59a7064384d8840d5c89d808e64aca12e3db569fa9f596bfd7d295"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "proj-data-be"

RDEPENDS:${PN} += ""

inherit rpm
