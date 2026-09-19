SUMMARY = "Documentation for texlive-newspaper"
DESCRIPTION = "This package includes the documentation for texlive-newspaper"
LICENSE = "LPPL-1.0"

PV = "2026.226.1.0svn15878"

RPM_NAME = "texlive-newspaper-doc-2026.226.1.0svn15878-61.2.noarch.rpm"
RPM_HASH = "adcb847945c065610c2f7aa79c3ce973df0003128d3ad051c8da9be3110d165aacb1890660c209c4d9589b47f92d25138b0de40f58121aa0a6d1db7dd7b5971a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-newspaper-doc"

RDEPENDS:${PN} += ""

inherit rpm
