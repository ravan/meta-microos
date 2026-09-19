SUMMARY = "Documentation for texlive-pgfornament-han"
DESCRIPTION = "This package includes the documentation for texlive-pgfornament-han"
LICENSE = "LPPL-1.0"

PV = "2026.226.svn72640"

RPM_NAME = "texlive-pgfornament-han-doc-2026.226.svn72640-58.2.noarch.rpm"
RPM_HASH = "7ba8676e6ce7bcd5a2b93bcff5a9b85d7ecd7f363fc0d04452d36fa714e89390a5740348d83ff566dfcad1dda6a4ed25fc464b0416747c1d9c7ce2d214b4a276"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-texlive-pgfornament-han-doc-zh \
texlive-pgfornament-han-doc"

RDEPENDS:${PN} += ""

inherit rpm
