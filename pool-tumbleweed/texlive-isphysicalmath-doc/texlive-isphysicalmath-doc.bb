SUMMARY = "Documentation for texlive-isphysicalmath"
DESCRIPTION = "This package includes the documentation for texlive-isphysicalmath"
LICENSE = "LPPL-1.0"

PV = "2026.226.2.0.0svn73239"

RPM_NAME = "texlive-isphysicalmath-doc-2026.226.2.0.0svn73239-63.2.noarch.rpm"
RPM_HASH = "a97048823cb93ed607f6cc0f7a11b003b0041f42dbc9817d30c2162886194f5a63b29df92f3d3a9170e43604eb0775600e19bbc499a05da7a4574d0e772f6b8e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-isphysicalmath-doc"

RDEPENDS:${PN} += ""

inherit rpm
