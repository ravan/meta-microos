SUMMARY = "Documentation for texlive-annee-scolaire"
DESCRIPTION = "This package includes the documentation for texlive-annee-scolaire"
LICENSE = "LPPL-1.0"

PV = "2026.226.1.6svn76924"

RPM_NAME = "texlive-annee-scolaire-doc-2026.226.1.6svn76924-61.2.noarch.rpm"
RPM_HASH = "9575c41780f49505cb3a4eca1adb2f7b522aa3abce87dd1a64c9056f96cf223e5b8eaccfc3c2af1448e9e63d4cd1e9b498bcd414b0fc38e08e45605454c7a605"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-texlive-annee-scolaire-doc-fr \
texlive-annee-scolaire-doc"

RDEPENDS:${PN} += ""

inherit rpm
