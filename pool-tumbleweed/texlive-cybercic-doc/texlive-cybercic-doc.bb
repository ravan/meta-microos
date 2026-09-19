SUMMARY = "Documentation for texlive-cybercic"
DESCRIPTION = "This package includes the documentation for texlive-cybercic"
LICENSE = "LPPL-1.0"

PV = "2026.226.2.1svn37659"

RPM_NAME = "texlive-cybercic-doc-2026.226.2.1svn37659-61.2.noarch.rpm"
RPM_HASH = "9c1428eef0eeb29aba68b6f2b72f9e1a38e7763b080af402ed862bd799b93f018bc67a3c6910e6e3ab01ff66e8e5559e57430d7524cf1a03855729b96af5d60b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-cybercic-doc"

RDEPENDS:${PN} += ""

inherit rpm
