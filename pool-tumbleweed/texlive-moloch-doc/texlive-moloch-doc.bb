SUMMARY = "Documentation for texlive-moloch"
DESCRIPTION = "This package includes the documentation for texlive-moloch"
LICENSE = "LPPL-1.0"

PV = "2026.226.2.2.0svn77913"

RPM_NAME = "texlive-moloch-doc-2026.226.2.2.0svn77913-61.2.noarch.rpm"
RPM_HASH = "6aab334fa1af614d6e5448cdee1f75027cf07b5c9bf6cf4454c28d952c240e77b99d62f3041cd38a8ce67f74d81fde20799865481038a7c65265532b69bc4d70"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-moloch-doc"

RDEPENDS:${PN} += ""

inherit rpm
