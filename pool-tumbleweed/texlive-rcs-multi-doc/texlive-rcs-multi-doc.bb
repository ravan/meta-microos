SUMMARY = "Documentation for texlive-rcs-multi"
DESCRIPTION = "This package includes the documentation for texlive-rcs-multi"
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.1asvn64967"

RPM_NAME = "texlive-rcs-multi-doc-2026.226.0.0.1asvn64967-60.4.noarch.rpm"
RPM_HASH = "d08313fee140e169cacdf798bc397cfd70e0e0ab593b3697865214b3b299376e628c9c69b86fe42067ee3049c6005eb226622f0b20303b1663629a70652dfbfd"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-rcs-multi-doc"

RDEPENDS:${PN} += ""

inherit rpm
