SUMMARY = "Documentation for texlive-lfb"
DESCRIPTION = "This package includes the documentation for texlive-lfb"
LICENSE = "LPPL-1.0"

PV = "2026.226.1.0svn15878"

RPM_NAME = "texlive-lfb-doc-2026.226.1.0svn15878-61.2.noarch.rpm"
RPM_HASH = "a7c3361d9c86e76ae4f5484c41e3f9b08bff8222863791e205f736dda03696f004cd68c072904055d35441365ee79bf7e48abbf108b05ca38366a07c961b6229"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-texlive-lfb-doc-el \
texlive-lfb-doc"

RDEPENDS:${PN} += ""

inherit rpm
