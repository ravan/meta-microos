SUMMARY = "Documentation for texlive-luacensor"
DESCRIPTION = "This package includes the documentation for texlive-luacensor"
LICENSE = "LPPL-1.0"

PV = "2026.226.1.1.1svn71922"

RPM_NAME = "texlive-luacensor-doc-2026.226.1.1.1svn71922-59.2.noarch.rpm"
RPM_HASH = "5ad36651479c665667cfe95cbc12ae25542e1d96c394cbde37e951384506fad09c7df3b6e34d4e5eb55cc80a0150a294bf74d4704e8af95582f049c40e84a5d1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-luacensor-doc"

RDEPENDS:${PN} += ""

inherit rpm
