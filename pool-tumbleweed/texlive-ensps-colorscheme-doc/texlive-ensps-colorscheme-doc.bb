SUMMARY = "Documentation for texlive-ensps-colorscheme"
DESCRIPTION = "This package includes the documentation for texlive-ensps-colorscheme"
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.0.1svn71431"

RPM_NAME = "texlive-ensps-colorscheme-doc-2026.226.0.0.0.1svn71431-61.4.noarch.rpm"
RPM_HASH = "4ae899e78324c13d100dfb7a1e50e3afb47773cd6d7e4bf1a527d762a847b59fa3b671439172bc4877c1d5f7949ce26688be7b45ba1267e9aa727d40750b1328"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-ensps-colorscheme-doc"

RDEPENDS:${PN} += ""

inherit rpm
