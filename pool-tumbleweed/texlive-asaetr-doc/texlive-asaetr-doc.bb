SUMMARY = "Documentation for texlive-asaetr"
DESCRIPTION = "This package includes the documentation for texlive-asaetr"
LICENSE = "SUSE-Public-Domain"

PV = "2026.226.1.0asvn15878"

RPM_NAME = "texlive-asaetr-doc-2026.226.1.0asvn15878-60.2.noarch.rpm"
RPM_HASH = "434a52d77ff355da9618d064fe5a658be9623f0a0b6dc6c3e9983d78701c12d24a18262f10de18ae5fea7f894b320ff3188f775c256b7acb33fed56bdf65dbc2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-asaetr-doc"

RDEPENDS:${PN} += ""

inherit rpm
