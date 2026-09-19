SUMMARY = "Documentation for texlive-exp-testopt"
DESCRIPTION = "This package includes the documentation for texlive-exp-testopt"
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.3svn15878"

RPM_NAME = "texlive-exp-testopt-doc-2026.226.0.0.3svn15878-59.2.noarch.rpm"
RPM_HASH = "95de978000c9d9ee0e0f39f7da1fec6b0a121de429713d7ac232cbe91fc123bf82905cf4f85fae0f0643793d204c4bb6154cf5e34f1772fd49f246e57beeaf30"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-texlive-exp-testopt-doc-en;eo \
texlive-exp-testopt-doc"

RDEPENDS:${PN} += ""

inherit rpm
