SUMMARY = "Documentation for texlive-stix2-otf"
DESCRIPTION = "This package includes the documentation for texlive-stix2-otf"
LICENSE = "OFL-1.1"

PV = "2026.226.2.12svn58735"

RPM_NAME = "texlive-stix2-otf-doc-2026.226.2.12svn58735-64.2.noarch.rpm"
RPM_HASH = "5ca1f4e71b04477f836a8d2891d9cd4415826af3b341054bd1ae88bc928b2c3d6177a3b1c1e60c82520916fd4f59455991bf3dda90364938b319f4f7896e11ba"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-stix2-otf-doc"

RDEPENDS:${PN} += ""

inherit rpm
