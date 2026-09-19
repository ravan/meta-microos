SUMMARY = "Documentation for texlive-memoize"
DESCRIPTION = "This package includes the documentation for texlive-memoize"
LICENSE = "LPPL-1.0"

PV = "2026.226.1.4.1svn73025"

RPM_NAME = "texlive-memoize-doc-2026.226.1.4.1svn73025-59.2.noarch.rpm"
RPM_HASH = "8b329105db9cf88a072f80b649ef8254bd1c47eb860a98c543718519bc62882bc30fb1c376bbaadb64c2cc503ed7ebfedd0fdc017fadd9ac4ff6bb72a883a2b1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "man-memoize-clean.1 \
man-memoize-extract.1 \
texlive-memoize-doc"

RDEPENDS:${PN} += ""

inherit rpm
