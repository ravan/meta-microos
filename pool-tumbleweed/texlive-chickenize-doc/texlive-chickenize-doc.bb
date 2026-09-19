SUMMARY = "Documentation for texlive-chickenize"
DESCRIPTION = "This package includes the documentation for texlive-chickenize"
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.3svn57325"

RPM_NAME = "texlive-chickenize-doc-2026.226.0.0.3svn57325-60.2.noarch.rpm"
RPM_HASH = "6d5c94ab8f59b9d3d7d88adafa3379b1da37b097a6a9255d776197849e466d712d91f1a27085a7a6ce3f792402aee41ab5b26c3fa7ca5535cd8c30f23d52a990"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-chickenize-doc"

RDEPENDS:${PN} += ""

inherit rpm
