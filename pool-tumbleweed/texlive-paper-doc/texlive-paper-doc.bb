SUMMARY = "Documentation for texlive-paper"
DESCRIPTION = "This package includes the documentation for texlive-paper"
LICENSE = "GPL-2.0-or-later"

PV = "2026.226.1.0lsvn34521"

RPM_NAME = "texlive-paper-doc-2026.226.1.0lsvn34521-58.2.noarch.rpm"
RPM_HASH = "2514e5f8c05f238a05fa29e2112531742bad39731fa1e023f933446c5e6a49200c6250e427d9d719f0722dc5e8e12bfcf1b2183c042da528257ab188d8be46e3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-texlive-paper-doc-de \
texlive-paper-doc"

RDEPENDS:${PN} += ""

inherit rpm
