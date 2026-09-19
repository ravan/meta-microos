SUMMARY = "Documentation for texlive-texnegar"
DESCRIPTION = "This package includes the documentation for texlive-texnegar"
LICENSE = "LPPL-1.0"

PV = "2026.227.0.0.1esvn76924"

RPM_NAME = "texlive-texnegar-doc-2026.227.0.0.1esvn76924-62.2.noarch.rpm"
RPM_HASH = "aea55ce9e2f89d3be4ed0e6854f54163c3402b81a0bf0c649d7ff5eb8b8aec967234eccd1c59dfe933527f72bc05561da0c9455ce6413c277fc5891559771030"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-texnegar-doc"

RDEPENDS:${PN} += ""

inherit rpm
