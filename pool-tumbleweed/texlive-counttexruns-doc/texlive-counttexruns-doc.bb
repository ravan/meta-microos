SUMMARY = "Documentation for texlive-counttexruns"
DESCRIPTION = "This package includes the documentation for texlive-counttexruns"
LICENSE = "LPPL-1.0"

PV = "2026.226.1.00asvn27576"

RPM_NAME = "texlive-counttexruns-doc-2026.226.1.00asvn27576-61.2.noarch.rpm"
RPM_HASH = "df74ea453fcd34a295b5fa97f58cf452f52e1330d1540c20704a943a08d6b6b1296e1d5f9e7efb3e7c5d783c586eff3cfa15b6257742ebd0d703c97aa532a0c8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-counttexruns-doc"

RDEPENDS:${PN} += ""

inherit rpm
