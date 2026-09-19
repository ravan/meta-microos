SUMMARY = "Documentation for texlive-zhspacing"
DESCRIPTION = "This package includes the documentation for texlive-zhspacing"
LICENSE = "LPPL-1.0"

PV = "2026.226.svn41145"

RPM_NAME = "texlive-zhspacing-doc-2026.226.svn41145-59.4.noarch.rpm"
RPM_HASH = "932520647faca53961e0ca04fb430ce08d38aef0eef912af96762471563cd4666e59e74a561cbd521998049955d49ced4e12c8c9166144c01f6345c6625e5b75"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-zhspacing-doc"

RDEPENDS:${PN} += ""

inherit rpm
