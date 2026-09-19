SUMMARY = "Documentation for texlive-affilauthor"
DESCRIPTION = "This package includes the documentation for texlive-affilauthor"
LICENSE = "LPPL-1.0"

PV = "2026.226.1.0.1svn76924"

RPM_NAME = "texlive-affilauthor-doc-2026.226.1.0.1svn76924-61.2.noarch.rpm"
RPM_HASH = "4fef5dfd64f5faa25f2690eed1826f543161faa9529ccbde3c6996fb678ade733486b657fab3a4a7e639017814b69ffa6347f9b110075d64f984459b2aa14ae6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-affilauthor-doc"

RDEPENDS:${PN} += ""

inherit rpm
