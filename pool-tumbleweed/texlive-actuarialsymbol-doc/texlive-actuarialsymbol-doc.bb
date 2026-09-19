SUMMARY = "Documentation for texlive-actuarialsymbol"
DESCRIPTION = "This package includes the documentation for texlive-actuarialsymbol"
LICENSE = "LPPL-1.0"

PV = "2026.226.1.1svn67201"

RPM_NAME = "texlive-actuarialsymbol-doc-2026.226.1.1svn67201-61.2.noarch.rpm"
RPM_HASH = "209b8394a55fc89f874d2e8c499e94a13a288feb6b151cf6e25049ae911e5d443ac2f7126d3453b36bcebe5eb0b82f278094d4ebada795c0fafac9b2b8234633"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-actuarialsymbol-doc"

RDEPENDS:${PN} += ""

inherit rpm
