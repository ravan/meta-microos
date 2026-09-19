SUMMARY = "Documentation for texlive-ycbook"
DESCRIPTION = "This package includes the documentation for texlive-ycbook"
LICENSE = "LPPL-1.0"

PV = "2026.226.svn46201"

RPM_NAME = "texlive-ycbook-doc-2026.226.svn46201-59.4.noarch.rpm"
RPM_HASH = "1190232b67e113a34faa65d1dc0c7b09f0df0b53602052441079d283d1b717dde96bf8809f9d764b5971781523967e12ba6b3c9812a41a8c4c2819269c07c1f7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-ycbook-doc"

RDEPENDS:${PN} += ""

inherit rpm
