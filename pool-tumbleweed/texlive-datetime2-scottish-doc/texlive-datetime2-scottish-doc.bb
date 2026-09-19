SUMMARY = "Documentation for texlive-datetime2-scottish"
DESCRIPTION = "This package includes the documentation for texlive-datetime2-scottish"
LICENSE = "LPPL-1.0"

PV = "2026.226.1.1svn52101"

RPM_NAME = "texlive-datetime2-scottish-doc-2026.226.1.1svn52101-59.2.noarch.rpm"
RPM_HASH = "ea56189b0c6d0bf1ec16bcf5c16588474bb76d6a695cd6cd57aaaad435a8ce8cbc6c29a76d05cb599001e2ccc11264e58c39e05b86d80a3c0b1c4a9657fdaf71"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-datetime2-scottish-doc"

RDEPENDS:${PN} += ""

inherit rpm
