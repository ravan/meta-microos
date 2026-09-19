SUMMARY = "Documentation for texlive-cachepic"
DESCRIPTION = "This package includes the documentation for texlive-cachepic"
LICENSE = "LPPL-1.0"

PV = "2026.226.1.0svn26313"

RPM_NAME = "texlive-cachepic-doc-2026.226.1.0svn26313-59.2.noarch.rpm"
RPM_HASH = "3708cb98949ab90ddef347e930dbd8396394aa0d145a0d462cd83d77fb1f160e575ae425c866c5aa2477d6e9812c0be9c9091ac47e217ba8ec4be9d9b051ad8a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-cachepic-doc"

RDEPENDS:${PN} += ""

inherit rpm
