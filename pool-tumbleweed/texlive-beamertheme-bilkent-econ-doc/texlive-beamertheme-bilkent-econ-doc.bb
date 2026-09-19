SUMMARY = "Documentation for texlive-beamertheme-bilkent-econ"
DESCRIPTION = "This package includes the documentation for texlive-beamertheme-bilkent-econ"
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.1svn76561"

RPM_NAME = "texlive-beamertheme-bilkent-econ-doc-2026.226.0.0.1svn76561-61.2.noarch.rpm"
RPM_HASH = "104520c9c75f7dd436318331173b70978c77f25eab9095e457c49065ab5c9a056cfcee5064d8deed089bbb55a723695d3b7f2fa2a30fd8ef1032cc9692676222"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-beamertheme-bilkent-econ-doc"

RDEPENDS:${PN} += ""

inherit rpm
