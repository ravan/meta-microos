SUMMARY = "Documentation for texlive-beamertheme-simpleplus"
DESCRIPTION = "This package includes the documentation for texlive-beamertheme-simpleplus"
LICENSE = "SUSE-Public-Domain"

PV = "2026.226.1.1svn73362"

RPM_NAME = "texlive-beamertheme-simpleplus-doc-2026.226.1.1svn73362-61.2.noarch.rpm"
RPM_HASH = "693ab22cac65cfb4750f0b1d114c18fc61cb80990a32e2f9bd6a2069f6c818802c383f50b787082b3fc73cfeacfb035e1599155214f7db20616fcaf55973659a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-beamertheme-simpleplus-doc"

RDEPENDS:${PN} += ""

inherit rpm
