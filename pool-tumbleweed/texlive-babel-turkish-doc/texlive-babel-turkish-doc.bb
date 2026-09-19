SUMMARY = "Documentation for texlive-babel-turkish"
DESCRIPTION = "This package includes the documentation for texlive-babel-turkish"
LICENSE = "LPPL-1.0"

PV = "2026.226.1.4svn51560"

RPM_NAME = "texlive-babel-turkish-doc-2026.226.1.4svn51560-60.2.noarch.rpm"
RPM_HASH = "e52cd05ea74ddcce0ef0aab613d1a132156cb8f7fb6aae16498cea8af77fc2dc7267e0342f73699881c18273178e9b32b826570b4f408f5eb355cc01cdc3b41c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-babel-turkish-doc"

RDEPENDS:${PN} += ""

inherit rpm
