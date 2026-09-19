SUMMARY = "Documentation for texlive-pst-bezier"
DESCRIPTION = "This package includes the documentation for texlive-pst-bezier"
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.03svn41981"

RPM_NAME = "texlive-pst-bezier-doc-2026.226.0.0.03svn41981-59.2.noarch.rpm"
RPM_HASH = "2e0d0e9d23e747ec5f5948d6f939740a2ca71f97cc1de74492532a85e3fe463747762f212bccdca877d0d1d9a96bc8a608e3d579064d38ced383b7102b3ff8a3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-pst-bezier-doc"

RDEPENDS:${PN} += ""

inherit rpm
