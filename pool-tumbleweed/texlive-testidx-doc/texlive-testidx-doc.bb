SUMMARY = "Documentation for texlive-testidx"
DESCRIPTION = "This package includes the documentation for texlive-testidx"
LICENSE = "LPPL-1.0"

PV = "2026.227.1.2svn60966"

RPM_NAME = "texlive-testidx-doc-2026.227.1.2svn60966-62.2.noarch.rpm"
RPM_HASH = "9e529db98687ec7f7f9a7fc6d16c652d8739578906ba17ba5f776ac1c2720b9b3c3e09cdd349f8121596c5ba67e66f463746e39efa1dbb286662f8dae2e16a77"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-testidx-doc"

RDEPENDS:${PN} += ""

inherit rpm
