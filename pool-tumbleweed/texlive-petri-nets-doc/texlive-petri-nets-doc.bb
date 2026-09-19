SUMMARY = "Documentation for texlive-petri-nets"
DESCRIPTION = "This package includes the documentation for texlive-petri-nets"
LICENSE = "GPL-2.0-or-later"

PV = "2026.226.svn39165"

RPM_NAME = "texlive-petri-nets-doc-2026.226.svn39165-58.2.noarch.rpm"
RPM_HASH = "20e10b669a03263a65681f422d3906832748086fe8dedef3908ee042a793ce6b8cd2a0c02074ee85fb59f5da5f12e2cde3921619476daec3ecf6681f6c907b13"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-petri-nets-doc"

RDEPENDS:${PN} += ""

inherit rpm
