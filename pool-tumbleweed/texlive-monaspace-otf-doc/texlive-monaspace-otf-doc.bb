SUMMARY = "Documentation for texlive-monaspace-otf"
DESCRIPTION = "This package includes the documentation for texlive-monaspace-otf"
LICENSE = "OFL-1.1"

PV = "2026.226.0.0.1svn77682"

RPM_NAME = "texlive-monaspace-otf-doc-2026.226.0.0.1svn77682-61.2.noarch.rpm"
RPM_HASH = "a98dc05eeaf923a59ff4e1802cdd0f28dadd65476ef8ee85f2c7a48ba960e27dae1d37e91456eb7e585749eeeb3f20cb7558c1a7a85129be5a4f76e66d0ab097"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-monaspace-otf-doc"

RDEPENDS:${PN} += ""

inherit rpm
