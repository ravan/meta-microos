SUMMARY = "Documentation for texlive-graphicx-psmin"
DESCRIPTION = "This package includes the documentation for texlive-graphicx-psmin"
LICENSE = "LPPL-1.0"

PV = "2026.226.1.2svn56931"

RPM_NAME = "texlive-graphicx-psmin-doc-2026.226.1.2svn56931-60.4.noarch.rpm"
RPM_HASH = "f2fa098788f5a71e5383d2b63b546c97214c6dc613cebd6891bf10cc4387a2a2e3fd94c34b557073b7a01a714bc660b69c15d3c8db414f65c5ac1db3abe09a67"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-graphicx-psmin-doc"

RDEPENDS:${PN} += ""

inherit rpm
