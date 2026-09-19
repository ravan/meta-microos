SUMMARY = "Documentation for texlive-recipecard"
DESCRIPTION = "This package includes the documentation for texlive-recipecard"
LICENSE = "LPPL-1.0"

PV = "2026.226.2.0svn15878"

RPM_NAME = "texlive-recipecard-doc-2026.226.2.0svn15878-60.4.noarch.rpm"
RPM_HASH = "9a46b5ef187069799a9c4f8a3aa05e7e47a06cb7536a513110fa4b949c2098ffb1a10d3ea9b9de31d71462a9942f8693ab8200cbb19490ee975e910664bb13f0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-recipecard-doc"

RDEPENDS:${PN} += ""

inherit rpm
