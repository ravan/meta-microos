SUMMARY = "Documentation for texlive-tikzbrickfigurines"
DESCRIPTION = "This package includes the documentation for texlive-tikzbrickfigurines"
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.1.1svn76088"

RPM_NAME = "texlive-tikzbrickfigurines-doc-2026.226.0.0.1.1svn76088-59.2.noarch.rpm"
RPM_HASH = "09a1a0a924899216051767449499237269832fcd911ee6a89450f66c209a7d740c0f16e4abef79628c9f0e1ae175b10e812c51035c8ce435faddabfef8267a95"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-tikzbrickfigurines-doc"

RDEPENDS:${PN} += ""

inherit rpm
