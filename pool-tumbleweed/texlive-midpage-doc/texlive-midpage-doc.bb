SUMMARY = "Documentation for texlive-midpage"
DESCRIPTION = "This package includes the documentation for texlive-midpage"
LICENSE = "LPPL-1.0"

PV = "2026.226.1.1asvn77682"

RPM_NAME = "texlive-midpage-doc-2026.226.1.1asvn77682-61.2.noarch.rpm"
RPM_HASH = "7351e8609648141309eca95296d1e19772b197ee6942a7305b404888cd42b6a4da4bb3090e881fbc55e8540c6280c280287a1a61808d7582b3940cdf879834a5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-midpage-doc"

RDEPENDS:${PN} += ""

inherit rpm
