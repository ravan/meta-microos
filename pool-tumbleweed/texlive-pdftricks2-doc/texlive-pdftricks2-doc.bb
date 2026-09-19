SUMMARY = "Documentation for texlive-pdftricks2"
DESCRIPTION = "This package includes the documentation for texlive-pdftricks2"
LICENSE = "GPL-2.0-or-later"

PV = "2026.226.1.01svn31016"

RPM_NAME = "texlive-pdftricks2-doc-2026.226.1.01svn31016-58.2.noarch.rpm"
RPM_HASH = "18718df0d9fc791fa76a39a363e1aad9fe50158613e75c105e7c35009ddbe3fcb538a96efeed3513922346a0a3bb5cfd14fdac435cbd9ce9b79ce74ca51375e8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-pdftricks2-doc"

RDEPENDS:${PN} += ""

inherit rpm
