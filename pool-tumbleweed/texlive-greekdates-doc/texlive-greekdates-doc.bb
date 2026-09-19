SUMMARY = "Documentation for texlive-greekdates"
DESCRIPTION = "This package includes the documentation for texlive-greekdates"
LICENSE = "LPPL-1.0"

PV = "2026.226.1.0svn75878"

RPM_NAME = "texlive-greekdates-doc-2026.226.1.0svn75878-60.4.noarch.rpm"
RPM_HASH = "e4978845793cf9265171f30c5ff7cd4f4de26a0177dfe43781adb263f8487b534e4ce3ed902006efae4b2e58440fcb1fa317ea20c23ac8f46288225764f05e5a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-greekdates-doc"

RDEPENDS:${PN} += ""

inherit rpm
