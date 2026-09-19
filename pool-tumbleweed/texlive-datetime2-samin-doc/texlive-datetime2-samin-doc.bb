SUMMARY = "Documentation for texlive-datetime2-samin"
DESCRIPTION = "This package includes the documentation for texlive-datetime2-samin"
LICENSE = "LPPL-1.0"

PV = "2026.226.1.1svn49346"

RPM_NAME = "texlive-datetime2-samin-doc-2026.226.1.1svn49346-59.2.noarch.rpm"
RPM_HASH = "7aab6e7510701830b2c26399ce4a8293232990dcf4a68e7274f8a8d7d9b405840cfd25d21788bbabc797135cd0e8017494720292c0052a6ff1b024245a7d118e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-datetime2-samin-doc"

RDEPENDS:${PN} += ""

inherit rpm
