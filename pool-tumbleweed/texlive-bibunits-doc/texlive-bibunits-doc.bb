SUMMARY = "Documentation for texlive-bibunits"
DESCRIPTION = "This package includes the documentation for texlive-bibunits"
LICENSE = "LPPL-1.0"

PV = "2026.226.2.2svn77682"

RPM_NAME = "texlive-bibunits-doc-2026.226.2.2svn77682-61.2.noarch.rpm"
RPM_HASH = "c462e97d90503b6744c78c04fd69898a9f0f240ec9ed541ceb4060174a99cd3a5db2d61aabf699fcdb6c42855b9cfa980cf884ec660f00a09db3d31a3cb22f80"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-bibunits-doc"

RDEPENDS:${PN} += ""

inherit rpm
