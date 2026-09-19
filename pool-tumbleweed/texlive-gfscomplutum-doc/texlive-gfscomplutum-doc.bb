SUMMARY = "Documentation for texlive-gfscomplutum"
DESCRIPTION = "This package includes the documentation for texlive-gfscomplutum"
LICENSE = "OFL-1.1"

PV = "2026.226.1.0svn77682"

RPM_NAME = "texlive-gfscomplutum-doc-2026.226.1.0svn77682-60.2.noarch.rpm"
RPM_HASH = "106e7a94a5bef81118d991abe2a452f5908e39cdf017cc0cd23e2ba6cea4a49cec483dd642e6feb7dcf1c5d1b2416cee5cef3000637dc84314fe75274018dbd7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-gfscomplutum-doc"

RDEPENDS:${PN} += ""

inherit rpm
