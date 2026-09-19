SUMMARY = "Documentation for texlive-yafoot"
DESCRIPTION = "This package includes the documentation for texlive-yafoot"
LICENSE = "LPPL-1.0"

PV = "2026.226.1.1svn48568"

RPM_NAME = "texlive-yafoot-doc-2026.226.1.1svn48568-59.4.noarch.rpm"
RPM_HASH = "b159726981e150fa57d69a39998f344fcce388067e4b6f8a55c5307db9fc337524f4d47a2b29926c1cd3c7a63ad713fe95df9035c23b94e874c0a27534c228f2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-yafoot-doc"

RDEPENDS:${PN} += ""

inherit rpm
