SUMMARY = "Documentation for texlive-upzhkinsoku"
DESCRIPTION = "This package includes the documentation for texlive-upzhkinsoku"
LICENSE = "SUSE-TeX"

PV = "2026.226.0.0.5svn47354"

RPM_NAME = "texlive-upzhkinsoku-doc-2026.226.0.0.5svn47354-60.2.noarch.rpm"
RPM_HASH = "eac2bb18a7248de24b6378213466f68266996b3e9516548139309dd9b1bfe47b3f540dd13e5a8b995bfefc3ffa89048f3456e52e371520d4ebf917830d322a9e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-upzhkinsoku-doc"

RDEPENDS:${PN} += ""

inherit rpm
