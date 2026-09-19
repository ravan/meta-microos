SUMMARY = "Documentation for texlive-tablists"
DESCRIPTION = "This package includes the documentation for texlive-tablists"
LICENSE = "LPPL-1.0"

PV = "2026.227.0.0.0esvn15878"

RPM_NAME = "texlive-tablists-doc-2026.227.0.0.0esvn15878-62.2.noarch.rpm"
RPM_HASH = "f925ab9b268b11f07ea76479d744a09d0ce8386c30d7b0f13e0b9ee2544a6a721377e9282d68481c5ccc96108cca47574d89ead1ac4972fcb2133aa4404f817e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-tablists-doc"

RDEPENDS:${PN} += ""

inherit rpm
