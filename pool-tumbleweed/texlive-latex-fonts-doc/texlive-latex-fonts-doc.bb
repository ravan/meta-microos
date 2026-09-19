SUMMARY = "Documentation for texlive-latex-fonts"
DESCRIPTION = "This package includes the documentation for texlive-latex-fonts"
LICENSE = "LPPL-1.0"

PV = "2026.226.svn28888"

RPM_NAME = "texlive-latex-fonts-doc-2026.226.svn28888-63.2.noarch.rpm"
RPM_HASH = "a7e5a06c9541c50692b1b2096906bc088c62b26b48a47eb9644906fdca49b1f92965ddfc9bc56fb01f03d7b5ad26629911dfcdbc32f0429ea5e3a731c3b3e5b2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-latex-fonts-doc"

RDEPENDS:${PN} += ""

inherit rpm
