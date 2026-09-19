SUMMARY = "Documentation for texlive-pagelayout"
DESCRIPTION = "This package includes the documentation for texlive-pagelayout"
LICENSE = "LPPL-1.0"

PV = "2026.226.1.1.1svn71937"

RPM_NAME = "texlive-pagelayout-doc-2026.226.1.1.1svn71937-58.2.noarch.rpm"
RPM_HASH = "386ac5deeac03e9945b2f6e76722aef85fbac73960db00281cb0a69f4f9b26eaa8eb2f450ca617e56f2a1fe06ccad1ce67784d73374b95ce7f8c700ebcdafc70"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "man-pagelayoutapi.1 \
man-textestvis.1 \
texlive-pagelayout-doc"

RDEPENDS:${PN} += ""

inherit rpm
