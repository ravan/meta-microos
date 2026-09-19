SUMMARY = "Documentation for texlive-wordlike"
DESCRIPTION = "This package includes the documentation for texlive-wordlike"
LICENSE = "LPPL-1.0"

PV = "2026.226.1.2bsvn15878"

RPM_NAME = "texlive-wordlike-doc-2026.226.1.2bsvn15878-60.2.noarch.rpm"
RPM_HASH = "337ab315cf06f353cd97a1e8ed913f03891081f3ecd1f3f73be24e36a9a5a64584be09744daf9ed0adbc6d42e5b5d2f2be280c0579c9b627295f5ca1551875b8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-wordlike-doc"

RDEPENDS:${PN} += ""

inherit rpm
