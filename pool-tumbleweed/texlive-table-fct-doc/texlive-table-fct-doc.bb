SUMMARY = "Documentation for texlive-table-fct"
DESCRIPTION = "This package includes the documentation for texlive-table-fct"
LICENSE = "LPPL-1.0"

PV = "2026.226.1.1svn76924"

RPM_NAME = "texlive-table-fct-doc-2026.226.1.1svn76924-64.2.noarch.rpm"
RPM_HASH = "25cf8c8b4fb912cb4990ee708613a76ab43203a453a2f653baaec37a25ecb9200e18dc12f7e1949297cf41453a5392c3bd770f243ac0ec90c01b6a2c96e35790"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-table-fct-doc"

RDEPENDS:${PN} += ""

inherit rpm
