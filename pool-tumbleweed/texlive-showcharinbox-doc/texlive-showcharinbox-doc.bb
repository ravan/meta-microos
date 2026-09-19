SUMMARY = "Documentation for texlive-showcharinbox"
DESCRIPTION = "This package includes the documentation for texlive-showcharinbox"
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.1svn29803"

RPM_NAME = "texlive-showcharinbox-doc-2026.226.0.0.1svn29803-60.2.noarch.rpm"
RPM_HASH = "230e14a79b0339cb58c03729f7ee6071c5794ae2f0249731484056d7efb06b1b4857e0fe4e11c55539475f9377d5342a218acf9f9828d15090cc4cdf0e439908"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-showcharinbox-doc"

RDEPENDS:${PN} += ""

inherit rpm
