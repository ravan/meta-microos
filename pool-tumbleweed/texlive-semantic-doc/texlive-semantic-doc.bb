SUMMARY = "Documentation for texlive-semantic"
DESCRIPTION = "This package includes the documentation for texlive-semantic"
LICENSE = "LPPL-1.0"

PV = "2026.226.2.0svn15878"

RPM_NAME = "texlive-semantic-doc-2026.226.2.0svn15878-60.2.noarch.rpm"
RPM_HASH = "63355f649e5c1f173f80c2ec1e280d465fd847f4122f731dbd4c42f2f4116896355460f2cc4f53bc3fac70fdc4c7f3e1bfc1268d14e1ae25b072b80edf223851"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-semantic-doc"

RDEPENDS:${PN} += ""

inherit rpm
