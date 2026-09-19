SUMMARY = "Documentation for texlive-epspdf"
DESCRIPTION = "This package includes the documentation for texlive-epspdf"
LICENSE = "GPL-2.0-or-later"

PV = "2026.226.0.0.6.5.2svn74487"

RPM_NAME = "texlive-epspdf-doc-2026.226.0.0.6.5.2svn74487-61.4.noarch.rpm"
RPM_HASH = "dd0f9600e53d35842416b40eb050b69fab532ead1bafcc04e4a56718bbdc2e25bd446b3c6e4ae09c327268f2588896660d64da581672587455bfe2ebe86e7e83"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-epspdf-doc"

RDEPENDS:${PN} += "/usr/bin/sh"

inherit rpm
