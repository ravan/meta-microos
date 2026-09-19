SUMMARY = "Documentation for texlive-babel-vietnamese"
DESCRIPTION = "This package includes the documentation for texlive-babel-vietnamese"
LICENSE = "LPPL-1.0"

PV = "2026.226.1.4svn39246"

RPM_NAME = "texlive-babel-vietnamese-doc-2026.226.1.4svn39246-60.2.noarch.rpm"
RPM_HASH = "d1701eaca073ced26fa5d4ab5dcff03aa51275ba1924e232620c149f1e530ae52c127abec96e6cffb8fea8a0ff948491e30454adc37447b310e25dce256f7577"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-babel-vietnamese-doc"

RDEPENDS:${PN} += ""

inherit rpm
