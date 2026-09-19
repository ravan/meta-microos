SUMMARY = "Documentation for texlive-mpfonts"
DESCRIPTION = "This package includes the documentation for texlive-mpfonts"
LICENSE = "SUSE-TeX"

PV = "2026.226.svn54512"

RPM_NAME = "texlive-mpfonts-doc-2026.226.svn54512-61.2.noarch.rpm"
RPM_HASH = "7e26ada22ee83d432403feea24c104deda3b9f9284e360b9e5c2bec8212e930af7668e8790bc5291ee56b58b4de3bd496e813e75041b56bad8bbae1d4e184d47"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-mpfonts-doc"

RDEPENDS:${PN} += ""

inherit rpm
