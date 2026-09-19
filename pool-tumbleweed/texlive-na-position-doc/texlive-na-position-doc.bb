SUMMARY = "Documentation for texlive-na-position"
DESCRIPTION = "This package includes the documentation for texlive-na-position"
LICENSE = "LPPL-1.0"

PV = "2026.226.1.2svn55559"

RPM_NAME = "texlive-na-position-doc-2026.226.1.2svn55559-61.2.noarch.rpm"
RPM_HASH = "bf9fb66baf9a9a1db712bbd2d8207a358af745658beaf503d30d9575000b7f76a01901691a9dabf4fad1c6e3735437f9a63348aea24f2be234a0ef46269267a7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-texlive-na-position-doc-ar \
texlive-na-position-doc"

RDEPENDS:${PN} += ""

inherit rpm
