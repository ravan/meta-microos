SUMMARY = "Documentation for texlive-xcookybooky"
DESCRIPTION = "This package includes the documentation for texlive-xcookybooky"
LICENSE = "LPPL-1.0"

PV = "2026.226.1.5svn36435"

RPM_NAME = "texlive-xcookybooky-doc-2026.226.1.5svn36435-59.4.noarch.rpm"
RPM_HASH = "8ea133c5e841199fe8222d08fafa4145b708cbe8fe870cd608ff3b5973a3e1e2a82e40e8fb11018ade1f5c53b869a284b510c52e69c4b0991ae635f724984992"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-xcookybooky-doc"

RDEPENDS:${PN} += ""

inherit rpm
