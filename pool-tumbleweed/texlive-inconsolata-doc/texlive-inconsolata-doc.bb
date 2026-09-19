SUMMARY = "Documentation for texlive-inconsolata"
DESCRIPTION = "This package includes the documentation for texlive-inconsolata"
LICENSE = "OFL-1.1"

PV = "2026.226.1.121svn77682"

RPM_NAME = "texlive-inconsolata-doc-2026.226.1.121svn77682-60.2.noarch.rpm"
RPM_HASH = "b14770af81c34ca62ba83f5dd19acb850dca1ba9f7e9dc6b2204142390f539bde37567675955ff041510d9dd1a55f349ff71e138e62e8be13ec3b2f6d7269939"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-inconsolata-doc"

RDEPENDS:${PN} += ""

inherit rpm
