SUMMARY = "Documentation for texlive-unifith"
DESCRIPTION = "This package includes the documentation for texlive-unifith"
LICENSE = "LPPL-1.0"

PV = "2026.226.1.6svn60698"

RPM_NAME = "texlive-unifith-doc-2026.226.1.6svn60698-60.2.noarch.rpm"
RPM_HASH = "54e4e5b7f441becc07209fa49c720dd7edd6640920ac61ecbe51850c483ae89ef12b60b6d479ef68193ab264a356a3f7d8bf7ae8cfd0e9c721812e60c9cabda1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-unifith-doc"

RDEPENDS:${PN} += ""

inherit rpm
