SUMMARY = "Documentation for texlive-xetex-tibetan"
DESCRIPTION = "This package includes the documentation for texlive-xetex-tibetan"
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.1svn28847"

RPM_NAME = "texlive-xetex-tibetan-doc-2026.226.0.0.1svn28847-59.4.noarch.rpm"
RPM_HASH = "fb2200785c9d7e3d3bd255252732a9dd1876c4f873d2aeb4e067e27e7b35497b0626dbf57abc1bb1e1168a6e4971a214691628d7c4d2088f5824020f019c2734"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-xetex-tibetan-doc"

RDEPENDS:${PN} += ""

inherit rpm
