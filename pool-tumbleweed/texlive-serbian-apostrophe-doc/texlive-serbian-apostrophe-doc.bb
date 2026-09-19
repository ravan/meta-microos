SUMMARY = "Documentation for texlive-serbian-apostrophe"
DESCRIPTION = "This package includes the documentation for texlive-serbian-apostrophe"
LICENSE = "LPPL-1.0"

PV = "2026.226.svn23799"

RPM_NAME = "texlive-serbian-apostrophe-doc-2026.226.svn23799-60.2.noarch.rpm"
RPM_HASH = "5eab961d20cedc9a32c70233e49179559d446131290e082c9e559092ea2c59a2618411060055f85392995ea11a6868018ff1507615f1f9e49ea9e4f20fbd6e5e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-serbian-apostrophe-doc"

RDEPENDS:${PN} += ""

inherit rpm
