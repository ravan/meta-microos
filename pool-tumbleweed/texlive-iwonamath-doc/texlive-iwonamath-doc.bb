SUMMARY = "Documentation for texlive-iwonamath"
DESCRIPTION = "This package includes the documentation for texlive-iwonamath"
LICENSE = "LPPL-1.0"

PV = "2026.226.1.1svn77682"

RPM_NAME = "texlive-iwonamath-doc-2026.226.1.1svn77682-63.2.noarch.rpm"
RPM_HASH = "2374e49fdbf46374110a311a604c6565d81269fb4da514d3114eeb95b33225c6a4b690b2cb163e9c19c9f654674ae00d5d22ad1bc2d3d1d1d07f0a7269ef1a51"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-iwonamath-doc"

RDEPENDS:${PN} += ""

inherit rpm
