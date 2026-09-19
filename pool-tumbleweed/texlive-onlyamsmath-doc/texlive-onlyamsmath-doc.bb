SUMMARY = "Documentation for texlive-onlyamsmath"
DESCRIPTION = "This package includes the documentation for texlive-onlyamsmath"
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.20svn42927"

RPM_NAME = "texlive-onlyamsmath-doc-2026.226.0.0.20svn42927-61.2.noarch.rpm"
RPM_HASH = "4268dbd69651806b80779a4a064389291e48ad8272cf47113cc12020a2a1d6c78e89b42f72d32d5d4e45359c4ee460387c1af61734a65fe981c3c5acd4c9fda6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-onlyamsmath-doc"

RDEPENDS:${PN} += ""

inherit rpm
