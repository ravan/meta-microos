SUMMARY = "Documentation for texlive-colortbl"
DESCRIPTION = "This package includes the documentation for texlive-colortbl"
LICENSE = "LPPL-1.0"

PV = "2026.226.1.0ksvn77682"

RPM_NAME = "texlive-colortbl-doc-2026.226.1.0ksvn77682-60.2.noarch.rpm"
RPM_HASH = "7c77891166a41ee411958b93e8d0bb1d6adaf1734705b4041dbd00083c4665951eae456eddddd75ff57e1fec50009b3bf45c8dab5b6b7caa33b34a6308aa5b77"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-texlive-colortbl-doc-de;en \
texlive-colortbl-doc"

RDEPENDS:${PN} += ""

inherit rpm
