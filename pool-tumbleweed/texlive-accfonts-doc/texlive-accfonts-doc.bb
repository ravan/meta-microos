SUMMARY = "Documentation for texlive-accfonts"
DESCRIPTION = "This package includes the documentation for texlive-accfonts"
LICENSE = "GPL-2.0-or-later"

PV = "2026.226.0.0.25svn18835"

RPM_NAME = "texlive-accfonts-doc-2026.226.0.0.25svn18835-61.2.noarch.rpm"
RPM_HASH = "c4a7c02cce1f4461d34e1bd05e0ece7390a254dedc75a5a7dcc68d1ae70a3ad5a7dd9b10aa827d4311d6edfb091932bb3e417bff39be43f78eca339c4fbfde93"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-accfonts-doc"

RDEPENDS:${PN} += ""

inherit rpm
