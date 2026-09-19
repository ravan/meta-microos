SUMMARY = "Documentation for texlive-tikzscale"
DESCRIPTION = "This package includes the documentation for texlive-tikzscale"
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.2.6svn30637"

RPM_NAME = "texlive-tikzscale-doc-2026.226.0.0.2.6svn30637-59.2.noarch.rpm"
RPM_HASH = "71696ce19922f8be15dc8a5b2e93c3664faeccb76989594d45943ee420dfb3c41d746ab19647a61f8e79cf10e4408f13edf9f51c1bba6e0797400f7560cc5f2a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-tikzscale-doc"

RDEPENDS:${PN} += ""

inherit rpm
