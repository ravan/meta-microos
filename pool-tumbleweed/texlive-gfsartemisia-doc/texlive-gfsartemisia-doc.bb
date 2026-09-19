SUMMARY = "Documentation for texlive-gfsartemisia"
DESCRIPTION = "This package includes the documentation for texlive-gfsartemisia"
LICENSE = "LPPL-1.0"

PV = "2026.226.1.0svn77682"

RPM_NAME = "texlive-gfsartemisia-doc-2026.226.1.0svn77682-60.2.noarch.rpm"
RPM_HASH = "c4eed53424e6d2cb6b416cee927d7f8390b06da4257ea275bd17199a9ee04d2ac9f704e3c18671b74f66649bfbea2920b6d15004b604ae388959859d864d2dd0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-gfsartemisia-doc"

RDEPENDS:${PN} += ""

inherit rpm
