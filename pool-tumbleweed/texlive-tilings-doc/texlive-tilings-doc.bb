SUMMARY = "Documentation for texlive-tilings"
DESCRIPTION = "This package includes the documentation for texlive-tilings"
LICENSE = "LPPL-1.0"

PV = "2026.226.2.0svn76924"

RPM_NAME = "texlive-tilings-doc-2026.226.2.0svn76924-59.2.noarch.rpm"
RPM_HASH = "a974ff23f3570cfacdcc5753181e12e7188f9380a7df8c753cc5d9213ddd7d06ec3fb476d9eae1e632d7a73bed839b483381448529f7904791107962996e5e3a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-tilings-doc"

RDEPENDS:${PN} += ""

inherit rpm
