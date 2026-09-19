SUMMARY = "Documentation for texlive-calcfrac"
DESCRIPTION = "This package includes the documentation for texlive-calcfrac"
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.2svn68684"

RPM_NAME = "texlive-calcfrac-doc-2026.226.0.0.2svn68684-59.2.noarch.rpm"
RPM_HASH = "17bc66ffcf52a23dcdb64d2df3a2a384722f10f923bf512c2eeb4b317ef458c5964a3bf98910a87ca47c26777f9cdcb47b44b5b863e343033755f37e421cdb02"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-texlive-calcfrac-doc-fr \
texlive-calcfrac-doc"

RDEPENDS:${PN} += ""

inherit rpm
