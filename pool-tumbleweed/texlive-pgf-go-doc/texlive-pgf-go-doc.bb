SUMMARY = "Documentation for texlive-pgf-go"
DESCRIPTION = "This package includes the documentation for texlive-pgf-go"
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.2025.03.10svn78101"

RPM_NAME = "texlive-pgf-go-doc-2026.226.0.0.2025.03.10svn78101-58.2.noarch.rpm"
RPM_HASH = "7368433576069f9b9a2c22a90033b01480583ea2a3a4269fb31b51eaa8f173fd56b673ea45d1e4c799565025f4e9ab362d2d03a04a167deb1eb692d96a44ea12"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-texlive-pgf-go-doc-es \
texlive-pgf-go-doc"

RDEPENDS:${PN} += ""

inherit rpm
