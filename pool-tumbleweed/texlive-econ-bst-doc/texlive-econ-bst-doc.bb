SUMMARY = "Documentation for texlive-econ-bst"
DESCRIPTION = "This package includes the documentation for texlive-econ-bst"
LICENSE = "LPPL-1.0"

PV = "2026.226.3.3svn76907"

RPM_NAME = "texlive-econ-bst-doc-2026.226.3.3svn76907-61.4.noarch.rpm"
RPM_HASH = "3cbeea930ea99d19ea43bfedbfda60289c9b0f0e05e8790576b4aba347d0b257135446e17427720d60b6a2c8ab5f1770f26db7633f02d46266cdad313a21c869"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-econ-bst-doc"

RDEPENDS:${PN} += ""

inherit rpm
