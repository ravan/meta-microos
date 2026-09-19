SUMMARY = "Documentation for texlive-logical-markup-utils"
DESCRIPTION = "This package includes the documentation for texlive-logical-markup-utils"
LICENSE = "GPL-2.0-or-later"

PV = "2026.226.svn15878"

RPM_NAME = "texlive-logical-markup-utils-doc-2026.226.svn15878-61.2.noarch.rpm"
RPM_HASH = "622d4e8d837bc08e123653622e0dcae67400ae14dea9230e7543a6fc89d13b2596522ed1098d514932c4a0c596c07db7a608ed04fec2c2d153c73fb65e1c2c66"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-logical-markup-utils-doc"

RDEPENDS:${PN} += ""

inherit rpm
