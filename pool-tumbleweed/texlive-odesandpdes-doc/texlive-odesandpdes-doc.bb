SUMMARY = "Documentation for texlive-odesandpdes"
DESCRIPTION = "This package includes the documentation for texlive-odesandpdes"
LICENSE = "LPPL-1.0"

PV = "2026.226.1.0.0svn69485"

RPM_NAME = "texlive-odesandpdes-doc-2026.226.1.0.0svn69485-61.2.noarch.rpm"
RPM_HASH = "d408c1b12d377d25c8cc81ed161db083d3ddd27b3d39646db407fd43bf05ee016c46f6337d997a7bc37b07172ab802e3ffb3aa99d383af8d03bdcb676135a3b0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-odesandpdes-doc"

RDEPENDS:${PN} += ""

inherit rpm
