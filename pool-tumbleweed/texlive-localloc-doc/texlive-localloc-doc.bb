SUMMARY = "Documentation for texlive-localloc"
DESCRIPTION = "This package includes the documentation for texlive-localloc"
LICENSE = "LPPL-1.0"

PV = "2026.226.svn56496"

RPM_NAME = "texlive-localloc-doc-2026.226.svn56496-61.2.noarch.rpm"
RPM_HASH = "136cf97ac316721201e42e824cf83a86f96e223297f193a3536ce030b78b00543b809eed8500f6717f54b8be2ac922d05fe072414c221290adba89ceece22de9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-localloc-doc"

RDEPENDS:${PN} += ""

inherit rpm
