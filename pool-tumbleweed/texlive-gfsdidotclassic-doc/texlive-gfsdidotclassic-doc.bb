SUMMARY = "Documentation for texlive-gfsdidotclassic"
DESCRIPTION = "This package includes the documentation for texlive-gfsdidotclassic"
LICENSE = "OFL-1.1"

PV = "2026.226.001.001svn52778"

RPM_NAME = "texlive-gfsdidotclassic-doc-2026.226.001.001svn52778-60.2.noarch.rpm"
RPM_HASH = "c40922826bbed785eacb744872cbb284f393913a6767b5b811b8c28ff817cdb3c7d01c297a803cb4359d29619653aa4a954552739b1ba5bdd0c4b8e8801b3cec"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-gfsdidotclassic-doc"

RDEPENDS:${PN} += ""

inherit rpm
