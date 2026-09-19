SUMMARY = "Documentation for texlive-tikzpeople"
DESCRIPTION = "This package includes the documentation for texlive-tikzpeople"
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.4svn67840"

RPM_NAME = "texlive-tikzpeople-doc-2026.226.0.0.4svn67840-59.2.noarch.rpm"
RPM_HASH = "84a4e8d8cb66a8375520fda54015eba5c62721e8a94780dd56e802948edd87edd366a8eb599270468af17e157e3e997b5037d703159e831373490f52a83c2cc3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-tikzpeople-doc"

RDEPENDS:${PN} += ""

inherit rpm
