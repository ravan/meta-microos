SUMMARY = "Documentation for texlive-pgf-periodictable"
DESCRIPTION = "This package includes the documentation for texlive-pgf-periodictable"
LICENSE = "LPPL-1.0"

PV = "2026.226.2.1.5svn73886"

RPM_NAME = "texlive-pgf-periodictable-doc-2026.226.2.1.5svn73886-58.2.noarch.rpm"
RPM_HASH = "b0c0b9a02d3af4d1314a6ddb0940cba03ab868274d9c23daf05bbae7aa19d39839fbcef2167241fde8c4c00497def17968a7067a4f7f36f60c6e43dc8b98c8e4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-pgf-periodictable-doc"

RDEPENDS:${PN} += ""

inherit rpm
