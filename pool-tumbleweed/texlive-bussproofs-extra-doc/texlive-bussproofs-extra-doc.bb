SUMMARY = "Documentation for texlive-bussproofs-extra"
DESCRIPTION = "This package includes the documentation for texlive-bussproofs-extra"
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.4svn51299"

RPM_NAME = "texlive-bussproofs-extra-doc-2026.226.0.0.4svn51299-59.2.noarch.rpm"
RPM_HASH = "12ee65201c9b882d7fb04aeaf5fca8b928d57c8398b824274dc619be0256ab481facbb4cdd4208d4a5bd0841542a7826377d4ee42ef088da956a3a13d98b9293"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-bussproofs-extra-doc"

RDEPENDS:${PN} += ""

inherit rpm
