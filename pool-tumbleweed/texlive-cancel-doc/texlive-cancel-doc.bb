SUMMARY = "Documentation for texlive-cancel"
DESCRIPTION = "This package includes the documentation for texlive-cancel"
LICENSE = "SUSE-Public-Domain"

PV = "2026.226.2.2svn77682"

RPM_NAME = "texlive-cancel-doc-2026.226.2.2svn77682-59.2.noarch.rpm"
RPM_HASH = "1780d02144c2fc4876c2ecd9903ece4df3df813c4f41fc813d0b74f290a26ce269283e75ccd8b85736ebaa5b05ca6e1a6f561b88c59c3393e7617d6f9c3aa195"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-cancel-doc"

RDEPENDS:${PN} += ""

inherit rpm
