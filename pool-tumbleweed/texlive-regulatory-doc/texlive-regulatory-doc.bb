SUMMARY = "Documentation for texlive-regulatory"
DESCRIPTION = "This package includes the documentation for texlive-regulatory"
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.0.4svn72197"

RPM_NAME = "texlive-regulatory-doc-2026.226.0.0.0.4svn72197-60.4.noarch.rpm"
RPM_HASH = "2334d3077e2703f0eb15fb4f73ce28d437f1eb5a510693279a2842678e17caf3d4b4f60792c5a356853da03cf48bdcccaacd1a67a2264d64640e37afa3bfdc85"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-texlive-regulatory-doc-nl \
texlive-regulatory-doc"

RDEPENDS:${PN} += ""

inherit rpm
