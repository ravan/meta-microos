SUMMARY = "Documentation for texlive-musikui"
DESCRIPTION = "This package includes the documentation for texlive-musikui"
LICENSE = "LPPL-1.0"

PV = "2026.226.1svn47472"

RPM_NAME = "texlive-musikui-doc-2026.226.1svn47472-61.2.noarch.rpm"
RPM_HASH = "73c16d24687d1e3e8fe3c37359f0dab799a6a9a60b08fc32aede8fa3103904807ef7999c4a33fc7ea5e9971fc0a9440260441ca75d559e54f800438fd37529f1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-musikui-doc"

RDEPENDS:${PN} += ""

inherit rpm
