SUMMARY = "Documentation for texlive-shtthesis"
DESCRIPTION = "This package includes the documentation for texlive-shtthesis"
LICENSE = "GPL-2.0-or-later"

PV = "2026.226.0.0.3.3svn62441"

RPM_NAME = "texlive-shtthesis-doc-2026.226.0.0.3.3svn62441-60.2.noarch.rpm"
RPM_HASH = "9cfa0327c99abc009b40714fc63f13892e1678d4c55b18c78b9edd4febf616bf34456726fea7192c37fb55b06930569df2116d661c6e056bfa3f3435ad2b1e43"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-texlive-shtthesis-doc-zh \
texlive-shtthesis-doc"

RDEPENDS:${PN} += ""

inherit rpm
