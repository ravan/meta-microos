SUMMARY = "Documentation for texlive-tkz-euclide"
DESCRIPTION = "This package includes the documentation for texlive-tkz-euclide"
LICENSE = "LPPL-1.0"

PV = "2026.226.5.13csvn77515"

RPM_NAME = "texlive-tkz-euclide-doc-2026.226.5.13csvn77515-59.2.noarch.rpm"
RPM_HASH = "54ed807899534ef680974263bb0664e00bb8a2f174245c55acc2d38dba1f039e33ed533dffa186f9a1ffd1a754ffcc78ac81ba3264e13d7d24ac28eaa9b8cabd"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-tkz-euclide-doc"

RDEPENDS:${PN} += ""

inherit rpm
