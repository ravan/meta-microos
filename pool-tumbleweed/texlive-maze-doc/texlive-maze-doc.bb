SUMMARY = "Documentation for texlive-maze"
DESCRIPTION = "This package includes the documentation for texlive-maze"
LICENSE = "LPPL-1.0"

PV = "2026.226.1.2svn76924"

RPM_NAME = "texlive-maze-doc-2026.226.1.2svn76924-59.2.noarch.rpm"
RPM_HASH = "bfee513a2f338b3dd7fec72834804454194ef8b15d2189d059d6ccc0fa31b6ecb3e8aba2eb706c8421cdcff4bd4e4d8c27e402a50cf420156b57c236ef47ac0e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-maze-doc"

RDEPENDS:${PN} += ""

inherit rpm
