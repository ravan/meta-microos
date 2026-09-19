SUMMARY = "Documentation for texlive-uol-physics-report"
DESCRIPTION = "This package includes the documentation for texlive-uol-physics-report"
LICENSE = "LPPL-1.0"

PV = "2026.226.1.1svn76924"

RPM_NAME = "texlive-uol-physics-report-doc-2026.226.1.1svn76924-60.2.noarch.rpm"
RPM_HASH = "1b5162c86bac58c7e6c42e0fc4400f9309656d295a4e702472a7d57789def8469919bc4ed764c928d4e57d2a89331c9a73033f5ef9e608f661fd1aa96a9c1f77"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-uol-physics-report-doc"

RDEPENDS:${PN} += ""

inherit rpm
