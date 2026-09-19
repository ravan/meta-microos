SUMMARY = "Documentation for texlive-latex-lab-dev"
DESCRIPTION = "This package includes the documentation for texlive-latex-lab-dev"
LICENSE = "LPPL-1.0"

PV = "2026.226.pre_release_1asvn77531"

RPM_NAME = "texlive-latex-lab-dev-doc-2026.226.pre_release_1asvn77531-63.2.noarch.rpm"
RPM_HASH = "eb4bcd0acba511d9b8b437ee2109bfc257bc2b48595ee8f8a983c10f32f8afef2c367d45bc58eb665eb6ecdf5780a451bc5ae907b815914835381a9686b32084"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-latex-lab-dev-doc"

RDEPENDS:${PN} += ""

inherit rpm
