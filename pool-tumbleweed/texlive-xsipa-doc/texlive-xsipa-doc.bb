SUMMARY = "Documentation for texlive-xsipa"
DESCRIPTION = "This package includes the documentation for texlive-xsipa"
LICENSE = "LPPL-1.0"

PV = "2026.226.1.0svn76924"

RPM_NAME = "texlive-xsipa-doc-2026.226.1.0svn76924-59.4.noarch.rpm"
RPM_HASH = "1a4b191212a3980d96df70b57dc0940a37346d88907a6d1c4a30cf8f9e20fa1634876e5e918352af8812554285b4dc11845030ca7417caf3f084162ca8a1e592"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-xsipa-doc"

RDEPENDS:${PN} += ""

inherit rpm
