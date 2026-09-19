SUMMARY = "Documentation for texlive-pas-tableur"
DESCRIPTION = "This package includes the documentation for texlive-pas-tableur"
LICENSE = "LPPL-1.0"

PV = "2026.226.2.06svn72283"

RPM_NAME = "texlive-pas-tableur-doc-2026.226.2.06svn72283-58.2.noarch.rpm"
RPM_HASH = "3c6f9275ff199119470679b17abdfb37541fcf7836f1cc7a996fdfb596c179fc0dbe813aeb9b9f79dd850d58b567a3d1679c6597ab34a1c69cc9700d4957d63e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-pas-tableur-doc"

RDEPENDS:${PN} += ""

inherit rpm
