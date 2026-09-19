SUMMARY = "Documentation for texlive-fdsymbol"
DESCRIPTION = "This package includes the documentation for texlive-fdsymbol"
LICENSE = "OFL-1.1"

PV = "2026.226.1.0svn77682"

RPM_NAME = "texlive-fdsymbol-doc-2026.226.1.0svn77682-59.2.noarch.rpm"
RPM_HASH = "1b5d7066f8340eaebc152f46c055aab62cc1bb5aaf4ab04982447d16eca59cbbfd1ef3065871a1a6e2cec8f39b5a2600265910d3d7d686b29ef2c928d3699d21"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-fdsymbol-doc"

RDEPENDS:${PN} += ""

inherit rpm
