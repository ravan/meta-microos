SUMMARY = "Documentation for texlive-karnaughmap"
DESCRIPTION = "This package includes the documentation for texlive-karnaughmap"
LICENSE = "LPPL-1.0"

PV = "2026.226.2.0svn36989"

RPM_NAME = "texlive-karnaughmap-doc-2026.226.2.0svn36989-63.2.noarch.rpm"
RPM_HASH = "291cba1e106db27eccfaa8cc7a08ee909c492da48ac9eab892e998f0c6a903666f7eb07587ffa0e1c77c6017fa809b988aa4926c096df74f286cc871c8ef2e2e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-karnaughmap-doc"

RDEPENDS:${PN} += ""

inherit rpm
