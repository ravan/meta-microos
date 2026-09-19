SUMMARY = "Documentation for texlive-gene-logic"
DESCRIPTION = "This package includes the documentation for texlive-gene-logic"
LICENSE = "LPPL-1.0"

PV = "2026.226.1.4svn75878"

RPM_NAME = "texlive-gene-logic-doc-2026.226.1.4svn75878-60.2.noarch.rpm"
RPM_HASH = "2c55acd120c8bebe94b09f51bf0d5d57e98f85ea49bf6c0f439d852abb5d6cc7649d1d990f4c1962353db5267eddf4b950478eac05e1906ae169164f521f093f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-gene-logic-doc"

RDEPENDS:${PN} += ""

inherit rpm
