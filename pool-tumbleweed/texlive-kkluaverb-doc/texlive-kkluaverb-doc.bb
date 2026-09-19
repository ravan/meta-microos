SUMMARY = "Documentation for texlive-kkluaverb"
DESCRIPTION = "This package includes the documentation for texlive-kkluaverb"
LICENSE = "LPPL-1.0"

PV = "2026.226.2.1.2svn77516"

RPM_NAME = "texlive-kkluaverb-doc-2026.226.2.1.2svn77516-63.2.noarch.rpm"
RPM_HASH = "e4290bb851ab249a9b0050b7c8ba5f5aec9bc8e8e67b860e4fbd2771c8ba50b8730e4a080902e9c0ccb1a097e4f7f74e7a9ca65c677b6a01c92f5e9098013ee1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-kkluaverb-doc"

RDEPENDS:${PN} += ""

inherit rpm
