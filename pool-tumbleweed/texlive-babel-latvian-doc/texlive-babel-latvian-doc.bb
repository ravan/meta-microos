SUMMARY = "Documentation for texlive-babel-latvian"
DESCRIPTION = "This package includes the documentation for texlive-babel-latvian"
LICENSE = "LPPL-1.0"

PV = "2026.226.2.0csvn71108"

RPM_NAME = "texlive-babel-latvian-doc-2026.226.2.0csvn71108-60.2.noarch.rpm"
RPM_HASH = "5d71dea60bc1c6bbfa8dcd4d3fcc802f70cb473624d8ebeb4e3c44ed8fe1ec88d8a0d8500daef45eb4af301d9867baefc9187306c6817521e29e512f0366de10"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-babel-latvian-doc"

RDEPENDS:${PN} += ""

inherit rpm
