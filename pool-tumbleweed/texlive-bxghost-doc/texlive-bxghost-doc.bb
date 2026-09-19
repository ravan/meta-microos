SUMMARY = "Documentation for texlive-bxghost"
DESCRIPTION = "This package includes the documentation for texlive-bxghost"
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.5.1svn66147"

RPM_NAME = "texlive-bxghost-doc-2026.226.0.0.5.1svn66147-59.2.noarch.rpm"
RPM_HASH = "7e93c29ccdfaa5f406043f4df7bf0133af8e192cc988ef488295b450eb086ef854e38648141f5577a31a4fd2198066b260854d4e6089c7371d894e45dcea6dcb"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-bxghost-doc"

RDEPENDS:${PN} += ""

inherit rpm
