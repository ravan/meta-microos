SUMMARY = "Documentation for texlive-footmisx"
DESCRIPTION = "This package includes the documentation for texlive-footmisx"
LICENSE = "LPPL-1.0"

PV = "2026.226.20161201svn42621"

RPM_NAME = "texlive-footmisx-doc-2026.226.20161201svn42621-60.2.noarch.rpm"
RPM_HASH = "c864ce9c90a35f120ded69af6251c507fd777e84f3a5d7dac2b3e4866c405f521649dab99056cf1bb81883723bd9d4d3b11abceb81d1fc5663ae30b2fb185957"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-footmisx-doc"

RDEPENDS:${PN} += ""

inherit rpm
