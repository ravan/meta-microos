SUMMARY = "Documentation for texlive-exsol"
DESCRIPTION = "This package includes the documentation for texlive-exsol"
LICENSE = "LPPL-1.0"

PV = "2026.226.1.7svn73982"

RPM_NAME = "texlive-exsol-doc-2026.226.1.7svn73982-59.2.noarch.rpm"
RPM_HASH = "0b423399b75b3f4a36fd7524f7e0edfa89386abf8202036d24b19a02e8b87d632e652da687fdae59c9a31d3750ca4021a499384768123a09be12ede8e35a4cd7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-exsol-doc"

RDEPENDS:${PN} += ""

inherit rpm
