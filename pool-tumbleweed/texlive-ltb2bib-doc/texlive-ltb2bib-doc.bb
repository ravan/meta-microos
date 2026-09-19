SUMMARY = "Documentation for texlive-ltb2bib"
DESCRIPTION = "This package includes the documentation for texlive-ltb2bib"
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.01svn43746"

RPM_NAME = "texlive-ltb2bib-doc-2026.226.0.0.01svn43746-59.2.noarch.rpm"
RPM_HASH = "30d86c6b92b935f6ab7f1d6c8af07d3cb1e60f68dda545bb13048e2cbe3a7e3a48581c687b7d88b1d8845a4a27b6129ff2fbe83d3fbd344fb7ec66dea856639e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-ltb2bib-doc"

RDEPENDS:${PN} += ""

inherit rpm
