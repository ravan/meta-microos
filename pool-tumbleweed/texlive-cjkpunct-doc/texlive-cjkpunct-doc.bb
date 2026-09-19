SUMMARY = "Documentation for texlive-cjkpunct"
DESCRIPTION = "This package includes the documentation for texlive-cjkpunct"
LICENSE = "LPPL-1.0"

PV = "2026.226.4.8.4svn41119"

RPM_NAME = "texlive-cjkpunct-doc-2026.226.4.8.4svn41119-60.2.noarch.rpm"
RPM_HASH = "93c54933ee133d5e73890615183540c3127b83bde9bec5d0a080827a161f5287dd7eb24fd19625aa2b01abd2996bc0a92efbe3cdf65e5d686675780bd0d1d9dc"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-cjkpunct-doc"

RDEPENDS:${PN} += ""

inherit rpm
