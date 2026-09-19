SUMMARY = "Documentation for texlive-tikz-nef"
DESCRIPTION = "This package includes the documentation for texlive-tikz-nef"
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.1svn55920"

RPM_NAME = "texlive-tikz-nef-doc-2026.226.0.0.1svn55920-59.2.noarch.rpm"
RPM_HASH = "ed087ba0e1f7e43157a422b7312a1f55d58c5171e03ad7db9e589d41a1302fa36d905c5e12971bf36cb8683cb36e8a728404857b9577e8a7144219605e4efa86"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-tikz-nef-doc"

RDEPENDS:${PN} += ""

inherit rpm
