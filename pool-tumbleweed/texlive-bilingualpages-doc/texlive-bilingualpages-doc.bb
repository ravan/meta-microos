SUMMARY = "Documentation for texlive-bilingualpages"
DESCRIPTION = "This package includes the documentation for texlive-bilingualpages"
LICENSE = "LPPL-1.0"

PV = "2026.226.1.0.0svn59643"

RPM_NAME = "texlive-bilingualpages-doc-2026.226.1.0.0svn59643-61.2.noarch.rpm"
RPM_HASH = "3931e38473c2375c9cb7f61b3bb9c47558afcde23164b3b7cdb4af23dd3f4395a109916b48dc535d5eb734ad944d605d9db66ce05c589b5a5e871feeb83f43eb"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-bilingualpages-doc"

RDEPENDS:${PN} += ""

inherit rpm
