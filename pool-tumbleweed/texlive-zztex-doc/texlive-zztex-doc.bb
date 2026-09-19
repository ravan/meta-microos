SUMMARY = "Documentation for texlive-zztex"
DESCRIPTION = "This package includes the documentation for texlive-zztex"
LICENSE = "LPPL-1.0"

PV = "2026.226.17.7svn55862"

RPM_NAME = "texlive-zztex-doc-2026.226.17.7svn55862-59.4.noarch.rpm"
RPM_HASH = "ab95cfda1b434d035bd4bc56b4bdacf6e89136e17bf82dd49844d58187551df954ac96324f440970d79bb2847c4ac30d9384f91d1da9b20286194bd3b85499a4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-zztex-doc"

RDEPENDS:${PN} += ""

inherit rpm
