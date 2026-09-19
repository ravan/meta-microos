SUMMARY = "Documentation for texlive-boxhandler"
DESCRIPTION = "This package includes the documentation for texlive-boxhandler"
LICENSE = "LPPL-1.0"

PV = "2026.226.1.30svn76790"

RPM_NAME = "texlive-boxhandler-doc-2026.226.1.30svn76790-59.2.noarch.rpm"
RPM_HASH = "299c79e98fbd600baf007fb7e6e8b7b80ea006cc7c97ee32dfbaf7ee0b0a89bcb1c87fa105667519e02baca73852a207e5f16b9b505259106d8fe1c14314b2d6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-boxhandler-doc"

RDEPENDS:${PN} += ""

inherit rpm
