SUMMARY = "Documentation for texlive-yhmath"
DESCRIPTION = "This package includes the documentation for texlive-yhmath"
LICENSE = "LPPL-1.0"

PV = "2026.226.1.6svn77682"

RPM_NAME = "texlive-yhmath-doc-2026.226.1.6svn77682-59.4.noarch.rpm"
RPM_HASH = "9f2546982e7b95ff1b30ff2a7f3b8ad502b748ea5c8e6d5ceb47bff7888b40202b7bb0713751a854d06ab61db97141e409d9866a844c61c20afc317b4b045a17"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-yhmath-doc"

RDEPENDS:${PN} += ""

inherit rpm
