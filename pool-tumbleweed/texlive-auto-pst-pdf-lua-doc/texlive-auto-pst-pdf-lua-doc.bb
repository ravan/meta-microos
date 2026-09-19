SUMMARY = "Documentation for texlive-auto-pst-pdf-lua"
DESCRIPTION = "This package includes the documentation for texlive-auto-pst-pdf-lua"
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.03asvn77682"

RPM_NAME = "texlive-auto-pst-pdf-lua-doc-2026.226.0.0.03asvn77682-60.2.noarch.rpm"
RPM_HASH = "e268383bc9d998a411a399ff30a87aba2bf1dc4a8ceb99ce2b620bfef16e62428ce20603e386865eacbb3c4260e6410e2772f524c5dfeb905f81da02ed0b0b84"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-auto-pst-pdf-lua-doc"

RDEPENDS:${PN} += ""

inherit rpm
