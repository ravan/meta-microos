SUMMARY = "Documentation for texlive-blindtext"
DESCRIPTION = "This package includes the documentation for texlive-blindtext"
LICENSE = "LPPL-1.0"

PV = "2026.226.2.0svn77682"

RPM_NAME = "texlive-blindtext-doc-2026.226.2.0svn77682-59.2.noarch.rpm"
RPM_HASH = "1d264210a3309daba6ab10abb9b183a20b630e8a854d4fc21e0517fc6b0e3710daf9155e315ff124c713e6fb040c8a279137732f5bf1cbf06f060176ac78e420"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-blindtext-doc"

RDEPENDS:${PN} += ""

inherit rpm
