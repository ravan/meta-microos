SUMMARY = "Documentation for texlive-defoldfonts"
DESCRIPTION = "This package includes the documentation for texlive-defoldfonts"
LICENSE = "LPPL-1.0"

PV = "2026.226.1.1svn76435"

RPM_NAME = "texlive-defoldfonts-doc-2026.226.1.1svn76435-59.2.noarch.rpm"
RPM_HASH = "8f72413def41d81dc2be27c2d9c2a44e195520656cf3cddfaefdd935715f001b0e1ac257ae7d6befb81576aab9ab74bbe73d2bb1af73237b6cbefc714a724166"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-defoldfonts-doc"

RDEPENDS:${PN} += ""

inherit rpm
