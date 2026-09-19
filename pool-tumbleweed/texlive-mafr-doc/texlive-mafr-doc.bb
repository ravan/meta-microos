SUMMARY = "Documentation for texlive-mafr"
DESCRIPTION = "This package includes the documentation for texlive-mafr"
LICENSE = "GPL-2.0-or-later"

PV = "2026.226.1.0svn15878"

RPM_NAME = "texlive-mafr-doc-2026.226.1.0svn15878-59.2.noarch.rpm"
RPM_HASH = "7b4135c2329af9498ebe36244b9a941357aebab68f7cec68f43bd55036d1817900df183098af3e2c406a5611ae994434db7ac2cb67568199ece0308e0dd39517"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-texlive-mafr-doc-fr;en \
texlive-mafr-doc"

RDEPENDS:${PN} += ""

inherit rpm
