SUMMARY = "Documentation for texlive-loops"
DESCRIPTION = "This package includes the documentation for texlive-loops"
LICENSE = "LPPL-1.0"

PV = "2026.226.1.3svn30704"

RPM_NAME = "texlive-loops-doc-2026.226.1.3svn30704-61.2.noarch.rpm"
RPM_HASH = "953db960408b617d24655025c144db565ba1f075e3396c7e9cae8f5d47bd14d01e2b08cf8f7e2a2a7c3dadadf9422e00573fa1f6df9b5e03007363de6dec64b5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-loops-doc"

RDEPENDS:${PN} += ""

inherit rpm
