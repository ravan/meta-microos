SUMMARY = "Documentation for texlive-gtl"
DESCRIPTION = "This package includes the documentation for texlive-gtl"
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.6svn69297"

RPM_NAME = "texlive-gtl-doc-2026.226.0.0.6svn69297-60.4.noarch.rpm"
RPM_HASH = "46138527e50808d54ba2d8d48425a58c99b29ba57d30a0a48df2e79a3d437b656fe32075fc4e467f1882cc451563e8594ea725ec365466aa5abb850a1ae12374"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-gtl-doc"

RDEPENDS:${PN} += ""

inherit rpm
