SUMMARY = "Documentation for texlive-urcls"
DESCRIPTION = "This package includes the documentation for texlive-urcls"
LICENSE = "LPPL-1.0"

PV = "2026.226.2.1svn49903"

RPM_NAME = "texlive-urcls-doc-2026.226.2.1svn49903-60.2.noarch.rpm"
RPM_HASH = "70a12774a8dbe3cae5b45a634e6d4a9b2d46bd94d64d6308bcbfdf8861506d9e902546848afb776363146901a92cd8d0ff7d3075e11963935d211656309c8c15"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-urcls-doc"

RDEPENDS:${PN} += ""

inherit rpm
