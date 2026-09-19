SUMMARY = "Documentation for texlive-latex-amsmath-dev"
DESCRIPTION = "This package includes the documentation for texlive-latex-amsmath-dev"
LICENSE = "LPPL-1.0"

PV = "2026.226.pre_release_1svn77483"

RPM_NAME = "texlive-latex-amsmath-dev-doc-2026.226.pre_release_1svn77483-63.2.noarch.rpm"
RPM_HASH = "74ba28195c8bc58f74b08b27142b1cc92609009d2e18d968d4ab7ee13f85caebd8f2529e1860e4941792d23e57cc869c0af55c346b28fa2e60a7f9b594312c3c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-texlive-latex-amsmath-dev-doc-en \
texlive-latex-amsmath-dev-doc"

RDEPENDS:${PN} += ""

inherit rpm
