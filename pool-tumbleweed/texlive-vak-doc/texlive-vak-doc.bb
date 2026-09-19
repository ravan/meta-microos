SUMMARY = "Documentation for texlive-vak"
DESCRIPTION = "This package includes the documentation for texlive-vak"
LICENSE = "LPPL-1.0"

PV = "2026.226.svn75878"

RPM_NAME = "texlive-vak-doc-2026.226.svn75878-60.2.noarch.rpm"
RPM_HASH = "1514755fc1279d7f10cb94b75fd071b23ad78f4d57daf91378dc7a528f7b04ea103962996498844d967695f7822072642b27433323ac612b903f3fd90196330d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-texlive-vak-doc-en \
texlive-vak-doc"

RDEPENDS:${PN} += ""

inherit rpm
