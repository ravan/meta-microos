SUMMARY = "Documentation for texlive-libertinust1math"
DESCRIPTION = "This package includes the documentation for texlive-libertinust1math"
LICENSE = "OFL-1.1"

PV = "2026.226.2.0.6svn77682"

RPM_NAME = "texlive-libertinust1math-doc-2026.226.2.0.6svn77682-61.2.noarch.rpm"
RPM_HASH = "54ad43fa228ef7cbe925d03e433afc6f82dff6115b87ec8d5316860bf5c758b52e88692af304841d531205ce803993a6257fabc1dfb3f7bfd4e133194d82ee79"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-libertinust1math-doc"

RDEPENDS:${PN} += ""

inherit rpm
