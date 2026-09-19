SUMMARY = "Documentation for texlive-sidenotesplus"
DESCRIPTION = "This package includes the documentation for texlive-sidenotesplus"
LICENSE = "LPPL-1.0"

PV = "2026.226.1.05svn74143"

RPM_NAME = "texlive-sidenotesplus-doc-2026.226.1.05svn74143-60.2.noarch.rpm"
RPM_HASH = "4bb216aefbffbecfcce5444c967862489b200b917f9738229208c5f954edc3544131428f62a991407334f5c9f6dafdc9e2e063eb69dbc7a37ac3fffe86e8ff8b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-sidenotesplus-doc"

RDEPENDS:${PN} += ""

inherit rpm
