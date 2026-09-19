SUMMARY = "Documentation for texlive-nonfloat"
DESCRIPTION = "This package includes the documentation for texlive-nonfloat"
LICENSE = "SUSE-Public-Domain"

PV = "2026.226.1.0svn77682"

RPM_NAME = "texlive-nonfloat-doc-2026.226.1.0svn77682-61.2.noarch.rpm"
RPM_HASH = "357980ebec4c4302023cccc35a044c044a59e43842dc845e8f31a9de1ed2b102aaaa7402acf327be4dcb4df3644a6d1f94290978fa7603b59985f7706753a025"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-texlive-nonfloat-doc-en;de \
texlive-nonfloat-doc"

RDEPENDS:${PN} += ""

inherit rpm
