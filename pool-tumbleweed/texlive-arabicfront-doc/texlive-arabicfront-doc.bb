SUMMARY = "Documentation for texlive-arabicfront"
DESCRIPTION = "This package includes the documentation for texlive-arabicfront"
LICENSE = "LPPL-1.0"

PV = "2026.226.1.1svn77682"

RPM_NAME = "texlive-arabicfront-doc-2026.226.1.1svn77682-61.2.noarch.rpm"
RPM_HASH = "da235b30f542be6cc93f4eaf5ade6ce7a3a45a257bf946fd72b5453bea360e8a5373ba7d9690de57c7be71b4ec81ed7d54c8afd967b08aa6724026a51ec83e87"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-arabicfront-doc"

RDEPENDS:${PN} += ""

inherit rpm
