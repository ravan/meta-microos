SUMMARY = "Documentation for texlive-ltablex"
DESCRIPTION = "This package includes the documentation for texlive-ltablex"
LICENSE = "LPPL-1.0"

PV = "2026.226.1.1svn77682"

RPM_NAME = "texlive-ltablex-doc-2026.226.1.1svn77682-59.2.noarch.rpm"
RPM_HASH = "84c178398f4bcfa72e7687c11e997487ae3497fc02863593349b983297a0a6d7d4cd2e1d64e466f658a0e1c33460d9c19ac966e8338e80b638b2dbc0989dfb68"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-ltablex-doc"

RDEPENDS:${PN} += ""

inherit rpm
