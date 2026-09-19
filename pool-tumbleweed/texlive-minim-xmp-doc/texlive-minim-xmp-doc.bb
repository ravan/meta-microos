SUMMARY = "Documentation for texlive-minim-xmp"
DESCRIPTION = "This package includes the documentation for texlive-minim-xmp"
LICENSE = "LPPL-1.0"

PV = "2026.226.2025_1.4svn73816"

RPM_NAME = "texlive-minim-xmp-doc-2026.226.2025_1.4svn73816-61.2.noarch.rpm"
RPM_HASH = "40fa4670e9559eabde800cbc1769c10a252258d8b03df4d7438b00aaa53e801d9c23ed0b1d9aaca701a5a85b2252ee02ec893757416d68de019cdbc53f0aecf5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-minim-xmp-doc"

RDEPENDS:${PN} += ""

inherit rpm
