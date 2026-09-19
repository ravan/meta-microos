SUMMARY = "Documentation for texlive-apptools"
DESCRIPTION = "This package includes the documentation for texlive-apptools"
LICENSE = "LPPL-1.0"

PV = "2026.226.1.0svn77682"

RPM_NAME = "texlive-apptools-doc-2026.226.1.0svn77682-61.2.noarch.rpm"
RPM_HASH = "f27facdaa856f59be7cdc6674f2ddd8df7abdaaae1495c56138f02d2ffc9b35e6fac26f7b92ba5b85995fbbcc144379628de7f44c4d9bf0c473039d92aa9e696"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-apptools-doc"

RDEPENDS:${PN} += ""

inherit rpm
