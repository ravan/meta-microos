SUMMARY = "Documentation for texlive-nag"
DESCRIPTION = "This package includes the documentation for texlive-nag"
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.7svn77682"

RPM_NAME = "texlive-nag-doc-2026.226.0.0.7svn77682-61.2.noarch.rpm"
RPM_HASH = "918a6de2ba8845242efb8faacf58a68f4ebc462a3a08eb998cf50891abf9b8eb0f8f7c584e9864ef5cc1d51abd6c30ea340a7b727ce2a1621d0b414984cd1980"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-nag-doc"

RDEPENDS:${PN} += ""

inherit rpm
