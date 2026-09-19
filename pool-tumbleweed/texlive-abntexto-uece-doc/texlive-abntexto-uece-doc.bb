SUMMARY = "Documentation for texlive-abntexto-uece"
DESCRIPTION = "This package includes the documentation for texlive-abntexto-uece"
LICENSE = "SUSE-Public-Domain"

PV = "2026.226.1.0svn76157"

RPM_NAME = "texlive-abntexto-uece-doc-2026.226.1.0svn76157-61.2.noarch.rpm"
RPM_HASH = "ad2319806a7805f6778221a889378122d23832d879e3e72a49c2c1b4509faf8512e84671ca2229cf20269330b8ba5fd19741bcdefb3ca9ead3aea44c22e8fc2b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-texlive-abntexto-uece-doc-pt-BR \
texlive-abntexto-uece-doc"

RDEPENDS:${PN} += ""

inherit rpm
