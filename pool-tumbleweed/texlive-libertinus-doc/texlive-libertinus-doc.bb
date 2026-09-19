SUMMARY = "Documentation for texlive-libertinus"
DESCRIPTION = "This package includes the documentation for texlive-libertinus"
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.02svn77682"

RPM_NAME = "texlive-libertinus-doc-2026.226.0.0.02svn77682-61.2.noarch.rpm"
RPM_HASH = "c02980a6076ac1a2ecd3a6ecd1e2d7badad61f3ca643a6190ff201e898cebf8d8ece3b149ee9f7b36a303817be2a3863b85cbbfbf9606ec5ad06c7be97bda07c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-libertinus-doc"

RDEPENDS:${PN} += ""

inherit rpm
