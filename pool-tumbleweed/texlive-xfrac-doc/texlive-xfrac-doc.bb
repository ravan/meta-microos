SUMMARY = "Documentation for texlive-xfrac"
DESCRIPTION = "This package includes the documentation for texlive-xfrac"
LICENSE = "LPPL-1.0"

PV = "2026.226.svn77682"

RPM_NAME = "texlive-xfrac-doc-2026.226.svn77682-59.4.noarch.rpm"
RPM_HASH = "75c486e707699fa70a1ed1d347bee842284b76a56aaa77dc44e2a8a6a2587af45b70ad6733b6cd003bfe34308f8432f139a84de06dc1d8b9c1e130f6ea5059f5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-xfrac-doc"

RDEPENDS:${PN} += ""

inherit rpm
