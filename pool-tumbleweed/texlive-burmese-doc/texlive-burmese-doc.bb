SUMMARY = "Documentation for texlive-burmese"
DESCRIPTION = "This package includes the documentation for texlive-burmese"
LICENSE = "LPPL-1.0"

PV = "2026.226.svn25185"

RPM_NAME = "texlive-burmese-doc-2026.226.svn25185-59.2.noarch.rpm"
RPM_HASH = "4c5686430aec2729fb1171b8573ee85cdaa9d58ffd6fba14923830877273406fe163b847fd07f342fb08e67d2775161fa81e67b48791b697a58a11371ac0e7ff"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-burmese-doc"

RDEPENDS:${PN} += ""

inherit rpm
