SUMMARY = "Documentation for texlive-coop-writing"
DESCRIPTION = "This package includes the documentation for texlive-coop-writing"
LICENSE = "LPPL-1.0"

PV = "2026.226.1.2.4svn76924"

RPM_NAME = "texlive-coop-writing-doc-2026.226.1.2.4svn76924-61.2.noarch.rpm"
RPM_HASH = "7cfe100652d6cf6b0c16ca9172adf51eba05a1d14dc391c4670d6faef95a29d0fea11049758afbde499787668cb87cce6b62bb4faac6915162fad0715350b2f8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-coop-writing-doc"

RDEPENDS:${PN} += ""

inherit rpm
