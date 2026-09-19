SUMMARY = "Documentation for texlive-he-she"
DESCRIPTION = "This package includes the documentation for texlive-he-she"
LICENSE = "LPPL-1.0"

PV = "2026.226.1.3svn41359"

RPM_NAME = "texlive-he-she-doc-2026.226.1.3svn41359-60.4.noarch.rpm"
RPM_HASH = "7ab9090ceac4f566c3b35aa3e1a88e779ebed356b46d1f95fee13e9f253b199f73b9bc1ab4cbde0feee123e595e0261e3e5fbe5fc5bf8e29e2f1a22403e819f2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-he-she-doc"

RDEPENDS:${PN} += ""

inherit rpm
