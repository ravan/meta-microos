SUMMARY = "Documentation for texlive-documentation"
DESCRIPTION = "This package includes the documentation for texlive-documentation"
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.1svn34521"

RPM_NAME = "texlive-documentation-doc-2026.226.0.0.1svn34521-59.2.noarch.rpm"
RPM_HASH = "6b49b86a472221e0352ca9f696b8dc63db77934338886866b265fb0a15ca84a1edec65cffc0b679b79a9049d5c84e5b14f0b062f39df732c4733dcbd69a98e43"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-documentation-doc"

RDEPENDS:${PN} += ""

inherit rpm
