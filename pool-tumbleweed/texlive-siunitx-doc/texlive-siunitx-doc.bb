SUMMARY = "Documentation for texlive-siunitx"
DESCRIPTION = "This package includes the documentation for texlive-siunitx"
LICENSE = "LPPL-1.0"

PV = "2026.226.3.4.14svn77682"

RPM_NAME = "texlive-siunitx-doc-2026.226.3.4.14svn77682-64.2.noarch.rpm"
RPM_HASH = "d1c68d284b4fc07003efad1b95caf82516b09b02c9c046f4368319507f40efb74839c9b01279a83eda25d0324c51843f024896ac68812c8a3817fa4aa70e59fd"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-siunitx-doc"

RDEPENDS:${PN} += ""

inherit rpm
