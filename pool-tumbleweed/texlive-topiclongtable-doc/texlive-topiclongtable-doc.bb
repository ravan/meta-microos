SUMMARY = "Documentation for texlive-topiclongtable"
DESCRIPTION = "This package includes the documentation for texlive-topiclongtable"
LICENSE = "LPPL-1.0"

PV = "2026.226.1.3.2svn76924"

RPM_NAME = "texlive-topiclongtable-doc-2026.226.1.3.2svn76924-59.2.noarch.rpm"
RPM_HASH = "0b6d196460335b6e3fbf89a1a3caa31c4feec750bbd6023b23f866cd0f5434e396b337c5c006ed13e65ef1e917d2ceac5fdb8757c6381bc5b24f6e4ef0394b03"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-topiclongtable-doc"

RDEPENDS:${PN} += ""

inherit rpm
