SUMMARY = "Documentation for texlive-luaimageembed"
DESCRIPTION = "This package includes the documentation for texlive-luaimageembed"
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.1svn50788"

RPM_NAME = "texlive-luaimageembed-doc-2026.226.0.0.1svn50788-59.2.noarch.rpm"
RPM_HASH = "83b419be55a3be2af9edc0bda98463376d8cbc3644a0d806b06dfdb608cd88b440331ea86ee854f200ea53cbf7f66426b86c1f03be447eb3b518727ebc9c6904"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-luaimageembed-doc"

RDEPENDS:${PN} += ""

inherit rpm
