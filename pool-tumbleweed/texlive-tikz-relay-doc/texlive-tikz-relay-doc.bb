SUMMARY = "Documentation for texlive-tikz-relay"
DESCRIPTION = "This package includes the documentation for texlive-tikz-relay"
LICENSE = "LPPL-1.0"

PV = "2026.226.1.3svn76924"

RPM_NAME = "texlive-tikz-relay-doc-2026.226.1.3svn76924-59.2.noarch.rpm"
RPM_HASH = "1fecbf7781f2c7503edeb174755c6a86c178b41921a166ed8ba28eed3d5e33324f85651e4ab05be20f57e85394fd6660678888eb4dc2d57e5d8a16e501805b3e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-tikz-relay-doc"

RDEPENDS:${PN} += ""

inherit rpm
