SUMMARY = "Documentation for texlive-dprogress"
DESCRIPTION = "This package includes the documentation for texlive-dprogress"
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.1svn15878"

RPM_NAME = "texlive-dprogress-doc-2026.226.0.0.1svn15878-59.2.noarch.rpm"
RPM_HASH = "6b705ad770028670fe1a70ebc83d90b666efdcb6f4e0e08a7918b01105c708a7dae06144fe3d1c5a9587d687d4ea810116a79449c595633d8dc7b23188bf6a39"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-dprogress-doc"

RDEPENDS:${PN} += ""

inherit rpm
