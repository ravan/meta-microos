SUMMARY = "Documentation for texlive-mcf2graph"
DESCRIPTION = "This package includes the documentation for texlive-mcf2graph"
LICENSE = "LPPL-1.0"

PV = "2026.226.5.29svn76506"

RPM_NAME = "texlive-mcf2graph-doc-2026.226.5.29svn76506-59.2.noarch.rpm"
RPM_HASH = "3e1c0c6303fd83d1631fda31259f0799809c05fb19c92ab6cb1f2003388733d097d1ed78e6979857de363b8d5f7217a1509e943a6219ad8a765cc9a42c543086"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-mcf2graph-doc"

RDEPENDS:${PN} += ""

inherit rpm
