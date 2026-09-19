SUMMARY = "Documentation for texlive-mciteplus"
DESCRIPTION = "This package includes the documentation for texlive-mciteplus"
LICENSE = "LPPL-1.0"

PV = "2026.226.1.2svn77682"

RPM_NAME = "texlive-mciteplus-doc-2026.226.1.2svn77682-59.2.noarch.rpm"
RPM_HASH = "133aed21dabbb1ec9ea470f589fa86e991c8b70748afab9b60aadb90b8f01e1459edfd7bc5d2fca1454281d2423b1d86cd5a7d6d886f8cdfbd2895fc4beddb86"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-mciteplus-doc"

RDEPENDS:${PN} += ""

inherit rpm
