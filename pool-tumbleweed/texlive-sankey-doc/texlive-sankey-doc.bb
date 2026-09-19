SUMMARY = "Documentation for texlive-sankey"
DESCRIPTION = "This package includes the documentation for texlive-sankey"
LICENSE = "LPPL-1.0"

PV = "2026.226.3.0.2svn73396"

RPM_NAME = "texlive-sankey-doc-2026.226.3.0.2svn73396-60.2.noarch.rpm"
RPM_HASH = "05af242254fd961659b5da72f2dd2b825b44634d18d73c5523feb37fed41980004f271d1be6cb5d682ef1bd9edd18b93480cc4bc905547055fa907a17a4eab4a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-sankey-doc"

RDEPENDS:${PN} += ""

inherit rpm
