SUMMARY = "Documentation for texlive-bredzenie"
DESCRIPTION = "This package includes the documentation for texlive-bredzenie"
LICENSE = "LPPL-1.0"

PV = "2026.226.1.0svn44371"

RPM_NAME = "texlive-bredzenie-doc-2026.226.1.0svn44371-59.2.noarch.rpm"
RPM_HASH = "4242ec83ca605b4a14fec9cd837ace02ad4051021be1e21fdaf3959772e0a9ac8c7be9680217e27acf75a94d9470c3e477b05dcd3749c0e715a1aea223a4ddb5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-bredzenie-doc"

RDEPENDS:${PN} += ""

inherit rpm
