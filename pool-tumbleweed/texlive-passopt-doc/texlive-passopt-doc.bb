SUMMARY = "Documentation for texlive-passopt"
DESCRIPTION = "This package includes the documentation for texlive-passopt"
LICENSE = "LPPL-1.0"

PV = "2026.226.1.01csvn76924"

RPM_NAME = "texlive-passopt-doc-2026.226.1.01csvn76924-58.2.noarch.rpm"
RPM_HASH = "c50b635311f56a260f8b9f63374e599c978b60d92beb296ff0ade081cccfe8e97d85faa075c663a59e151e2c6ec27a2ee9375c6ce9a3fd81d07256ecf8241adf"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-passopt-doc"

RDEPENDS:${PN} += ""

inherit rpm
