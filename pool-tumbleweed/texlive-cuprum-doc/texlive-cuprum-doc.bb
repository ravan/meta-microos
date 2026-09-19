SUMMARY = "Documentation for texlive-cuprum"
DESCRIPTION = "This package includes the documentation for texlive-cuprum"
LICENSE = "OFL-1.1"

PV = "2026.226.svn77682"

RPM_NAME = "texlive-cuprum-doc-2026.226.svn77682-61.2.noarch.rpm"
RPM_HASH = "9c2b29a900dcb598017a193d8dd69a8be3fe3a69e173c61d8661a223adde46817c6b8d53d6425be5b5636b69821812190d33f69968f431d30a48f0c30bf9b201"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-cuprum-doc"

RDEPENDS:${PN} += ""

inherit rpm
