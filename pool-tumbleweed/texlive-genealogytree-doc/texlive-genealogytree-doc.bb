SUMMARY = "Documentation for texlive-genealogytree"
DESCRIPTION = "This package includes the documentation for texlive-genealogytree"
LICENSE = "LPPL-1.0"

PV = "2026.226.2.3.0svn66513"

RPM_NAME = "texlive-genealogytree-doc-2026.226.2.3.0svn66513-60.2.noarch.rpm"
RPM_HASH = "89cbff75222a676020e629636fad6d3d6d41e39fecfe6db71ae87e9b324d23c0d275917e7dfb22430fc48a6672e66341e6d2ca689518e79305327ab65950c299"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-genealogytree-doc"

RDEPENDS:${PN} += ""

inherit rpm
