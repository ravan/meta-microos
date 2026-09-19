SUMMARY = "Documentation for texlive-fourier"
DESCRIPTION = "This package includes the documentation for texlive-fourier"
LICENSE = "LPPL-1.0"

PV = "2026.226.2.4svn77682"

RPM_NAME = "texlive-fourier-doc-2026.226.2.4svn77682-60.2.noarch.rpm"
RPM_HASH = "47443e4ffaf054e3563af7e3177ce60bcd009ed7451bf0100dfa68f1fe82767abe63bd744b3827799564102dfcf549c77137cb454c480b85478dd8ff5d62d49d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-fourier-doc"

RDEPENDS:${PN} += ""

inherit rpm
