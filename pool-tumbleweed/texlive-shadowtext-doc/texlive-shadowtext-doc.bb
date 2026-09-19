SUMMARY = "Documentation for texlive-shadowtext"
DESCRIPTION = "This package includes the documentation for texlive-shadowtext"
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.3svn78101"

RPM_NAME = "texlive-shadowtext-doc-2026.226.0.0.3svn78101-60.2.noarch.rpm"
RPM_HASH = "ee260edf65c4a188b832d3b79c9f99014a45af559497e3b953d5530c68fb549e7ae31fd6623409a6484a72074bd569235f628f66acf93f9fdfa2273b5f1feb83"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-shadowtext-doc"

RDEPENDS:${PN} += ""

inherit rpm
