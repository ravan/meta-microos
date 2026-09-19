SUMMARY = "Documentation for texlive-bxcoloremoji"
DESCRIPTION = "This package includes the documentation for texlive-bxcoloremoji"
LICENSE = "LPPL-1.0"

PV = "2026.226.1.0asvn77682"

RPM_NAME = "texlive-bxcoloremoji-doc-2026.226.1.0asvn77682-59.2.noarch.rpm"
RPM_HASH = "92c5fc3dadffd277346610c19ccaf5b6d245b8dd3b6c74543f46295ec4af4573b48698edb233d28cbec0e71b425502aa168ddf2cf3dcc925dd0172e4ae712f3e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-texlive-bxcoloremoji-doc-ja \
texlive-bxcoloremoji-doc"

RDEPENDS:${PN} += ""

inherit rpm
