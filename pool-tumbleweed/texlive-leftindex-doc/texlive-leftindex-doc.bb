SUMMARY = "Documentation for texlive-leftindex"
DESCRIPTION = "This package includes the documentation for texlive-leftindex"
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.2betasvn77682"

RPM_NAME = "texlive-leftindex-doc-2026.226.0.0.2betasvn77682-61.2.noarch.rpm"
RPM_HASH = "45f745ea5d57d476bc537d88ec986d128d891ccd652fe27f3743a9178e57763cdfada7ee5d7d02ca5908fe91119cbf88f74094926d895f7f427286064737712b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-leftindex-doc"

RDEPENDS:${PN} += ""

inherit rpm
