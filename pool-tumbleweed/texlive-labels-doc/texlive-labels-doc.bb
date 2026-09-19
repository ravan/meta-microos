SUMMARY = "Documentation for texlive-labels"
DESCRIPTION = "This package includes the documentation for texlive-labels"
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.13svn15878"

RPM_NAME = "texlive-labels-doc-2026.226.0.0.13svn15878-63.2.noarch.rpm"
RPM_HASH = "48d173960ba953e8b810c2ffcca12effca0c569c0df9ea00c885a18a0fdb72c85900c1eb9725347d75e93010f8a33e1f13a8b35d347b1a0b219d6bf63d54c102"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-labels-doc"

RDEPENDS:${PN} += ""

inherit rpm
