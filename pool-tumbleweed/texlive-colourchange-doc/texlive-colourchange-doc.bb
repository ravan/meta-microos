SUMMARY = "Documentation for texlive-colourchange"
DESCRIPTION = "This package includes the documentation for texlive-colourchange"
LICENSE = "GPL-2.0-or-later"

PV = "2026.226.1.22svn21741"

RPM_NAME = "texlive-colourchange-doc-2026.226.1.22svn21741-60.2.noarch.rpm"
RPM_HASH = "207b592734b10e0da96fe2b1ff691279421fbc23e6b98089c300e66fbc97a674f648f7e8234c5175392becf213c9299caeece557735a2f9081ac2c315bb0e41b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-colourchange-doc"

RDEPENDS:${PN} += ""

inherit rpm
