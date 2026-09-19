SUMMARY = "Documentation for texlive-layouts"
DESCRIPTION = "This package includes the documentation for texlive-layouts"
LICENSE = "LPPL-1.0"

PV = "2026.226.2.6dsvn77682"

RPM_NAME = "texlive-layouts-doc-2026.226.2.6dsvn77682-61.2.noarch.rpm"
RPM_HASH = "3de81fee30200dce77042c8708c9101adf8988d0c9e5493d1d7476016402f7d6c032effca69ed9a5329bba7d00ab754e730bbc50f09d7043317cc2a6a0025c3e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-layouts-doc"

RDEPENDS:${PN} += ""

inherit rpm
