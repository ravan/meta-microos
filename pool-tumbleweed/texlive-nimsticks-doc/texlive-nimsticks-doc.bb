SUMMARY = "Documentation for texlive-nimsticks"
DESCRIPTION = "This package includes the documentation for texlive-nimsticks"
LICENSE = "LPPL-1.0"

PV = "2026.226.2.0.1svn64118"

RPM_NAME = "texlive-nimsticks-doc-2026.226.2.0.1svn64118-61.2.noarch.rpm"
RPM_HASH = "b75bb672d325ebeede09c8b89c2cd16c14ca0e5a3cfb2211eb3c5a1b200ec054af6f7ce0f3fdedba9aa678c48a27cef27b86d2edefe01a024e210ca6cc5c9837"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-nimsticks-doc"

RDEPENDS:${PN} += ""

inherit rpm
