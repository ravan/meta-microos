SUMMARY = "Documentation for texlive-bbding"
DESCRIPTION = "This package includes the documentation for texlive-bbding"
LICENSE = "LPPL-1.0"

PV = "2026.226.1.01svn77682"

RPM_NAME = "texlive-bbding-doc-2026.226.1.01svn77682-61.2.noarch.rpm"
RPM_HASH = "8f647566778800d7773462f554403c8e97ecd51ce925e01b2acb1081734c633bb1c06168e8f404fb70ad8789e4beeb4bc0ab3cacdae3ff56b9ff7e7e6a199097"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-bbding-doc"

RDEPENDS:${PN} += ""

inherit rpm
