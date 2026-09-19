SUMMARY = "Documentation for texlive-numspell"
DESCRIPTION = "This package includes the documentation for texlive-numspell"
LICENSE = "LPPL-1.0"

PV = "2026.226.1.9svn77682"

RPM_NAME = "texlive-numspell-doc-2026.226.1.9svn77682-61.2.noarch.rpm"
RPM_HASH = "353cbfc19463edadca51e059001865116ed8cb8f8a6d6a7aac759636dc62620e3b46bc00c85084c3d9477194005b23ff8cbaab5105a88ad5eb64f14e5d9634af"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-numspell-doc"

RDEPENDS:${PN} += ""

inherit rpm
