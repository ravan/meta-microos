SUMMARY = "Documentation for texlive-terminalcode"
DESCRIPTION = "This package includes the documentation for texlive-terminalcode"
LICENSE = "LPPL-1.0"

PV = "2026.227.0.0.9.0svn76729"

RPM_NAME = "texlive-terminalcode-doc-2026.227.0.0.9.0svn76729-62.2.noarch.rpm"
RPM_HASH = "f853c48f01982954158021a083201f9e032117624e29d87ef7343ba83f0169c9c20d9aa97b3afecc4e4fdf5756c53a1471edb45438b3aba7f619faf7e15ad89c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-terminalcode-doc"

RDEPENDS:${PN} += ""

inherit rpm
