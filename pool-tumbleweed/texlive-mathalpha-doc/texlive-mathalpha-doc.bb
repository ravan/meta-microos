SUMMARY = "Documentation for texlive-mathalpha"
DESCRIPTION = "This package includes the documentation for texlive-mathalpha"
LICENSE = "LPPL-1.0"

PV = "2026.226.1.145svn77682"

RPM_NAME = "texlive-mathalpha-doc-2026.226.1.145svn77682-59.2.noarch.rpm"
RPM_HASH = "c2cd12534bf99713c527e07c7b2c1a401fea8b398bba6588415540f8e230e939a2e49eacc7f0ac330e84711ef901c8ef2ffe6ac134bacd18b10423ca2b712298"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-mathalpha-doc"

RDEPENDS:${PN} += ""

inherit rpm
