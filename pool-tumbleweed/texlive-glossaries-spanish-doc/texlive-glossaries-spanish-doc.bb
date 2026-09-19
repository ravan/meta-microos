SUMMARY = "Documentation for texlive-glossaries-spanish"
DESCRIPTION = "This package includes the documentation for texlive-glossaries-spanish"
LICENSE = "LPPL-1.0"

PV = "2026.226.1.0svn35665"

RPM_NAME = "texlive-glossaries-spanish-doc-2026.226.1.0svn35665-60.4.noarch.rpm"
RPM_HASH = "029ed311e3b26ae1a3bec11393a72cb65a6cc38570cd88f5a993a60625dbb5a8339758228e7342f261775387a7601c0a1df2cc3b497cc8854447a940f2da48f3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-glossaries-spanish-doc"

RDEPENDS:${PN} += ""

inherit rpm
