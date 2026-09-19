SUMMARY = "Documentation for texlive-cvss"
DESCRIPTION = "This package includes the documentation for texlive-cvss"
LICENSE = "LPPL-1.0"

PV = "2026.226.1.1.0svn76924"

RPM_NAME = "texlive-cvss-doc-2026.226.1.1.0svn76924-61.2.noarch.rpm"
RPM_HASH = "d39071606803b777cbab5e3a9385612e5b2cc7e685be4b259a4576d643402dee4f5eba5a6d5935dc674ca640b3a9c22ed0157b7fceb0e5747465ef12c0486fcf"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-cvss-doc"

RDEPENDS:${PN} += ""

inherit rpm
