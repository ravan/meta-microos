SUMMARY = "Documentation for texlive-moreenum"
DESCRIPTION = "This package includes the documentation for texlive-moreenum"
LICENSE = "LPPL-1.0"

PV = "2026.226.1.03svn77682"

RPM_NAME = "texlive-moreenum-doc-2026.226.1.03svn77682-61.2.noarch.rpm"
RPM_HASH = "c39b55b35ac105f6a1839ecd58f0d0dd942d5ba45c5895ce6f64a5e719ee79931b021ebefae4d17a0df1a4db6dc32898af378e3a1b7b6bc7b41f2ec23ff07be9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-moreenum-doc"

RDEPENDS:${PN} += ""

inherit rpm
