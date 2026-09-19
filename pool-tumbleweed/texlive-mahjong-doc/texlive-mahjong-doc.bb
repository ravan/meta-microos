SUMMARY = "Documentation for texlive-mahjong"
DESCRIPTION = "This package includes the documentation for texlive-mahjong"
LICENSE = "LPPL-1.0"

PV = "2026.226.1.1svn76924"

RPM_NAME = "texlive-mahjong-doc-2026.226.1.1svn76924-59.2.noarch.rpm"
RPM_HASH = "f0b0479bb9ad8abfe1295019841083bc7a21a741029f08eb0ccb2ce1145e8f52ee03847829a65ed3834a7f3f865e3a2b1604fd2df334a035111a8050e8adebc6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-mahjong-doc"

RDEPENDS:${PN} += ""

inherit rpm
