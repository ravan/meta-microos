SUMMARY = "Documentation for texlive-mercatormap"
DESCRIPTION = "This package includes the documentation for texlive-mercatormap"
LICENSE = "LPPL-1.0"

PV = "2026.226.1.3.0svn77981"

RPM_NAME = "texlive-mercatormap-doc-2026.226.1.3.0svn77981-61.2.noarch.rpm"
RPM_HASH = "696a28b003d89f1d32cf395753b9e51af588db2b38b8846b8ec5b15fc2086ad292b64215fa910bb808e15dbb79157439ab340b75a8ff67e43db3ae4c0d6862c2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-mercatormap-doc"

RDEPENDS:${PN} += ""

inherit rpm
