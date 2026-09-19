SUMMARY = "Documentation for texlive-plnfss"
DESCRIPTION = "This package includes the documentation for texlive-plnfss"
LICENSE = "LPPL-1.0"

PV = "2026.226.1.1svn15878"

RPM_NAME = "texlive-plnfss-doc-2026.226.1.1svn15878-59.2.noarch.rpm"
RPM_HASH = "2ee9fe81e049d70ded10d22fad999cf7da4424429da21e29fcb1b5f32447f6cc13e629765c1f0e9b34c0b6248eed8723163dc236793e6f7384b2c997242fae17"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-plnfss-doc"

RDEPENDS:${PN} += ""

inherit rpm
