SUMMARY = "Documentation for texlive-bxeepic"
DESCRIPTION = "This package includes the documentation for texlive-bxeepic"
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.2svn77682"

RPM_NAME = "texlive-bxeepic-doc-2026.226.0.0.2svn77682-59.2.noarch.rpm"
RPM_HASH = "cbd8169cd9294ae243b028f033100cb58834a8c5ce471f3839597fcce847d41a420fd56aa07c7ac8687e732e2ba3827b80486d75cca7e613c68edd80449e2df7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-bxeepic-doc"

RDEPENDS:${PN} += ""

inherit rpm
