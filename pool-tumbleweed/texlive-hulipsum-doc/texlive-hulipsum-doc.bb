SUMMARY = "Documentation for texlive-hulipsum"
DESCRIPTION = "This package includes the documentation for texlive-hulipsum"
LICENSE = "LPPL-1.0"

PV = "2026.226.1.4svn77317"

RPM_NAME = "texlive-hulipsum-doc-2026.226.1.4svn77317-60.2.noarch.rpm"
RPM_HASH = "8727ac833cce72a31dffb38360d2b0c7b4bf584a7948fd28911d8a2b20d47d750b6d78f4fcfb13c0de830cf6175ebf5f66be83dbbb4d847c27d1c00c370570da"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-hulipsum-doc"

RDEPENDS:${PN} += ""

inherit rpm
