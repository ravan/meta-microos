SUMMARY = "Documentation for texlive-swungdash"
DESCRIPTION = "This package includes the documentation for texlive-swungdash"
LICENSE = "LPPL-1.0"

PV = "2026.226.1.0.0svn76924"

RPM_NAME = "texlive-swungdash-doc-2026.226.1.0.0svn76924-64.2.noarch.rpm"
RPM_HASH = "edeaa015c01de236fdfbabc9eba1de93def03fd14c7a93825afc35144e2fd3a1005b996b775eca77818b30708039fbb0f7619e6e0f7f7d8a46ba48bba9ff797e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-swungdash-doc"

RDEPENDS:${PN} += ""

inherit rpm
