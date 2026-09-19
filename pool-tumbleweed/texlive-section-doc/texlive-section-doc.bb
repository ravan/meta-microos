SUMMARY = "Documentation for texlive-section"
DESCRIPTION = "This package includes the documentation for texlive-section"
LICENSE = "LPPL-1.0"

PV = "2026.226.svn20180"

RPM_NAME = "texlive-section-doc-2026.226.svn20180-60.2.noarch.rpm"
RPM_HASH = "873010d20b39259544f69ef980e5117ffd4380b5e750fcdb629ccb637793bc364a1a66649776531248df306097fa16f0f67a6141814bdf572b2a8d6a26633602"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-section-doc"

RDEPENDS:${PN} += ""

inherit rpm
