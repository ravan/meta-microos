SUMMARY = "Documentation for texlive-coseoul"
DESCRIPTION = "This package includes the documentation for texlive-coseoul"
LICENSE = "LPPL-1.0"

PV = "2026.226.1.1svn23862"

RPM_NAME = "texlive-coseoul-doc-2026.226.1.1svn23862-61.2.noarch.rpm"
RPM_HASH = "40bf982a0efb550632765bb8b13e449cb356df2ca1471314e2cebe1dfbfbf0c43b2f13eb9ba7d7605e78c9c010eeb29bd643ecbfe4eac54b3f03dfa1a0b6b2e3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-coseoul-doc"

RDEPENDS:${PN} += ""

inherit rpm
