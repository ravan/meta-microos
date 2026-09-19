SUMMARY = "Documentation for texlive-bbm"
DESCRIPTION = "This package includes the documentation for texlive-bbm"
LICENSE = "LPPL-1.0"

PV = "2026.226.svn77682"

RPM_NAME = "texlive-bbm-doc-2026.226.svn77682-61.2.noarch.rpm"
RPM_HASH = "d29aaf9283e00c659cab56d45bad4435c72fa1d4ae00f1820d4a839fb74491c4a4ec27edfc0679fc415855ec3f35512c46375eb886cb1ffc9eb252106c07f33a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-bbm-doc"

RDEPENDS:${PN} += ""

inherit rpm
