SUMMARY = "Documentation for texlive-pgf"
DESCRIPTION = "This package includes the documentation for texlive-pgf"
LICENSE = "LPPL-1.0"

PV = "2026.226.3.1.11asvn78101"

RPM_NAME = "texlive-pgf-doc-2026.226.3.1.11asvn78101-58.2.noarch.rpm"
RPM_HASH = "716405144e9169fdca5508ba44e759cfeee5819b227f6bce0494f07d1b66ec0b1d8769f87ae6c439128952a8739d3dce41b854a775b0ab6a5a667edbfa75b59b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-pgf-doc"

RDEPENDS:${PN} += ""

inherit rpm
