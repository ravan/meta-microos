SUMMARY = "Documentation for texlive-logpap"
DESCRIPTION = "This package includes the documentation for texlive-logpap"
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.6svn15878"

RPM_NAME = "texlive-logpap-doc-2026.226.0.0.6svn15878-61.2.noarch.rpm"
RPM_HASH = "3b14634f3d0e0e8a3a48e2a71e5bc0c4c143e15cc42aa3d3ffd5ad96520d055d587880a1849a7d8f5a71985392514bc25264e02ba91bb2ed1b38a2dfba8b39d4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-logpap-doc"

RDEPENDS:${PN} += ""

inherit rpm
