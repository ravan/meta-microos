SUMMARY = "Documentation for texlive-todonotes"
DESCRIPTION = "This package includes the documentation for texlive-todonotes"
LICENSE = "LPPL-1.0"

PV = "2026.226.1.1.7svn77682"

RPM_NAME = "texlive-todonotes-doc-2026.226.1.1.7svn77682-59.2.noarch.rpm"
RPM_HASH = "b2573cd8577b2f8d95cfc219970302c6f853802040a4661b6d44d94bdba57aa910d9b49b836e9a5383b54f2aac4f4cde0e0206e0cf455573b600f6979b5f5d50"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-todonotes-doc"

RDEPENDS:${PN} += ""

inherit rpm
