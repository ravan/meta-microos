SUMMARY = "Documentation for texlive-eqparbox"
DESCRIPTION = "This package includes the documentation for texlive-eqparbox"
LICENSE = "LPPL-1.0"

PV = "2026.226.4.1svn77682"

RPM_NAME = "texlive-eqparbox-doc-2026.226.4.1svn77682-61.4.noarch.rpm"
RPM_HASH = "5f89c49afdb29c545225d39d71c93a3244389fcf2c013d0f3ee2d638f0bc61567f84ba626ae729ea888478a445cf051c1ae87d3f8b5c2793b0218f3fda644d86"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-eqparbox-doc"

RDEPENDS:${PN} += ""

inherit rpm
