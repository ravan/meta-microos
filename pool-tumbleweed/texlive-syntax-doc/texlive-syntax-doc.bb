SUMMARY = "Documentation for texlive-syntax"
DESCRIPTION = "This package includes the documentation for texlive-syntax"
LICENSE = "GPL-2.0-or-later"

PV = "2026.226.svn15878"

RPM_NAME = "texlive-syntax-doc-2026.226.svn15878-64.2.noarch.rpm"
RPM_HASH = "f88a7c98addce0e4178887e659646efca20d5274ae3e6ed23b73dc2ab99fc0bf3348f9a60687cedf51055ff03a941adf4886e41564ef0ce7e39cf4720b939cd4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-texlive-syntax-doc-de \
texlive-syntax-doc"

RDEPENDS:${PN} += ""

inherit rpm
