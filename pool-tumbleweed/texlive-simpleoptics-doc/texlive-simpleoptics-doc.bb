SUMMARY = "Documentation for texlive-simpleoptics"
DESCRIPTION = "This package includes the documentation for texlive-simpleoptics"
LICENSE = "LPPL-1.0"

PV = "2026.226.1.1.1svn62977"

RPM_NAME = "texlive-simpleoptics-doc-2026.226.1.1.1svn62977-60.2.noarch.rpm"
RPM_HASH = "5e678932f77f1a786294406265334927835bfd5d067363a3600c116ac0cc5472c565811891e13f7ae520106c48cc1cd093ad48ae2af940e79a7551a230895cae"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-simpleoptics-doc"

RDEPENDS:${PN} += ""

inherit rpm
