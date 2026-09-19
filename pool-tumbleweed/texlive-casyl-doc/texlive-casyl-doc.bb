SUMMARY = "Documentation for texlive-casyl"
DESCRIPTION = "This package includes the documentation for texlive-casyl"
LICENSE = "SUSE-Public-Domain"

PV = "2026.226.2.0svn15878"

RPM_NAME = "texlive-casyl-doc-2026.226.2.0svn15878-59.2.noarch.rpm"
RPM_HASH = "6ea9ccf35b136e2a435b942b089b19f54fdfecdba01f61e8cae1355681f794cad87b007ccd532acbe8b21f0f6b34a229d9830bb5e2bd73dc0678722db79fff86"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-casyl-doc"

RDEPENDS:${PN} += ""

inherit rpm
