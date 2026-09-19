SUMMARY = "Documentation for texlive-jetbrainsmono-otf"
DESCRIPTION = "This package includes the documentation for texlive-jetbrainsmono-otf"
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.1svn77682"

RPM_NAME = "texlive-jetbrainsmono-otf-doc-2026.226.0.0.1svn77682-63.2.noarch.rpm"
RPM_HASH = "ee2a67fd8e39ba7db24b74d6bdd50e8ee874a10b9bff0f739985ea27c25dd2d040dd6dc53281de92db9fffdc9fa90d7c4ecaef91049ca80d60d2bb83bc1bacf5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-jetbrainsmono-otf-doc"

RDEPENDS:${PN} += ""

inherit rpm
