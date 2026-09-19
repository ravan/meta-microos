SUMMARY = "Documentation for texlive-sf298"
DESCRIPTION = "This package includes the documentation for texlive-sf298"
LICENSE = "LPPL-1.0"

PV = "2026.226.1.3svn41653"

RPM_NAME = "texlive-sf298-doc-2026.226.1.3svn41653-60.2.noarch.rpm"
RPM_HASH = "dd420839e0265424bb30fab5c216efe20867f80245fde52682d4313df82059868491ed8d2c24c817a2ac6175ce14b03a77281510ea728bd60e6952c75e88705e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-sf298-doc"

RDEPENDS:${PN} += ""

inherit rpm
