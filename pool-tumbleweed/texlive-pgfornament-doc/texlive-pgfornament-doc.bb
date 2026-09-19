SUMMARY = "Documentation for texlive-pgfornament"
DESCRIPTION = "This package includes the documentation for texlive-pgfornament"
LICENSE = "LPPL-1.0"

PV = "2026.226.1.3svn72029"

RPM_NAME = "texlive-pgfornament-doc-2026.226.1.3svn72029-58.2.noarch.rpm"
RPM_HASH = "df749391ad1d78380f8343077fc8898e71597fcc2518af90bc4d123d8d5d4fac59708d92cd2692ab3a00ecb6700b3ef9c36f5908a51aabd145afeda34884a7d3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-pgfornament-doc"

RDEPENDS:${PN} += ""

inherit rpm
