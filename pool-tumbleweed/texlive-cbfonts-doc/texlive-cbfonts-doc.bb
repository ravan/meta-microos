SUMMARY = "Documentation for texlive-cbfonts"
DESCRIPTION = "This package includes the documentation for texlive-cbfonts"
LICENSE = "LPPL-1.0"

PV = "2026.226.svn54080"

RPM_NAME = "texlive-cbfonts-doc-2026.226.svn54080-59.2.noarch.rpm"
RPM_HASH = "5e80eac384f8852e4eadf80566f6000a6e97ea75a6b4e1b536f61f1f331fda88366873d08dae7b31d269ebb2635556432e877f24c48d282acc7860f67b92e368"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-cbfonts-doc"

RDEPENDS:${PN} += ""

inherit rpm
