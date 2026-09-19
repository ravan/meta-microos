SUMMARY = "Documentation for texlive-beamerthemecelestia"
DESCRIPTION = "This package includes the documentation for texlive-beamerthemecelestia"
LICENSE = "LPPL-1.0"

PV = "2026.226.1.2.0svn78057"

RPM_NAME = "texlive-beamerthemecelestia-doc-2026.226.1.2.0svn78057-61.2.noarch.rpm"
RPM_HASH = "bc0e5ca39063b18aeb12d7771b7c89734a7b8287be0bf1d61404b7eee1d8f6167defa9c5c9d8d8cede8a833c4fc4698b3c636c42b53920f33e3d978d56cfdf13"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-texlive-beamerthemecelestia-doc-fr;en \
texlive-beamerthemecelestia-doc"

RDEPENDS:${PN} += ""

inherit rpm
