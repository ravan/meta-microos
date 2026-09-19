SUMMARY = "Documentation for texlive-biblatex-archaeology"
DESCRIPTION = "This package includes the documentation for texlive-biblatex-archaeology"
LICENSE = "LPPL-1.0"

PV = "2026.226.2.2svn53281"

RPM_NAME = "texlive-biblatex-archaeology-doc-2026.226.2.2svn53281-61.2.noarch.rpm"
RPM_HASH = "8094e9f6f6a5fe3c94af8aa1252fd75bb068b1f36957c91b6e0c0a1300fa726faf3b40dea05a47ce31574bcf57070b1ce212b6b240f75e79a671d075eaa7ad43"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-biblatex-archaeology-doc"

RDEPENDS:${PN} += ""

inherit rpm
