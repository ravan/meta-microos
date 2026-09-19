SUMMARY = "Documentation for texlive-businesscard-qrcode"
DESCRIPTION = "This package includes the documentation for texlive-businesscard-qrcode"
LICENSE = "LGPL-2.1-or-later"

PV = "2026.226.1.2svn76924"

RPM_NAME = "texlive-businesscard-qrcode-doc-2026.226.1.2svn76924-59.2.noarch.rpm"
RPM_HASH = "88eb5e6e17fa8621a7bed9ef5dbf03b88eb576cde46631b6be6579558eb440800e75482848de9763e7002f2f969d2e8f1c250efedf23a7a7ed813f5bd1aa38f0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-businesscard-qrcode-doc"

RDEPENDS:${PN} += ""

inherit rpm
