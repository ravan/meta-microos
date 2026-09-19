SUMMARY = "Documentation for texlive-pst-osci"
DESCRIPTION = "This package includes the documentation for texlive-pst-osci"
LICENSE = "LPPL-1.0"

PV = "2026.226.2.82bsvn68781"

RPM_NAME = "texlive-pst-osci-doc-2026.226.2.82bsvn68781-59.2.noarch.rpm"
RPM_HASH = "4a512a6234e35d222a8da3dec27dfe433df1ee0737deaa5f51745d7f3920da0b0312611cc05b2070c313036751482de1ad2228927e027e4341dc485650b79da6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-pst-osci-doc"

RDEPENDS:${PN} += ""

inherit rpm
